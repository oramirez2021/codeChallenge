package com.codechallenge.application.api;

import com.codechallenge.application.model.Cliente;
import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.model.Usuario;
import com.codechallenge.application.service.MovimientoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class MovimientoControlador {
    private final MovimientoServicio movimientoServicio;
    /*@PutMapping("/cliente/crear")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/cliente/crear").toUriString());
        return ResponseEntity.created(uri).body(clienteServicio.crearCliente(cliente));
    }*/
    @GetMapping("/movimientos")
    public ResponseEntity<List<Movimiento>> getMovimientos(){
        return ResponseEntity.ok().body(movimientoServicio.getMovimientos());
    }
}
