package com.codechallenge.application.repository;

import com.codechallenge.application.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepo extends JpaRepository<Movimiento, Long> {

}
