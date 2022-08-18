package com.codechallenge.application.api;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.service.ClienteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class ClienteControlador {
    private final ClienteServicio clienteServicio;
    @PutMapping("/cliente/crear")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/cliente/crear").toUriString());
        return ResponseEntity.created(uri).body(clienteServicio.crearCliente(cliente));
    }
}
