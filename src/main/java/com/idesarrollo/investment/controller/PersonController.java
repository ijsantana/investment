package com.idesarrollo.investment.controller;

import com.idesarrollo.investment.dtos.PersonDto;
import com.idesarrollo.investment.model.Person;
import com.idesarrollo.investment.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public PersonDto getPersonByDni(@PathVariable("dni") String dni){
        PersonDto persona = pService.findPerson(dni);
        return persona;
    }


    @GetMapping("/person/name/{name}")
    public String getPersonByName(@PathVariable("name") String name){

        //Person persona = pService.findPerson(name);

        return "persona: ";
    }

    @PostMapping("/person/new")
    public String saveNewPerson(@RequestBody Map<String,String> body){
        System.out.println(body.toString());
        pService.savePerson(body);
        return "ok";
    }

    @GetMapping("/persons/findAll")
    public List<Person> findAllPersons(){
        return pService.findAllPersons();
    }

}




