package com.codechallenge.application.service;

import com.codechallenge.application.model.Cuenta;
import com.codechallenge.application.repository.CuentaRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CuentaServicioImplement implements CuentaServicio{
    private final CuentaRepo cuentaRepo;
    @Override
    public Cuenta creaCuenta(Cuenta cuenta)  {
        log.info("Creando un nuevo cuenta para cliente {}",cuenta);
        return cuentaRepo.save(cuenta);
    }
}
