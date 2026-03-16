package com.institute.config;

import com.institute.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "studentAnnotation")
    public Student studentAnnotation() {
        Student student = new Student(202, "Arjun", "Java Fundamentals", 1);

        // Setter injection after constructor injection
        student.setCourse("Spring Framework");
        student.setYear(2);

        return student;
    }
}
