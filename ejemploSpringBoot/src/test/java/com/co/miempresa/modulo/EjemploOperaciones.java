package com.co.miempresa.modulo;

import java.util.StringTokenizer;

public class EjemploOperaciones {
    public  int sumar(int a, int b){
        return  a + b;
    }
    public void  probarTokenizer(){
        StringTokenizer st= new StringTokenizer("1990-07-15","-");
        System.out.println("Cuantos token quedan = " +st.countTokens());
        System.out.println("Primer Toker año = " +st.nextToken());
        System.out.println("Primer Toker mes = " +st.nextToken());
        System.out.println("Primer Toker dia = " +st.nextToken());
        System.out.println("Cuantos token quedan = " +st.countTokens());

        String eo = "oe , oe, eso . que bien ; dale - no mas";

        String[] p = eo.split("[,.;-]");

        for (String prueba : p) {
            System.out.println(prueba);
        }
    }
}
