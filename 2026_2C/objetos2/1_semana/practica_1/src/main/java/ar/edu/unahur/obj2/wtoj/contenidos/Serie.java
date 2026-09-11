package ar.edu.unahur.obj2.wtoj.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    private List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void agregarTemprada(Temporada temporada){
        temporadas.add(temporada);
    }
    

    @Override
    public Double doCosto() {
        return temporadas.stream().
                mapToDouble(t -> t.costo()).
                average().
                orElse(0.0);
    }

}
