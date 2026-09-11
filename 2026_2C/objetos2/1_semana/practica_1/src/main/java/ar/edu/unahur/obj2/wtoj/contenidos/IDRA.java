package ar.edu.unahur.obj2.wtoj.contenidos;

public class IDRA {
    private Double canon = 0.5;
    private static IDRA instance = new IDRA();

    private IDRA() {}
    
    public static IDRA getInstance() {
        return instance;
    }

    public void setCanon(Double canon) {
        this.canon = canon;
    }

    public Double getCanon() {
        return canon;
    }
}
