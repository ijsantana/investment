package com.idesarrollo.investment.controller;

import com.idesarrollo.investment.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController("/api/v1")
public class PersonController {

    //@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    @GetMapping("/person/{id}")
    public String getPerson(@PathVariable Long id){

        Person persona1 = new Person();
        persona1.setId(id);
        persona1.setName("pepe");
        persona1.setAddress("calle falsa 123");
        persona1.setCuil("323423423523");

        return "persona: " + persona1.toString();
    }

}




