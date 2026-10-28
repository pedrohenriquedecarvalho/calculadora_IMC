package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    @Test
    void testarCalcularIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(80, 2.0);
        // peso 80kg, altura 2.0m -> IMC esperado = 20.0
        assertEquals(20.0, resultado, 0.01);
    }
}