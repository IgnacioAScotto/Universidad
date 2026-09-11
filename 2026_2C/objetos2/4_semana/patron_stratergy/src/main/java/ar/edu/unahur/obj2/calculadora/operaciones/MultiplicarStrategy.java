package ar.edu.unahur.obj2.calculadora.operaciones;

public class MultiplicarStrategy implements Operable{
    @Override
    public Double resolver(Double n1, Double n2){
        return n1 * n2;
    }
}
