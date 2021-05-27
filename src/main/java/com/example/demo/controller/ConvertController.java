package com.example.demo.controller;

import com.example.demo.Temperatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    @GetMapping("/converts")
    public String get(Model model) {
        Temperatura convert = new Temperatura();

        model.addAttribute("convert", convert);

        return "convert";

    }




}
