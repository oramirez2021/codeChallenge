package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Movimiento {
    @Id @GeneratedValue(strategy = AUTO)
    private Long idMovimiento;
    private int numeroCuenta;
    private Date fecha;
    private String tipoMovimiento;
    private double valor;
    private double saldo;
}
