package com.test;

public class Stage {
    private Stage() {
        System.out.println("I'm stage.");
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    private static Stage getInstance() {
        return StageSingletonHolder.instance;
    }

    public void turnOn() {
        System.out.println("Turn on..");
    }
    
    public void turnOff() {
        System.out.println("Turn off...");
    }
}
