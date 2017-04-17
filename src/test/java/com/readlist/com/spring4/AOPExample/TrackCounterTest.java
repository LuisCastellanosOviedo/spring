package com.readlist.com.spring4.AOPExample;

import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CompactDics;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by luis on 4/17/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {

    @Rule
    public final SystemOutRule log =
            new SystemOutRule();
    @Autowired
    private CompactDics cd;

    @Autowired
    private TrackCounter counter;
    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);

        assertEquals(1, counter.getPlayCount(1));
        assertEquals(1, counter.getPlayCount(2));
        assertEquals(4, counter.getPlayCount(3));
        assertEquals(0, counter.getPlayCount(4));
        assertEquals(0, counter.getPlayCount(5));

    }
}
