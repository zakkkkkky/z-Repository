package com.chord.study.domain.type.constituent;

public enum ChordConstituentNotes {
     Major("",       new PitchClass(4), new PitchClass(7))
    ,minor("m",      new PitchClass(3), new PitchClass(7))
    ,aug("aug",      new PitchClass(4), new PitchClass(8))
    ,dim("dim",      new PitchClass(3), new PitchClass(6))
    ,Major7("M7",    new PitchClass(4), new PitchClass(7), new PitchClass(11))
    ,minor7("m7",    new PitchClass(3), new PitchClass(7), new PitchClass(10))
    ,Dominant7("7",  new PitchClass(4), new PitchClass(7), new PitchClass(10))
    ,dim7("dim7",    new PitchClass(3), new PitchClass(6), new PitchClass(9))
    ,halfdim("m7-5", new PitchClass(3), new PitchClass(6), new PitchClass(10))
    ;

    String label;
    PitchClass third;
    PitchClass fifth;
    PitchClass seventh;

    ChordConstituentNotes(String label, PitchClass third, PitchClass fifth) {
        this.label = label;
        this.third = third;
        this.fifth = fifth;
    }

    ChordConstituentNotes(String label, PitchClass third, PitchClass fifth, PitchClass seventh) {
        this.label = label;
        this.third = third;
        this.fifth = fifth;
        this.seventh = seventh;
    }
}
