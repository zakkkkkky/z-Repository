package com.chord.study.application.repository.chord;

import com.chord.study.domain.model.chord.Chord;

import java.util.List;

public interface ChordQueryRepository {
    List<Chord> list();
}
