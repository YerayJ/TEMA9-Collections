package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de una lista
        TreeMap<Integer, Integer> numeros = new TreeMap<>();
        // Creación de una lista
        TreeMap<Integer, Integer> estrellas = new TreeMap<>();

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Atributo número para introducir
        int num;

        // Atributo que comprueba si quiere seguir metiendo números
        String seguir;

        do {
            // Introduce los números
            for (int i = 0; i < 5; i++) {
                num = key.nextInt();
                key.nextLine();
                if (numeros.) {

                }
                numeros.put(num, 1);
            }

            seguir = key.nextLine();
        } while (seguir.equals("Si") || seguir.equals("si"));

    }
}
