package com.test.p4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Performer;

/**
 * 1. 需要加新的 pom 依赖，不然 class not found
 * 2. expression 表达式要正确:注意要拼写对“execution”
 * @author xumeng
 */
public class TestAop {

    @Test
    public void test() {
        // System.getProperties().list(System.out);

        // System.out.println(System.getenv());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-p4.xml");
        Performer preformer = (Performer) ctx.getBean("Ketty3-1");
        preformer.perform();
    }
}
