package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Cliente extends Persona {
    @Id @GeneratedValue(strategy = AUTO)
    private Long clienteId;
    private String contrasena;
    private String estado;

}
