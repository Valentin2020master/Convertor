package com.example.demo.controller;

import com.example.demo.Convert;
import com.example.demo.Temperatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {

    private Convert convert;

    public Convert getConvert() {
        return convert;
    }

    @GetMapping("/converts")
    public String get(Model model, @RequestParam(required = false) String temperature, @RequestParam(required = false) String convertIn) {
        Temperatura convert = new Temperatura();
        if (temperature != null) {
            Convert.convertTemp(convert.setTemperature(Float.parseFloat(temperature)), convert.setConvertTo(convertIn.charAt(0)));
        }
        model.addAttribute("convert", convert);
        return "convert";

    }

    public void setConvert(Convert convert) {
        this.convert = convert;
    }
}
