package com.codechallenge.application.api;

import com.codechallenge.application.model.EstadoCuenta;
import com.codechallenge.application.model.Movimiento;
import com.codechallenge.application.reporte.ReporteEstadoCuenta;
import com.codechallenge.application.service.MovimientoServicio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController @RequestMapping("/reportes") @RequiredArgsConstructor
public class EstadoCuentaControlador {

   private final ReporteEstadoCuenta reporteEstadoCuenta;

    @GetMapping("/estadoCuenta")
    public ResponseEntity<List<EstadoCuenta>> getMovimientosPorFecha(@RequestParam String fecha){
        return ResponseEntity.ok().body(reporteEstadoCuenta.devuelveEstadoCuenta(fecha));
    }

   /* @GetMapping("/estadoCuenta")
    public ResponseEntity<List<Movimiento>> getMovimientosPorFecha(@RequestParam String fecha){
        return ResponseEntity.ok().body(movimientoServicio.getMovimientos(fecha));
    }*/
}
