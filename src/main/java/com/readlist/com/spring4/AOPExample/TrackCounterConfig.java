package com.readlist.com.spring4.AOPExample;

import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CompactDics;
import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 4/17/2017.
 */

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDics sgtPeppers(){

        SgtPeppers sgtPeppers  = new SgtPeppers();
        sgtPeppers.setArtist("artista nuevo ");
        sgtPeppers.setTitle("tittle nuevo ");
        List<String> tracks  = new ArrayList();


        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        sgtPeppers.setTracks(tracks);

        return sgtPeppers;

    }

    @Bean
     public TrackCounter trackCounter(){
        return new TrackCounter();
     }

}
