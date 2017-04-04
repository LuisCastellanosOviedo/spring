package com.readlist.com.conditionPoc;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by luis on 4/4/2017.
 */
public class JdbcTemplateCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            conditionContext.getClassLoader().loadClass( "org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
