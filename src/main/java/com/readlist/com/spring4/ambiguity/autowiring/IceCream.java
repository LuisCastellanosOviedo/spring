package com.readlist.com.spring4.ambiguity.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/11/2017.
 */
@Component
@Qualifier("cold")
public class IceCream implements Dessert {
}
