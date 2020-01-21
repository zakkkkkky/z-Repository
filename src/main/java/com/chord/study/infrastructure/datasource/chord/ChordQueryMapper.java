package com.chord.study.infrastructure.datasource.chord;

import com.chord.study.domain.model.chord.Chord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChordQueryMapper {
    List<Chord> list();
}
