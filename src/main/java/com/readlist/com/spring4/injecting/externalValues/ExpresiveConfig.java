package com.readlist.com.spring4.injecting.externalValues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by luis on 4/11/2017.
 */
@Configuration
@PropertySource("classpath:/app.properties")
public class ExpresiveConfig {

    @Autowired
    Environment environment;

    @Bean
    public Persona CreatePersonaByEnviroment(){
        return new Persona(environment.getProperty("name"),Integer.valueOf(environment.getProperty("age")) );
    }

}
