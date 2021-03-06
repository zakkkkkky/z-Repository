package com.chord.study.domain.type;

public enum Note {

    C2("C2", 36)
    ,Cs2("C#2", 37)
    ,D2("D2", 38)
    ,Ds2("D#2", 39)
    ,E2("E2", 40)
    ,F2("F2", 41)
    ,Fs2("F#2", 42)
    ,G2("G2", 43)
    ,Gs2("G#2", 44)
    ,A2("A2", 45)
    ,As2("A#2", 46)
    ,B2("B2", 47)
    ,C3("C3", 48)
    ,Cs3("C#3", 49)
    ,D3("D3", 50)
    ,Ds3("D#3", 51)
    ,E3("E3", 52)
    ,F3("F3", 53)
    ,Fs3("F#3", 54)
    ,G3("G3", 55)
    ,Gs3("G#3", 56)
    ,A3("A3", 57)
    ,As3("A#3", 58)
    ,B3("B3", 59)
    ,C4("C4", 60)
    ,Cs4("C#4", 61)
    ,D4("D4", 62)
    ,Ds4("D#4", 63)
    ,E4("E4", 64)
    ,F4("F4", 65)
    ,Fs4("F#4", 66)
    ,G4("G4", 67)
    ,Gs4("G#4", 68)
    ,A4("A4", 69)
    ,As4("A#4", 70)
    ,B4("B4", 71)
    ,C5("C5", 72)
    ,Cs5("C#5", 73)
    ,D5("D5", 74)
    ,Ds5("D#5", 75)
    ,E5("E5", 76)
    ,F5("F5", 77)
    ,Fs5("F#5", 78)
    ,G5("G5", 79)
    ,Gs5("G#5", 80)
    ,A5("A5", 81)
    ,As5("A#5", 82)
    ,B5("B5", 83)
    ,C6("C6", 84)
    ;

    String label;
    int noteNumber;

    public static final Note LOWEST_LIMIT = Note.C2;
    public static final Note HIGHEST_LIMIT = Note.C6;

    Note(String label, int noteNumber) {
        this.label = label;
        this.noteNumber = noteNumber;
    }

    public boolean isExists() {
        return this != null;
    }

    public boolean isInRange(Note target) {
        if (target.noteNumber < LOWEST_LIMIT.noteNumber) return false;
        if (target.noteNumber > HIGHEST_LIMIT.noteNumber) return false;
        return true;
    }

    public String label(){
        return label;
    }
}
