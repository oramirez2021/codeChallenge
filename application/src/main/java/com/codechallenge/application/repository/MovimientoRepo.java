package com.codechallenge.application.repository;

import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface MovimientoRepo extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByFecha(String fecha);
}
