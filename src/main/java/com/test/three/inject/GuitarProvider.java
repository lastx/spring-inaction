package com.test.three.inject;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.test.Instrument;

/**
 * 这里用 scope 限定了 GuitarProvider 每次都是一个新的实例。
 * @author xumeng
 */
@Scope("prototype")
@Named
public class GuitarProvider implements Instrument {

    public void play() {
        System.out.println("I'm GuitarInject:" + this);
    }
}
