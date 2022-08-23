package com.codechallenge.application.service;

import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.operaion.OpeMovimientoImpl;
import com.codechallenge.application.repository.MovimientoRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class MovimientoServicioImplement implements MovimientoServicio{
    OpeMovimientoImpl opeMovimiento = new OpeMovimientoImpl();
    private final CuentaServicio cuentaServicio;
    private final MovimientoRepo movimientoRepo;
    @Override
    public Movimiento crearMovimiento(Movimiento movimiento) {
        double saldoActual = cuentaServicio.getCuenta(movimiento.getNumeroCuenta()).getSaldoInicial();
        double nuevoSaldo=0.00;
        String tipoTransaccion = movimiento.getTipoTransaccion();
        if(tipoTransaccion.equals("Debito")){
            nuevoSaldo = opeMovimiento.calculaSaldoDebito(saldoActual,movimiento.getValor());
            if (nuevoSaldo >= 0.00){
                movimiento.setSaldo(nuevoSaldo);
                movimiento.setMovimiento("Retiro de "+movimiento.getValor());
                cuentaServicio.actualizaCuenta(movimiento.getNumeroCuenta(),nuevoSaldo);
            }else{
                log.error("Saldo no disponible");
                movimiento.setTipoMovimiento("Transaccion no realizada");
            }
        } else if (tipoTransaccion.equals("Credito")) {
            nuevoSaldo = opeMovimiento.calculaSaldoCredito(saldoActual,movimiento.getValor());
            movimiento.setSaldo(nuevoSaldo);
            movimiento.setMovimiento("Deposito de "+movimiento.getValor());
            cuentaServicio.actualizaCuenta(movimiento.getNumeroCuenta(),nuevoSaldo);
        }


        return movimientoRepo.save(movimiento);
    }

    @Override
    public List<Movimiento> getMovimientos() {
        log.info("Buscando todos los movimientos");
        return movimientoRepo.findAll();
    }
    @Override
    public List<Movimiento> getMovimientos(String fecha) {
        log.info("Buscando todos los movimientos");
        return movimientoRepo.findByFecha(fecha);
    }

}