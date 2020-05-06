package com.utn.spring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Convierte tu clase java a una tabla en BD
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    @Id// primary key
    @GeneratedValue (strategy = GenerationType.IDENTITY)//Es como el autoincrement
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String lastname;
}

