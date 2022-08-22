package com.codechallenge.application.operacion;

import com.codechallenge.application.operaion.OpeMovimientoImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OpeMovimientoImplTest {
    OpeMovimientoImpl opeMovimiento = new OpeMovimientoImpl();


    @Test
    void testCalculaSaldoPositivo(){
        Assertions.assertTrue(opeMovimiento.calculaSaldo(500.00,300.00)>0.00);
    }
    @Test
    void testCalculaSaldoNegativo(){

        Assertions.assertTrue(opeMovimiento.calculaSaldo(500.00,550.00)<0.00);
    }
}

