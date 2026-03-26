package com.example.ejemploSpringBoot.ejemplosPOO;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }
    public  void  hacerSonido(){
        System.out.println("el perro hace sonido");
    }
}
