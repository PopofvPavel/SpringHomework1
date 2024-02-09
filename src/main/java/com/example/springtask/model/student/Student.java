package com.example.springtask.model.student;


import java.util.Map;


public class Student {

    private final String Name;

    private final Map<Subject, Mark> subjectMarkMap;

    private boolean isTaken = false;

    public void init() {
        isTaken = getAverageMark() >= Mark.SATISFACTORY.getDigitMark();
    }

    private double getAverageMark() {
        return subjectMarkMap.values().stream().mapToDouble(Mark::getDigitMark).average().orElse(0);

    }

    public Student(String name, Map<Subject, Mark> subjectMarkMap) {
        Name = name;
        this.subjectMarkMap = subjectMarkMap;

    }

    public Map<Subject, Mark> getSubjectMarkMap() {
        return subjectMarkMap;
    }

    public String getName() {
        return Name;
    }


    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    @Override
    public String toString() {
        return "Student " +
                Name +
                ", subjectMarkMap= " + subjectMarkMap +
                ", isTaken=" + isTaken;
    }
}
