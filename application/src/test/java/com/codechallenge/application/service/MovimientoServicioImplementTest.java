package com.codechallenge.application.service;
import com.codechallenge.application.repository.MovimientoRepo;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@RequiredArgsConstructor
public class MovimientoServicioImplementTest {
    @Test
    void crearMovimientoSiSaldoActualEsMayorACero(){
        CuentaServicio mockCuentaServicio = Mockito.mock(CuentaServicio.class);
        MovimientoRepo mockMovimentoRepo = Mockito.mock(MovimientoRepo.class);
        double saldoActual = mockCuentaServicio.getCuenta(4).getSaldoInicial();
        double nuevoSaldo=0.00;

    }
}
