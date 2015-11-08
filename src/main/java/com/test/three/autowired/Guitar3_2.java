package com.test.three.autowired;

import org.springframework.stereotype.Component;

import com.test.Instrument;

/**
 * 1. 用了自定义注解
 * 2. 用了 Component 是为了让该类自动生成 bean
 * @author xumeng
 */
@StringedInstrument
@Component
public class Guitar3_2 implements Instrument {

    public void play() {
        System.out.println("I'm Guitar3_2 ~~~");
    }
}
