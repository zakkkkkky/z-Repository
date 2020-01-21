package com.chord.study.presentation.controller.chord;

import com.chord.study.domain.model.chord.Chord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/chord/register")
public class ChordRegisterController {

//    ChordRegisterService chordRegisterService;

    private static final String[] accept = {};

    @InitBinder("chord")
    public void initBinder(WebDataBinder binder) { binder.setAllowedFields(accept);}

    public ChordRegisterController() {
    }

    @GetMapping("")
    String clearSessionAtStart() {
        return "forward:/chord/register/input";
    }

    @GetMapping("input")
    String showForm() {
        return "chord/register/form";
    }

    @PostMapping("")
    String register(Model model,
                    @Validated @ModelAttribute Chord chord,
                    BindingResult result,
                    RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) return "chord/register/form";

//        chordRegisterService.register(chord);

        redirectAttributes.addFlashAttribute("message", "コードを登録しました");
        return "redirect:/chord/register";
    }
}
