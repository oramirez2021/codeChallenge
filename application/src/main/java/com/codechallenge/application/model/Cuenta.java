package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Cuenta {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private String estado;
    //@ManyToMany(fetch = EAGER)
    //@OneToOne(cascade = CascadeType.ALL)
    //@OneToOne(cascade = CascadeType.ALL,mappedBy="Cuenta")
   // @JoinColumn(name="cliente_id")
    private int cliente_id;
}
