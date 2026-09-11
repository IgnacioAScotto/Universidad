package ar.edu.unahur.obj2.wtoj.contenidos;

public class Episodio extends Contenido{
    private final Integer numero;

    public Episodio(String titulo, Double costoBase, Integer numero) {
        super(titulo, costoBase);
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public Double doCosto() {
        return 0.0;
    }
}
