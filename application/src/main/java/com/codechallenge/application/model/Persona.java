package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass @Data @AllArgsConstructor
public class Persona {
   @Id
    protected Long id;
    protected String nombre;
    protected String genero;
    protected int edad;
    protected String identificacion;
    protected String direccion;
    protected String telefono;
}
