package com.example.springtask.config;

import com.example.springtask.model.student.Student;
import com.example.springtask.model.student.Subject;
import com.example.springtask.model.student.Mark;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@ComponentScan(basePackages = "com.example.springtask.model")

public class ContextConfig {

    @Bean(initMethod = "init")
    public Student studentAkakiy() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.HOR);
        subjectMap.put(Subject.Biology, Mark.OTL);
        subjectMap.put(Subject.Physics, Mark.UD);

        return new Student("Akakiy", subjectMap);
    }

    @Bean(initMethod = "init")
    public Student studentInnokentiy() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.UD);
        subjectMap.put(Subject.Biology, Mark.NEUD);
        subjectMap.put(Subject.Physics, Mark.NEUD);

        return new Student("Innokentiy", subjectMap);
    }

    @Bean(initMethod = "init")
    public Student studentJil() {
        HashMap<Subject, Mark> subjectMap = new HashMap<>();
        subjectMap.put(Subject.Math, Mark.NEUD);
        subjectMap.put(Subject.Biology, Mark.NEUD);
        subjectMap.put(Subject.Physics, Mark.UD);

        return new Student("Jil", subjectMap);
    }
}
