package com.chord.study.domain.model.chord.tone;

public class ChordTones {
    Root root;
    ThirdNote third;
    FifthNote fifth;
    SeventhNote seventh;

    public ChordTones(Root root, ThirdNote third, FifthNote fifth, SeventhNote seventh) {
        this.root = root;
        this.third = third;
        this.fifth = fifth;
        this.seventh = seventh;
    }

    public Root root() {
        return root;
    }

    public ThirdNote third() {
        return third;
    }

    public FifthNote fifth() {
        return fifth;
    }

    public SeventhNote seventh() {
        return seventh;
    }

    public boolean hasSeventh() {
        return seventh.isExists();
    }

    @Override
    public String toString() {
        return "ChordTones{" +
            "root=" + root +
            ", third=" + third +
            ", fifth=" + fifth +
            ", seventh=" + seventh +
            '}';
    }
}
