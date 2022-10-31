package com.example.MyBookShopApp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class AboutController {

//    @Value("#{'${about.text}'.split(';')}")
//    private  List<String> about;
//
//    @ModelAttribute("aboutText")
//    private List<String> getAbout() {
//        return about;
//    }


    @GetMapping("/about")
    public String recentPage(){
        return "about";
    }

}
