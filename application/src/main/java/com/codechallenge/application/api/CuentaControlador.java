package com.codechallenge.application.api;

import com.codechallenge.application.model.Cuenta;
import com.codechallenge.application.service.CuentaServicio;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @RequestMapping("/api") @RequiredArgsConstructor @Slf4j
public class CuentaControlador {
    private final CuentaServicio cuentaServicio;
    @PutMapping("/cuenta/crear")
    public ResponseEntity<Cuenta> createCuenta(@RequestBody Cuenta cuenta)  {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/cuenta/crear").toUriString());
        return ResponseEntity.created(uri).body(cuentaServicio.creaCuenta(cuenta));
    }
}
