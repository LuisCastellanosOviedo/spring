package com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer;

import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/7/2017.
 */
@Component
public class SgtPeppers  implements CompactDics {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
