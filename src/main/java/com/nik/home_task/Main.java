package com.nik.home_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");

// создаем 2 студента и даем им имена. Убеждаемся что имена одинаковые, ведь обьект сингтон
        Student s1 = (Student) cont.getBean("student_single");
        Student s2 = (Student) cont.getBean("student_single");

        s2.setName("новое имя");

        System.out.println(s1);

// создаем еще 2 студента и даем им имена. Они действительно разные ведь это 2 разных обьекта
        Student s3 = (Student) cont.getBean("student_proto");
        Student s4 = (Student) cont.getBean("student_proto");

        s3.setName("назовем студента");

        System.out.println(s4);
    }
}
