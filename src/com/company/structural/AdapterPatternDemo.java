package com.company.structural;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "we-don't-talk-anymore.mp3");
        audioPlayer.play("mp4", "hello.mp4");
        audioPlayer.play("avi", "abc.avi");
        audioPlayer.play("vlc", "xyz.avi");
    }
}
