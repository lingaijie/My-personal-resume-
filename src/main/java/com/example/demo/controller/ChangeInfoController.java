/*
package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info")
public class ChangeInfoController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("")
    public String index(Model model){
        List<Person> personList=personRepository.findAll();
        return "";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable(value = "id")int id ,Model model){
        Person selectByid=personRepository.findPersonById(id);
        model.addAttribute("person",selectByid);
        return "index";
    }

}
*/
