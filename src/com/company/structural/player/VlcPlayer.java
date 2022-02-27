package com.company.structural.player;

import com.company.structural.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc media playing with filename:: " + fileName);
    }
}
