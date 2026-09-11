package ar.edu.unahur.obj2.uml;

public abstract class Vehiculo {
    protected  Boolean disponibilidad;

    public Vehiculo() {
        this.disponibilidad = true;
    }
    
    public Boolean estaDisponible() {
        return this.disponibilidad;
    }

    public void alquilar() {
        this.disponibilidad = false;
    }

    public void devolver() {
        this.disponibilidad = true;
    }
}
