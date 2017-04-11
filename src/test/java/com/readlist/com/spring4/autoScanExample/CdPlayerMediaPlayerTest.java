package com.readlist.com.spring4.autoScanExample;

import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by luis on 4/7/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerMediaPlayer.class)
public class CdPlayerMediaPlayerTest  {

    @Rule
    public final SystemOutRule log =
            new SystemOutRule();
    @Autowired
    private MediaPlayer player;

    @Autowired
    private com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CompactDics cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

}
