package com.example.demo.controller;


import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        Person person = new Person();
        person.setName("凌爱杰");
        person.setPsd(12345);
        person.setId(0);
       person.setPhn("18860438435");
       person.setE_mail("670167021@qq.com");
       person.setInfro("您好 ！我叫凌爱杰 "+
               "来自安徽省池州市，" +
               "就读于安徽六安皖西学院，" +
               "大学主修计算机科学与技术。" +
               "大学期间一边学习了C/c++语言的编程语言，" +
               "一边游玩了各种类型的游戏，" +
               "并对各种主流游戏拥有自己的见解和看法，" +
               "热爱游戏但不沉迷游戏。" +
               "对待各种事物都能拥有自己独特的看法和不同寻常的见解，" +
               "并且善于独立思考。 ");

        //保存person
        personRepository.save(person);
        return "index";
    }

}
