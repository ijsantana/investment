package com.idesarrollo.investment.repository;

import com.idesarrollo.investment.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//HIBERNATE-> PARA MANEJO DE BBDD
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

    List<Person> findAll();

    Person findByDni(String dni);

}
