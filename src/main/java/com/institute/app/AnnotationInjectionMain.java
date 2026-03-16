package com.institute.app;

import com.institute.config.StudentConfig;
import com.institute.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationInjectionMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean("studentAnnotation", Student.class);
        System.out.println("Annotation Injection Output:");
        System.out.println(student);

        context.close();
    }
}
