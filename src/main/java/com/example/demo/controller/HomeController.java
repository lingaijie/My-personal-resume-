package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping(path = "/home")
    public String home(Model model) {

        model.addAttribute("name", "test");
        List<String> list = new ArrayList<>();
        list.add("Lee a");
        list.add("Lee b");
        list.add("Lee c");
        list.add("Lee d");
        model.addAttribute("list", list);

        return "home";

    }
}
