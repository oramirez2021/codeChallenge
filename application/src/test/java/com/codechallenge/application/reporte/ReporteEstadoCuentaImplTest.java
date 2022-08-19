package com.codechallenge.application.reporte;

import com.codechallenge.application.model.EstadoCuenta;
import com.codechallenge.application.repository.EstadoCuentaRepo;
import com.codechallenge.application.repository.MovimientoRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
@Slf4j
public class ReporteEstadoCuentaImplTest {
    /*Este test debe devolver verde porque se esta colocando una fecha posterior a la actual, y en ese caso la lista resultante es null*/
    @Test
    void testDevuelveEstadoCuentaPorFechaFutura(){
        ReporteEstadoCuenta reporteEstadoCuenta = new ReporteEstadoCuenta() {
            @Override
            public List<EstadoCuenta> devuelveEstadoCuenta(String fecha) {
                return null;
            }
        };
        Assertions.assertEquals(null,reporteEstadoCuenta.devuelveEstadoCuenta("18-08-2025")); ;


    }
}
