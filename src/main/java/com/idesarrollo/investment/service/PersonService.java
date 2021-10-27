package com.idesarrollo.investment.service;


import com.idesarrollo.investment.dtos.PersonDto;
import com.idesarrollo.investment.model.Investor;
import com.idesarrollo.investment.model.Person;
import com.idesarrollo.investment.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonService {

    @Autowired
    PersonRepository pRepository;

    public PersonDto findPerson(String dni){
        Person persona = pRepository.findByDni(dni);
        PersonDto dto = convertPersonToDto(persona);
        return dto;
    }

    public PersonDto convertPersonToDto(Person person){
        PersonDto pDto = new PersonDto();
        pDto.setName(person.getName());
        pDto.setAddress(person.getAddress());
        pDto.setDni(person.getDni());
        return pDto;
    }

    public String savePerson(Map<String,String> mapPerson){
        Person persona1 = new Person();
        persona1.setDni(mapPerson.get("dni"));
        persona1.setName(mapPerson.get("nombre"));
        persona1.setPhone(mapPerson.get("tel"));
        pRepository.save(persona1);
        return "Todo ok";
    }

    public List<Person> findAllPersons() {
        List<Person> persons = pRepository.findAll();
        return persons;
    }
}
