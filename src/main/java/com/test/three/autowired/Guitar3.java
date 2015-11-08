package com.test.three.autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import com.test.Instrument;

/**
 * 用“Qualifier给该类标注了 stringed 的注解，可以用在自动装配的 Qualifier 中”
 * @author xumeng
 */
@Qualifier("stringed")
public class Guitar3 implements Instrument {

    public void play() {
        System.out.println("I'm Guitar3!!!");
    }
}
