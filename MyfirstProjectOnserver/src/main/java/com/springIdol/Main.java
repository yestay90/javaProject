package com.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 28.09.14.
 */

// TODO:Создать класс певец,чтобы плавал




public class Main {


    public static void main(String[] args)  throws PerformanceException{

        ApplicationContext ct = new ClassPathXmlApplicationContext("performerConfig.xml");

Performer per = (Performer) ct.getBean("kenny");

per.perform();


    }



}
