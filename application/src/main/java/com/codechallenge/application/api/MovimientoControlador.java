package com.codechallenge.application.api;

import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.operaion.OpeMovimiento;
import com.codechallenge.application.service.MovimientoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController @RequestMapping("/api") @RequiredArgsConstructor
public class MovimientoControlador {

    private final MovimientoServicio movimientoServicio;
    @PutMapping("/movimiento/crear")
    public ResponseEntity<Movimiento> createMovimiento(@RequestBody Movimiento movimiento){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/movimiento/crear").toUriString());
        return ResponseEntity.created(uri).body(movimientoServicio.crearMovimiento(movimiento));
    }
    @GetMapping("/movimiento/movimientos")
    public ResponseEntity<List<Movimiento>> getMovimientos(){
        return ResponseEntity.ok().body(movimientoServicio.getMovimientos());
    }
    @GetMapping("/movimiento/movimientosPorFecha")
    public ResponseEntity<List<Movimiento>> getMovimientosPorFecha(@RequestParam String fecha){
        return ResponseEntity.ok().body(movimientoServicio.getMovimientos(fecha));
    }
}
