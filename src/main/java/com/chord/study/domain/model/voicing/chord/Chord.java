package com.chord.study.domain.model.voicing.chord;

import com.project.management.xsandbox.domain.model.voicing.chord.additional.AdditionalNotes;
import com.project.management.xsandbox.domain.model.voicing.chord.tone.ChordTones;
import com.project.management.xsandbox.domain.model.voicing.chord.tension.TensionNotes;

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
