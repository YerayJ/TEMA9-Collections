package ejercicios;

import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Se define una lista
        TreeSet<Integer> numeros = new TreeSet<Integer>();

        do {
            // Añade un número a la lista
            numeros.add((int) (Math.random() * 99 + 1));
        } while (numeros.size() < 20); // Se ejecuta mientras el tamaño sea menor que 20

        // Imprime resultado
        System.out.println(numeros);
        System.out.println(numeros.size());

    }
}
