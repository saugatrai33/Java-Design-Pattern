package com.company.structural;

import com.company.structural.player.Mp4Player;
import com.company.structural.player.VlcPlayer;

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
