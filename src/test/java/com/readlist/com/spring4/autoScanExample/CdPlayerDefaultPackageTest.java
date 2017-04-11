package com.readlist.com.spring4.autoScanExample;

import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CdPlayerDefaultPackage;
import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CompactDics;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by luis on 4/7/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerDefaultPackage.class)
public class CdPlayerDefaultPackageTest  {


    @Autowired
    private CompactDics compactDics;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDics);
    }

}
