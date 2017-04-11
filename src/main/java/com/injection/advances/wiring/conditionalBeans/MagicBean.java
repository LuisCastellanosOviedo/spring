package com.injection.advances.wiring.conditionalBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/10/2017.
 */

@Component
@Configuration
public class MagicBean {

    @Bean(name = "magicalBean")
    @Conditional(MagicExistCondition.class)
    public MagicalBean MagicalBean(){
        return new MagicalBean();
    }
}
