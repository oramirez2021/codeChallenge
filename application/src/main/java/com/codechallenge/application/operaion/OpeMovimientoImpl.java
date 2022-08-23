package com.codechallenge.application.operaion;

import lombok.Data;

@Data
public class OpeMovimientoImpl implements OpeMovimiento{
    @Override
    public double calculaSaldoCredito(double saldo, double valor) {
        double nuevoSaldo=saldo+valor;
        return nuevoSaldo;
    }

    //exceptions
    public double calculaSaldoDebito(double saldo, double valor) {
        double nuevoSaldo=saldo-valor;
        return nuevoSaldo;
    }
}
