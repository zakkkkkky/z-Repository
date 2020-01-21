package com.chord.study.domain.type.constituent;

public class PitchClass {
    int value;

    public PitchClass(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return "PitchClass{" +
            "value=" + value +
            '}';
    }
}
