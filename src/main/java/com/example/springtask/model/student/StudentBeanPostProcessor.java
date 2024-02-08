package com.example.springtask.model.student;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class StudentBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            if ("Jil".equals(((Student) bean).getName())) {
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
            case OTL:
            case HOR:
                return Mark.OTL;
            case UD:
                return Mark.HOR;
            case NEUD:
                return Mark.UD;
        }
        return mark;
    }
}
