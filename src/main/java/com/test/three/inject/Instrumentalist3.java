package com.test.three.inject;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Value;

import com.test.Instrument;
import com.test.Performer;

public class Instrumentalist3 implements Performer {

    @Value("Love Song 3")
    private String song;

    // 为了使用 Inject 还单独在 pom.xml中加入了新的 dependency:javax.inject
    @Inject
    private Set<Instrument> instruments;

    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return this.song;
    }

    public Instrumentalist3(Provider<Instrument> instrumentProvider) {
        instruments = new HashSet<Instrument>();
        for (int i = 0; i < 5; i++) {
            instruments.add(instrumentProvider.get());
        }
    }

    public void perform() {
        System.out.println("Playing " + song);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
