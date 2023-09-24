package org.maven;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
      Student st1 = (Student)  context.getBean("student1");
      Student  st2 = (Student) context.getBean("student2");
      System.out.println(st1);
      System.out.println(st2);
    }
}
