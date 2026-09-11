package ar.edu.unahur.obj2.excepcions;

public class Vehiculo {
    private final String patente;
    private Integer horasEstacionadas;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public void setHorasEstacionadas(Integer horas) throws HorasInvalidasException{
        if (horas <= 0) {
            throw new HorasInvalidasException("Las horas deben ser mayores a 0");
        }
        horasEstacionadas = horas;
    }

    public Integer costo() {
        return 5000 * horasEstacionadas;
    }

    @Override 
    public String toString() {
        return patente + "-= $" + costo();
    }
}