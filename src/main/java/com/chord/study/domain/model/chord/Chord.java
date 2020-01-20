package com.chord.study.domain.model.chord;

import com.chord.study.domain.model.chord.additional.AdditionalNotes;
import com.chord.study.domain.model.chord.tension.TensionNotes;
import com.chord.study.domain.model.chord.tone.ChordTones;

public class Chord {
    ChordTones chordTones;
    TensionNotes tensionNotes;
    AdditionalNotes additionalNotes;

    public boolean isTriad() {
        return !chordTones.hasSeventh() && tensionNotes.isEmpty();
    }

    public boolean isSeventhChord() {
        return chordTones.hasSeventh() && tensionNotes.isEmpty();
    }
}
