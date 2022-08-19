package com.codechallenge.application.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.util.List;

import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Cliente extends Persona{
    @Id @GeneratedValue(strategy = AUTO)
    private Long clienteId;

    public Cliente(Long id,String nombre,String genero, int edad,String identificacion,String direccion,String telefono,Long clienteId,String contrasena, String estado){
        super(id,nombre,genero,edad,identificacion,direccion,telefono);
        this.clienteId=clienteId;
        this.contrasena=contrasena;
        this.estado=estado;
    }

    private String contrasena;
    private String estado;



}
