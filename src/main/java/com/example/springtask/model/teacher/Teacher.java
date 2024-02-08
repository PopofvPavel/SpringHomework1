package com.example.springtask.model.teacher;

import com.example.springtask.model.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Teacher {

    @Autowired
    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
}
