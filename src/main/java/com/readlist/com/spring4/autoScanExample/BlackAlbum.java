package com.readlist.com.spring4.autoScanExample;

import org.springframework.stereotype.Component;

/**
 * Created by luis on 4/11/2017.
 */
@Component
public class BlackAlbum implements  CompactDics {


    @Override
    public void play() {
                System.out.println("METALLICA");
    }
}
