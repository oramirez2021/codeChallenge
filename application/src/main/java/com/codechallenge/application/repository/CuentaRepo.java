package com.codechallenge.application.repository;
import com.codechallenge.application.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepo extends JpaRepository<Cuenta,Long> {
Cuenta findByNumeroCuenta(int numeroCuenta);
}
