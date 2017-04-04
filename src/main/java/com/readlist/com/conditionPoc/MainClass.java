package com.readlist.com.conditionPoc;

import org.springframework.context.annotation.Conditional;

/**
 * Created by luis on 4/4/2017.
 */

@Conditional(JdbcTemplateCondition.class)
public class MainClass {


    public MyService myService;
}
