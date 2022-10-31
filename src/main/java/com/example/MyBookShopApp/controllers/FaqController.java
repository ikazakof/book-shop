package com.example.MyBookShopApp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

@Controller
public class FaqController {

    @Value("#{${help.tips}}")
    private Map<String,String> valueMap;

    @ModelAttribute("tips")
    private Map<String, String> getTips() {
        return valueMap;
    }

    @GetMapping("/faq")
    public String recentPage(){
        return "faq";
    }

}
