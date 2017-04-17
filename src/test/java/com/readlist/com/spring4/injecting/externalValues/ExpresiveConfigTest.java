package com.readlist.com.spring4.injecting.externalValues;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by luis on 4/11/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpresiveConfig.class)
public class ExpresiveConfigTest {


    @Autowired
    ExpresiveConfig expresiveConfig;


    @Test
    public void testCreateBeanByEnviromentProperties() throws Exception {
        assertNotNull(expresiveConfig.CreatePersonaByEnviroment());

    }
}
