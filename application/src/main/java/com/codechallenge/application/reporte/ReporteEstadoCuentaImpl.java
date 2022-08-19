package com.codechallenge.application.reporte;

import com.codechallenge.application.model.EstadoCuenta;
import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.repository.EstadoCuentaRepo;
import com.codechallenge.application.repository.MovimientoRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ReporteEstadoCuentaImpl implements ReporteEstadoCuenta{
    private final EstadoCuentaRepo estadoCuentaRepo;
    private final MovimientoRepo movimientoRepo;
    @Override
    public List<EstadoCuenta> devuelveEstadoCuenta(String fecha) {
        List<EstadoCuenta> listaEstadoCuenta = new ArrayList<>();
        EstadoCuenta estadoCuenta = new EstadoCuenta();
        log.info("fechita {}",fecha);
        List<Movimiento> listaMovimientos= movimientoRepo.findByFecha(fecha);
        for (Movimiento mov :listaMovimientos){
            log.info("Se agrega a reporte {}",mov.getNumeroCuenta());
            estadoCuenta.setNumeroCuenta(mov.getNumeroCuenta());
            estadoCuenta.setFecha(mov.getFecha());
            estadoCuenta.setTipoMovimiento(mov.getTipoMovimiento());
            estadoCuenta.setValor(mov.getValor());
            estadoCuenta.setSaldo(mov.getSaldo());
            estadoCuenta.setMovimiento(mov.getMovimiento());
            listaEstadoCuenta.add(estadoCuenta);
        }

        return listaEstadoCuenta;
    }
}
