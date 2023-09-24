package org.maven.constructorin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cmain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("con.xml");
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1.toString());
    }
}
