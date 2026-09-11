package ar.edu.unahur.obj2.excepcions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    @Test
    void testCosto() {
        Vehiculo vehiculo = new Vehiculo("AAA111");
        vehiculo.setHorasEstacionadas(3);
        assertEquals(15000, vehiculo.costo());
    }

    void testCosto2() {
        Vehiculo vehiculo2 = new Vehiculo("BBB222");
        assertThrows(HorasInvalidasException.class, 
            () -> vehiculo2.setHorasEstacionadas(-2));
    }
}
