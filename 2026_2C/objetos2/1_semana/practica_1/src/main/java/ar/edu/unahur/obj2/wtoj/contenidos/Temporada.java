package ar.edu.unahur.obj2.wtoj.contenidos;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios = new ArrayList<>();
    private final Integer numero;

    public Temporada(List<Episodio> episodios, Integer numero) {
        this.episodios = episodios;
        this.numero = numero;
    }

    public Temporada(Integer numero){
        this.numero = numero;
    }

    public List<Episodio> getEpisodios(){
        return episodios;
    }

    public void agregarEpisodios(Episodio episodio){
        episodios.add(episodio);
    }

    public Integer getNumero() {
        return numero;
    }

    public Double costo(){
        return episodios.stream().mapToDouble(Episodio::costo).average().orElse(0.0);
    }
}
