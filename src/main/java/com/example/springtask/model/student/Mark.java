package com.example.springtask.model.student;

public enum Mark {
    EXCELLENT(5),
    GOOD(4),
    SATISFACTORY(3),
    UNSATISFACTORY(2);

    private final int digitMark;

    Mark(int digitMark) {
        this.digitMark = digitMark;
    }

    public int getDigitMark() {
        return digitMark;
    }
}
