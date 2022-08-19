package com.codechallenge.application.operaion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class OpeMovimientoImpl implements OpeMovimiento{
    //exceptions
    @Override
    public double calculaSaldo(double saldo, double valor) {
        double nuevoSaldo=saldo-valor;
        return nuevoSaldo;
    }
}
