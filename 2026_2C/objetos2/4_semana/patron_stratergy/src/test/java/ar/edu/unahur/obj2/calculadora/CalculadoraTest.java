package ar.edu.unahur.obj2.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.calculadora.operaciones.MultiplicarStrategy;
import ar.edu.unahur.obj2.calculadora.operaciones.SumarStrategy;

public class CalculadoraTest {
    @Test
    void testResolver() {
        Calculadora calc = new Calculadora(new SumarStrategy());
        assertEquals(5.0, calc.resolver(2.0, 3.0));
    }

    @Test
    void test2() {
        Calculadora calcu2 = new Calculadora(new MultiplicarStrategy());
        assertEquals(6.0, calcu2.resolver(2.0, 3.0));
    }
}
