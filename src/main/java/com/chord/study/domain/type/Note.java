package com.chord.study.domain.type;

public class Note {
    String value;

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public boolean isExists() {
        return !isEmpty();
    }
}
