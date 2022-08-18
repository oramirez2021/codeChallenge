package com.codechallenge.application.api;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.service.ClienteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @RequestMapping("/aplicacion") @RequiredArgsConstructor
public class ClienteControlador {
    private final ClienteServicio clienteServicio;
    @PostMapping("/cliente/crear")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/cliente/crear").toUriString());
        return ResponseEntity.created(uri).body(clienteServicio.crearCliente(cliente));
    }
}
