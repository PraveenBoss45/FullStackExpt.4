package com.institute.app;

import com.institute.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlInjectionMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("student-beans.xml");

        Student student = context.getBean("studentXml", Student.class);
        System.out.println("XML Injection Output:");
        System.out.println(student);

        context.close();
    }
}
