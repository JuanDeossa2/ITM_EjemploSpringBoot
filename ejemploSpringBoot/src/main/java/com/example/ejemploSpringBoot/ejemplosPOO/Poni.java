package com.example.ejemploSpringBoot.ejemplosPOO;

public class Poni extends Caballo{

    public Poni(String nombre) {
        super(nombre);
    }

    @Override
    public String traerEspecialidad() {
        return "Ser bonito";
    }
    public  void  hacerSonido(){
        System.out.println("El animal " + getNombre()+ "relincha con graci y se enoja");
    }
}
