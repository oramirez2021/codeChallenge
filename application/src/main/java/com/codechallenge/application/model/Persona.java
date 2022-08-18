package com.codechallenge.application.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass @Data
public class Persona {
    protected Long id;
    protected String nombre;
    protected String genero;
    protected int edad;
    protected int identificacion;
    protected String direccion;
    protected String telefono;
}
