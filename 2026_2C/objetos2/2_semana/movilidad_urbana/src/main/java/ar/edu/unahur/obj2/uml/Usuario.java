package ar.edu.unahur.obj2.uml;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Alquiler> alquileres;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public void registrarAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    public List<Alquiler> getAlquileres() {
        return this.alquileres;
    }
}
