package com.test.three;

import com.test.Song;

public class SomeSong implements Song {

    public SomeSong(Song song) {
        System.out.println("This is some song..");
    }

    public void sing() {
    }
}
