package com.example.ejemploSpringBoot.ejemplosPOO;

public class Animal {
    private  String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void hacerSonido(){
        System.out.println("el animal "+ nombre+" hace sonido");
    }
}
