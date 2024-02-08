package com.example.springtask.model.student;

public enum Mark {
    OTL(5),
    HOR(4),
    UD(3),
    NEUD(2),

    ;


    private final int digitMark;

    Mark(int digitMark) {
        this.digitMark = digitMark;
    }

    public int getDigitMark() {
        return digitMark;
    }
}
