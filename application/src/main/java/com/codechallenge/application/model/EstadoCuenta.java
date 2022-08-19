package com.codechallenge.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoCuenta{
    @Id
    private int numeroCuenta;
    private String nombreCliente;
    private String fecha;
    private String tipoMovimiento;
    private double valor;
    private double saldo;
    private String movimiento;
}
