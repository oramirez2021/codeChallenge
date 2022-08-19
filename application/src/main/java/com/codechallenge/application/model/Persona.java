package com.codechallenge.application.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass @AllArgsConstructor @NoArgsConstructor @Data
public class Persona {
    protected Long id;
    protected String nombre;
    protected String genero;
    protected int edad;
    protected String identificacion;
    protected String direccion;
    protected String telefono;
}
