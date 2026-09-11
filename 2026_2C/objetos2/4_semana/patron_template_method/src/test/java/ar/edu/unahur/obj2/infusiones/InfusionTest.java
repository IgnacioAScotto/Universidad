package ar.edu.unahur.obj2.infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InfusionTest {
    @Test
    void testPreparar() {
        Mate matecito = new Mate();

        assertEquals("Calentar agua \nCargar el mate con yerba y verter el agua caliente", matecito.preparar());
    }

    @Test
    void testTe() {
        Te tecito = new Te();
        assertEquals("Calentar agua \nVerter el agua caliente sobre el saquito", tecito.preparar());
    }
}