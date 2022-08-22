package com.codechallenge.application.service;


import com.codechallenge.application.model.Cuenta;
import com.codechallenge.application.repository.CuentaRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

//@AllArgsConstructor @NoArgsConstructor
public class CuentaServicioImplementTest{
    @Test
    void testActualizaCuenta(){
        //given
        Cuenta cuenta = new Cuenta(4,"Ahorro",500.00,"True",3);
        Cuenta cuentaNueva = new Cuenta();
        CuentaRepo cuentaRepoMock = Mockito.mock(CuentaRepo.class);
        //when
        when(cuentaRepoMock.save(cuentaNueva)).thenReturn(cuenta);
        //then
        double saldoInicialResul = cuentaRepoMock.save(cuentaNueva).getSaldoInicial();
        Assertions.assertEquals(500.00,saldoInicialResul);
    }
}
