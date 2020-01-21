package com.chord.study.application.service.chord;

import com.chord.study.application.repository.chord.ChordQueryRepository;
import com.chord.study.domain.model.chord.Chord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChordQueryService {
    ChordQueryRepository chordQueryRepository;

    public ChordQueryService(ChordQueryRepository chordQueryRepository) {
        this.chordQueryRepository = chordQueryRepository;
    }

    public List<Chord> list() {
        return chordQueryRepository.list();
    }
}
