package com.injection.advances.wiring.conditionalBeans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * Created by luis on 4/10/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicBean.class)
@Profile("dev")
public class MagicBeanTest  {

    @Autowired
    private MagicBean magicBean;


    @Test
    public void conditionalBeanTest(){
        assertNotNull(magicBean.MagicalBean());
    }
}
