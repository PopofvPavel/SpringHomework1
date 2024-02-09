package com.example.springtask.config;

import com.example.springtask.model.student.Student;
import com.example.springtask.model.student.Subject;
import com.example.springtask.model.student.Mark;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@ComponentScan(basePackages = "com.example.springtask")
public class ContextConfig {

    @Bean(initMethod = "init")
    public Student studentAkakiy() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.GOOD);
        subjectMap.put(Subject.Biology, Mark.EXCELLENT);
        subjectMap.put(Subject.Physics, Mark.SATISFACTORY);

        return new Student("Akakiy", subjectMap);
    }

    @Bean(initMethod = "init")
    public Student studentInnokentiy() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.SATISFACTORY);
        subjectMap.put(Subject.Biology, Mark.UNSATISFACTORY);
        subjectMap.put(Subject.Physics, Mark.UNSATISFACTORY);

        return new Student("Innokentiy", subjectMap);
    }

    @Bean(initMethod = "init")
    public Student studentJil() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.UNSATISFACTORY);
        subjectMap.put(Subject.Biology, Mark.UNSATISFACTORY);
        subjectMap.put(Subject.Physics, Mark.SATISFACTORY);

        return new Student("Jil", subjectMap);
    }
}
