package com.readlist.com.spring4.ambiguity.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by luis on 4/11/2017.
 */
public class CreateDessert {

    private Dessert dessert;

    @Autowired
    public void setDessertPrimary(Dessert dessert){
        this.dessert = dessert;
    }


}
