package com.chord.study.infrastructure.datasource.chord;

import com.chord.study.application.repository.chord.ChordQueryRepository;
import com.chord.study.domain.model.chord.Chord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChordQueryDatasource implements ChordQueryRepository {
    ChordQueryMapper chordQueryMapper;

    public ChordQueryDatasource(ChordQueryMapper chordQueryMapper) {
        this.chordQueryMapper = chordQueryMapper;
    }

    @Override
    public List<Chord> list() {
        return chordQueryMapper.list();
    }
}
