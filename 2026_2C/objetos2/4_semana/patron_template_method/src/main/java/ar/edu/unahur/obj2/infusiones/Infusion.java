package ar.edu.unahur.obj2.infusiones;

public abstract class Infusion {
    public String calentarAgua(){
        return "Calentar agua \n";
    }

    public abstract String pasoEspecifico();

    public String preparar(){
        return this.calentarAgua() + this.pasoEspecifico();
    }
}