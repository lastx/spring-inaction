package com.test.one;

import com.test.Performer;

public class Skiller implements Performer {

    private int size = 3;

    public Skiller() {
    }

    public Skiller(int size) {
        this.size = size;
        }

    public void perform() {
        System.out.println("Skiller: " + size);
    }
}
