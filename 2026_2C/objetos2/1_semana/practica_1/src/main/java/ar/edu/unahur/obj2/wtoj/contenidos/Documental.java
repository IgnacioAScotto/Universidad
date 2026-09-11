package ar.edu.unahur.obj2.wtoj.contenidos;

public class Documental extends Contenido{
    // private static Double valorIDRA = 0.5;

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    public Double doCosto() {
        // return valorIDRA;
        return IDRA.getInstance().getCanon();
    }

}
