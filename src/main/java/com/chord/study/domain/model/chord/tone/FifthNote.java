package com.chord.study.domain.model.chord.tone;

import com.chord.study.domain.type.Note;

public class FifthNote {
    Note note;

    @Override
    public String toString() {
        return note.label();
    }
}
