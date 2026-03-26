package com.example.ejemploSpringBoot.ejemplosPOO;

public class Moto implements  Vehiculo{
    private  int numeroRuedas;

    public Moto(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public void conducir() {
        System.out.println("Conducion una moto muy rapido y veloz");
    }
    @Override
    public int obtenernumeroruedas() {
        return getNumeroRuedas();
    }
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }



}
