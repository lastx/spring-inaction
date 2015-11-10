package com.test.three.inject;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Value;

import com.test.Instrument;
import com.test.Performer;
import com.test.three.autowired.StringedInstrument;

public class Instrumentalist3 implements Performer {

    /**
     * 有3点需要注意：
     * 1. 这里引用系统属性，要用 $ 而不是 #
     * 2. 对应的 xml（spring-three.xml）中必须引入对系统的 bean，否则对应 string的值就是这个 key了
     * <bean id="propertyConfigurer" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"/>
     * 3. 也可以是系统环境变量，如 {HOME}
     */
    @Value("${java.runtime.name}")
    private String song;

    // 为了使用 Inject 还单独在 pom.xml中加入了新的 dependency:javax.inject
    @Inject
    @StringedInstrument
    private Instrument instrument;

    @Inject
    private Provider<GuitarProvider> guitarInjects;

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

        for (int i = 0; i < 4; i++) {
            guitarInjects.get().play();  // 对于 Scope=prototype 的可以看到有4个不同的实例
        }
    }
}
