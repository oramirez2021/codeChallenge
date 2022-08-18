package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Cuenta {
    @Id @GeneratedValue(strategy = AUTO)
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private String estado;
}
