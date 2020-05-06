package com.utn.spring.repository;

import com.utn.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//a la interfaz JpaRepository acepta dos parámetros el primero la entidad con la que se trabaja y el otro el id de la identidad
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

//query de jpa
    List<Person>findByName(String name);

    //query creada por mi
    @Query(value = "select *from person where lastname=?1", nativeQuery = true)
    List<Person>findBylastname(String lastname);
}
