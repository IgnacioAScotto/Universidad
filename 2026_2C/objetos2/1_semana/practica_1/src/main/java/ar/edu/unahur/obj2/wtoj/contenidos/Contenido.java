package ar.edu.unahur.obj2.wtoj.contenidos;

public abstract class Contenido {
    private String titulo;
    private Double costoBase;
    
    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public Double costo(){
        return costoBase + doCosto();
    }

    public abstract Double doCosto();
    
}
