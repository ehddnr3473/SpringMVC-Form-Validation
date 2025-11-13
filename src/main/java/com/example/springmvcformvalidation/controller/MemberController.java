package com.example.springmvcformvalidation.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/join")
    public String join(Model model) {
        model.addAttribute("memberForm", new MemberForm());
        return "members/join";
    }

    @PostMapping("/join")
    public String join(@Valid MemberForm memberForm,
                       BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "members/join";

        // 회원가입 로직

        return "redirect:/";
    }
}
