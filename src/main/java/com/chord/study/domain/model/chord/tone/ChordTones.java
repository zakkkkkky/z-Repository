package com.chord.study.domain.model.chord.tone;

public class ChordTones {
    Root root;
    ThirdNote third;
    FifthNote fifth;
    SeventhNote seventh;

    public boolean hasSeventh() {
        return seventh.isExists();
    }
}
