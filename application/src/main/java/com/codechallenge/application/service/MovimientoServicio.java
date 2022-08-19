package com.codechallenge.application.service;

import com.codechallenge.application.model.Movimiento;

import java.util.Date;
import java.util.List;

public interface MovimientoServicio {
    Movimiento crearMovimiento(Movimiento movimiento);
    List<Movimiento> getMovimientos(String fecha);
    List<Movimiento> getMovimientos();

}
