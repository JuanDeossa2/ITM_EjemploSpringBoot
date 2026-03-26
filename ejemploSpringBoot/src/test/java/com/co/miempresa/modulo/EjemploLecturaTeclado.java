package com.co.miempresa.modulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjemploLecturaTeclado {
    public  void primeraLectura(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Por favor Digite");
            String digito = in.readLine();
            System.out.println("Usted digitó " + digito);
        } catch (IOException e) {
            System.out.println("ocurrio un error de lectura ");
        }
    }
    public void segundaLectura() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un Numero :  ");
        String variableString = input.nextLine();
        System.out.println("Usted digitó:  " + variableString);
        try {
            int numero = Integer.parseInt(variableString);
            System.out.println("Numero mas 1 " + ++numero);
        }catch (NumberFormatException e){
            System.out.println("No digito un numero");
        }
    }
}
