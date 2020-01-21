package com.chord.study.domain.label;

public enum PitchName {
    C2("C")
    ,Cs2("C#")
    ,D2("D")
    ,Ds2("D#")
    ,E2("E")
    ,F2("F")
    ,Fs2("F#")
    ,G2("G")
    ,Gs2("G#")
    ,A2("A")
    ,As2("A#")
    ,B2("B")
    ;

    String label;

    PitchName(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}
