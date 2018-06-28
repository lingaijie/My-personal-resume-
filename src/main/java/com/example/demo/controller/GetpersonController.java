package com.example.demo.controller;


import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class GetpersonController {

    @Autowired
    private PersonRepository personRepository;
    @RequestMapping("/{tname}")
    public String home(@PathVariable String tname, Model model){
        Person temp = personRepository.findPersonById(0);
        model.addAttribute("Phn", temp.getPhn());
        model.addAttribute("e_mail", temp.getE_mail());
        model.addAttribute("name",temp.getName());

        return tname;
    }


}
