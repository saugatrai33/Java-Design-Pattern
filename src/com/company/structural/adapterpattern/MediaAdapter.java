package com.company.structural.adapterpattern;

import com.company.structural.adapterpattern.player.Mp4Player;
import com.company.structural.adapterpattern.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc("abc.vlc");
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4("abc.mp4");
        }
    }
}
