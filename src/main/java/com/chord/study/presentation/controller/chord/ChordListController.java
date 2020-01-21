package com.chord.study.presentation.controller.chord;

import com.chord.study.application.service.chord.ChordQueryService;
import com.chord.study.domain.label.PitchName;
import com.chord.study.domain.model.chord.Chord;
import com.chord.study.domain.type.constituent.ChordConstituentNotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class ChordListController {

    ChordQueryService chordQueryService;

    ChordListController(ChordQueryService chordQueryService) {
        this.chordQueryService = chordQueryService;
    }

    @ModelAttribute("pitchNameList")
    public List<PitchName> pitchNameList() {
        return Arrays.asList(PitchName.values());
    }

    @ModelAttribute("chordConstituentNotesList")
    public List<ChordConstituentNotes> chordConstituentNotesList() {
        return Arrays.asList(ChordConstituentNotes.values());
    }

    @GetMapping
    String list(Model model) {
        List<Chord> chordList = chordQueryService.list();
        model.addAttribute("chordList", chordList);
        return "chord/list";
    }

}
