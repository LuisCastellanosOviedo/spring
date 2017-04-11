package com.readlist.com.spring4.ambiguity.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by luis on 4/11/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Dessert.class)
public class CreateDessertTest {

    @Autowired
    private Dessert dessertCookies;


    @Autowired
    @Qualifier("iceCream")
    private Dessert dessertIceCream;

    @Autowired
    @Qualifier("cold")
    private Dessert dessertIceCreamCold;

    @Autowired
    @AnnotationCakeInject
    private Dessert dessertCake;


    @Test
    public void testPrimaryImpl(){
        assertNotNull(dessertCookies);
    }

    @Test
    public void testQualifier(){
        assertNotNull(dessertIceCream);
    }

    @Test
    public void testComponentQuelifer() {
        assertNotNull(dessertIceCreamCold);
    }

    @Test
    public void testInjectByAnnotation() throws Exception {
        assertNotNull(dessertCake);

    }
}
