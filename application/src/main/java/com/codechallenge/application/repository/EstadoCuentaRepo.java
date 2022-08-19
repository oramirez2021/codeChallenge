package com.codechallenge.application.repository;

import com.codechallenge.application.model.EstadoCuenta;
import com.codechallenge.application.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstadoCuentaRepo extends JpaRepository<EstadoCuenta, Long> {
    List<EstadoCuenta> findByFecha(String fecha);
}
