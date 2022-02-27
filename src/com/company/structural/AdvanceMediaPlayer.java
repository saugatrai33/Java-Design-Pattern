package com.company.structural;

public interface AdvanceMediaPlayer {
    public default void playVlc(String fileName) {
    }

    default public void playMp4(String fileName) {
    }
}
