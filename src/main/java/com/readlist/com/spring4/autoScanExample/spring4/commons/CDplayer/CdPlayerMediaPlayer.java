package com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer;

import com.readlist.com.spring4.autoScanExample.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/7/2017.
 */
@Component
@ComponentScan
public class CdPlayerMediaPlayer implements MediaPlayer {


    private CompactDics compactDics;

// code gen  --> alt + insert

    @Autowired
    public CdPlayerMediaPlayer(CompactDics compactDics) {
        this.compactDics = compactDics;
    }

    @Override
    public void play() {
        compactDics.play();
    }
}
