package com.example.springtask;

import com.example.springtask.config.ContextConfig;
import com.example.springtask.model.student.Student;
import com.example.springtask.model.teacher.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class SpringTaskApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher1 = xmlApplicationContext.getBean("teacher", Teacher.class);
        printStudentsList(teacher1.getStudents());


        AnnotationConfigApplicationContext classConfigContext =
                new AnnotationConfigApplicationContext(ContextConfig.class);
        Teacher teacher2 = classConfigContext.getBean("teacher", Teacher.class);
        printStudentsList(teacher2.getStudents());


    }

    private static void printStudentsList(List<Student> students) {
        for (var stud : students) {
            System.out.println(stud);
        }
    }


}
