package com.test.three;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Performer;

public class TestAutowired {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-three.xml");
        Performer preformer = (Performer) ctx.getBean("Ketty3");
        preformer.perform();
    }
}
