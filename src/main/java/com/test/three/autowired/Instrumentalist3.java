package com.test.three.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.test.Instrument;
import com.test.Performer;
import com.test.three.autowired.StringedInstrument;

public class Instrumentalist3 implements Performer {

    @Value("Love Song 3")
    private String song;

    // 1. Autowired 可以无视 private
    // 2. required=false 表示如果没有找到匹配的 bean （如没有或者有多个）则不自动装配，会设置为 null。
    // 3. Qualifier 来限定取固定的 bean，这里指 ID 或者是其他的注解
    // 4. TODO 注意：自动装配是在 xml 中加入了“context:component-scan”才生效的！！！
    @Autowired(required=false)
    @Qualifier("guitar")
    private Instrument instrument;

    @Autowired
    @Qualifier("stringed")
    private Instrument instrument3;

    // 使用了自定义注解
    @Autowired
    @StringedInstrument
    private Instrument instrument3_2;

    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return this.song;
    }

    public Instrumentalist3() {
    }

    public void perform() {
        System.out.println("Playing " + song);
        instrument.play();
        instrument3.play();
        instrument3_2.play();
    }
}
