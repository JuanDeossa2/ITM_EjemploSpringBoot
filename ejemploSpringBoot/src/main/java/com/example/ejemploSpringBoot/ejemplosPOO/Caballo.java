package com.example.ejemploSpringBoot.ejemplosPOO;

public abstract class Caballo extends Animal{

    public Caballo(String nombre) {
        super(nombre);
    }
    public  abstract String traerEspecialidad();

    public int numeroPatas;

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public  void  hacerSonido(){
        System.out.println("El animal " + getNombre()+ "re lincha");
    }

}
