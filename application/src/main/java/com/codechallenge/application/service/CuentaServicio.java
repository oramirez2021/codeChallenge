package com.codechallenge.application.service;

import com.codechallenge.application.model.Cuenta;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CuentaServicio {
    Cuenta creaCuenta(Cuenta cuenta);
}