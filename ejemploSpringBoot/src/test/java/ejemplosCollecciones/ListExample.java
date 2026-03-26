package ejemplosCollecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicado permitido
        fruits.add("Otro valor"); // Duplicado permitido
        System.out.println(fruits); // Salida: [Apple, Banana, Apple]
        System.out.println(fruits.get(1)); // Acceso por indice: Salida: Banana

        for (String s: fruits){
            System.out.println(s);
        }
        // Declaración e inicialización del ArrayList
        ArrayList<String> moreFruits = new ArrayList<>();

        // Agregar elementos
        moreFruits.add("Apple");
        moreFruits.add("Banana");
        moreFruits.add("Orange");

        // Acceso por índice
        System.out.println("First fruit: " + moreFruits.get(0)); // Salida: Apple

        // Mostrar toda la lista
        System.out.println("Lista completa: " + moreFruits);

        // Inserción al final
        moreFruits.add("Mango");

        // Eliminación del último elemento
        // .size() - 1 siempre nos da la posición del último elemento
        moreFruits.remove(moreFruits.size() - 1); // Elimina "Mango"

        moreFruits.add("Algarroba");
        moreFruits.addLast("fresa");
        moreFruits.addFirst("uva");


        // Recorrer el ArrayList (Bucle For-Each)
        System.out.println("Recorriendo la lista:");
        for (String fruit : moreFruits) {
            System.out.println(fruit);
        }

        // Implementación de una lista doblemente ligada
        LinkedList<String> fruitsListaLigada = new LinkedList<>();

        // Agregar elementos a la LinkedList
        fruitsListaLigada.add("Apple");
        fruitsListaLigada.add("Banana");
        fruitsListaLigada.add("Orange");
        fruitsListaLigada.add("Mango");

        // Imprimir la lista original
        System.out.println("Original LinkedList: " + fruitsListaLigada);

        // Agregar un elemento en una posición específica
        fruitsListaLigada.add(2, "Pineapple"); // Agrega "Pineapple" en la posición 2
        System.out.println("After adding Pineapple: " + fruitsListaLigada);

        // Eliminar un elemento
        fruitsListaLigada.remove("Banana"); // Elimina "Banana"
        System.out.println("After removing Banana: " + fruitsListaLigada);

        // Acceder a un elemento por índice
        String firstFruit = fruitsListaLigada.get(0);
        System.out.println("First fruit: " + firstFruit); // Salida: Apple

        // Recorrer la LinkedList usando un bucle for-each
        System.out.println("Fruits in the list:");
        for (String fruit : fruitsListaLigada) {
            System.out.println(fruit);
        }

        // Verificar si la lista contiene un elemento
        boolean hasMango = fruitsListaLigada.contains("Mango");
        System.out.println("Contains Mango? " + hasMango); // Salida: true

        // Obtener el tamaño de la LinkedList
        int size = fruitsListaLigada.size();
        System.out.println("Size of the list: " + size); // Salida: 4

    }
}