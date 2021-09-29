package com.idesarrollo.investment.service;


import com.idesarrollo.investment.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Person findPerson(String dni){
        Person person1 = new Person();
        person1.setDni(dni);
        return person1;
    }

}
