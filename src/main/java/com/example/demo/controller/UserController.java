package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("person",new Person());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Person person){
        personRepository.updatePsersionbyId(0, person.getName(),person.getPhn(),person.getE_mail(),person.getInfro());
        return "redirect:/contact";
    }
}