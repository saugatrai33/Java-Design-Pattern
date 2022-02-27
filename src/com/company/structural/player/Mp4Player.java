package com.company.structural.player;

import com.company.structural.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 playing with filename:: " + fileName);
    }
}
