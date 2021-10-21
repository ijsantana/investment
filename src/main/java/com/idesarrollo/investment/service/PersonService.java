package com.idesarrollo.investment.service;


import com.idesarrollo.investment.model.Investor;
import com.idesarrollo.investment.model.Person;
import com.idesarrollo.investment.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PersonService {

    @Autowired
    PersonRepository pRepository;

    public Person findPerson(String dni){
        return pRepository.findByDni(dni);
    }

    public String savePerson(Map<String,String> mapPerson){
        Person persona1 = new Person();
        persona1.setDni(mapPerson.get("dni"));
        persona1.setName(mapPerson.get("nombre"));
        persona1.setPhone(mapPerson.get("tel"));
        pRepository.save(persona1);
        return "Todo ok";
    }

}
