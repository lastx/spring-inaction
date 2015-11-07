package com.test;

public class SingSkiller extends Skiller {
    private Song song;
    
    public SingSkiller(Song song) {
        super();
        this.song = song;
    }

    public SingSkiller(int size, Song song) {
        super(size);
        this.song = song;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("He is singing...");
        song.sing();
    }
}
