package com.injection.advances.wiring.conditionalBeans;

import com.readlist.Book;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by luis on 4/10/2017.
 */
public class MagicExistCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env =conditionContext.getEnvironment();
        // fix this with env bean XD
        //return env.containsProperty("magicalBean", Boolean.class,true);
        return env.getProperty("magicalBean",Boolean.class,true);
    }
}
