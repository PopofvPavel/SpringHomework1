package com.example.springtask.postprocessors;

import com.example.springtask.model.student.Mark;
import com.example.springtask.model.student.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class StudentBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student student) {
            if ("Jil".equals(student.getName())) {
                ((Student) bean).getSubjectMarkMap().replaceAll((subject, mark) -> getMark(mark));

            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    private Mark getMark(Mark mark) {
        switch (mark) {
            case EXCELLENT:
            case GOOD:
                return Mark.EXCELLENT;
            case SATISFACTORY:
                return Mark.GOOD;
            case UNSATISFACTORY:
                return Mark.SATISFACTORY;
        }
        return mark;
    }
}
