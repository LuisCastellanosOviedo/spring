package com.readlist.com.spring4.autoScanExample;

import com.readlist.com.spring4.autoScanExample.spring4.commons.CDplayer.CdPlayerMediaPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luis on 4/7/2017.
 */
@Configuration
@ComponentScan(basePackageClasses = CdPlayerMediaPlayer.class)
public class CdPlayerConfig {
}
