package ar.edu.unahur.obj2.excepcions;

public class HorasInvalidasException extends RuntimeException{

    public HorasInvalidasException(String mensaje) {
        super(mensaje);
    }
}