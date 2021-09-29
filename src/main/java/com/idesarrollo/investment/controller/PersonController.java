package com.idesarrollo.investment.controller;

import com.idesarrollo.investment.model.Person;
import com.idesarrollo.investment.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api/v1")
public class PersonController {

    //Lo defino como una variable global.
    //PersonService pService = new PersonService();
    //@ son beans.
    //Instanciar el objeto pService, Es lo mismo que la fila de arriba
    @Autowired
    PersonService pService;


    //@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    @GetMapping("/person/{dni}")
    public String getPersonByDni(@PathVariable("dni") String dni){

        Person persona = pService.findPerson(dni);

        return "persona: ";
    }



    @GetMapping("/person/name/{name}")
    public String getPersonByName(@PathVariable("name") String name){

        Person persona = pService.findPerson(name);

        return "persona: ";
    }



}




