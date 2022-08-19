package com.codechallenge.application.reporte;

import com.codechallenge.application.model.EstadoCuenta;

import java.util.List;

public interface ReporteEstadoCuenta {
    List<EstadoCuenta> devuelveEstadoCuenta(String fecha);

}
