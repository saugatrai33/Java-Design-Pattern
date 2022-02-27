package com.company.structural.adapterpattern;

public interface AdvanceMediaPlayer {
    public default void playVlc(String fileName) {
    }

    default public void playMp4(String fileName) {
    }
}
