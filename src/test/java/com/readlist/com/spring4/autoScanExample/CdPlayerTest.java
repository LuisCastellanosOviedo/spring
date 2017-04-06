package com.readlist.com.spring4.autoScanExample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import static org.junit.Assert.*;

/**
 * Created by luis on 4/6/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayer.class)
public class CdPlayerTest {

    @Autowired
    private CompactDics compactDics;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDics);
    }
}
