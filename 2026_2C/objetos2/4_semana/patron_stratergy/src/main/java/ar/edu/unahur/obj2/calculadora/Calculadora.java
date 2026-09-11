package ar.edu.unahur.obj2.calculadora;

import ar.edu.unahur.obj2.calculadora.operaciones.Operable;

public class Calculadora {
    private Operable estrategia;

    public Calculadora(Operable estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(Operable estrategia){
        this.estrategia = estrategia;
    }

    public Double resolver(Double n1, Double n2){
        return estrategia.resolver(n1, n2);
    }
}
