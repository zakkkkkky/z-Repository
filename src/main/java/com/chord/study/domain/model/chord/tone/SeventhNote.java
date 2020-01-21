package com.chord.study.domain.model.chord.tone;

import com.chord.study.domain.type.Note;

public class SeventhNote {
    Note note;

    public boolean isExists() {
        return note.isExists();
    }

    @Override
    public String toString() {
        return note.label();
    }
}
