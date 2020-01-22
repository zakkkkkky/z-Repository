package com.chord.study.domain.model.chord;

import com.chord.study.domain.model.chord.additional.AdditionalNotes;
import com.chord.study.domain.model.chord.tension.TensionNotes;
import com.chord.study.domain.model.chord.tone.ChordTones;

public class Chord {
    ChordTones chordTones;
    TensionNotes tensionNotes;
    AdditionalNotes additionalNotes;

    public Chord() {
        this.chordTones = new ChordTones();
        this.tensionNotes = new TensionNotes();
        this.additionalNotes = new AdditionalNotes();
    }

    public Chord(ChordTones chordTones, TensionNotes tensionNotes, AdditionalNotes additionalNotes) {
        this.chordTones = chordTones;
        this.tensionNotes = tensionNotes;
        this.additionalNotes = additionalNotes;
    }

    public ChordTones chordTones() {
        return chordTones;
    }

    public boolean isTriad() {
        return !chordTones.hasSeventh() && tensionNotes.isEmpty();
    }

    public boolean isSeventhChord() {
        return chordTones.hasSeventh() && tensionNotes.isEmpty();
    }

    @Override
    public String toString() {
        return "chord{" +
            "chordTones=" + chordTones +
            ", tensionNotes=" + tensionNotes +
            ", additionalNotes=" + additionalNotes +
            '}';
    }
}
