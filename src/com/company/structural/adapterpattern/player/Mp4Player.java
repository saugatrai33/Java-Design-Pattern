package com.company.structural.adapterpattern.player;

import com.company.structural.adapterpattern.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 playing with filename:: " + fileName);
    }
}
