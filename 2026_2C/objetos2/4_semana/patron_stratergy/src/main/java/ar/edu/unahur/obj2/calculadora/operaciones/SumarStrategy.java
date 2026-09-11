package ar.edu.unahur.obj2.calculadora.operaciones;

public class SumarStrategy implements Operable{
    @Override
    public Double resolver(Double n1, Double n2){
        return n1 + n2;
    }
}
