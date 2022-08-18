package com.codechallenge.application.service;

import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.repository.MovimientoRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class MovimientoServicioImplement implements MovimientoServicio{
    private final MovimientoRepo movimientoRepo;

    @Override
    public List<Movimiento> getMovimientos(Date fecha) {
        log.info("Buscando todos los movimientos");
        return movimientoRepo.findAll();
    }

    @Override
    public Movimiento crearMovimiento(Movimiento movimiento) {
        return movimientoRepo.save(movimiento);
    }

    @Override
    public List<Movimiento> getMovimientos() {
        log.info("Buscando todos los movimientos");
        return movimientoRepo.findAll();
    }


}