package com.test.one;

import com.test.Instrument;
import com.test.Performer;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return this.song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public Instrumentalist() {
    }

    public void perform() {
        System.out.println("Playing " + song);
        instrument.play();
    }
}
