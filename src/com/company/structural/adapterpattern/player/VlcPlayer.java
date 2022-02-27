package com.company.structural.adapterpattern.player;

import com.company.structural.adapterpattern.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc media playing with filename:: " + fileName);
    }
}
