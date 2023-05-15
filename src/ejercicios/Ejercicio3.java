package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Se define una lista
        TreeSet<String> palabras = new TreeSet<>();

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Atributo que contiene lo que se pasa por teclado
        String lectura;

        do {

            // Lee por escáner datos
            lectura = key.nextLine();

            // Añade la palabra
            if (!lectura.equals("fin")) {
                palabras.add(lectura);
            }

        } while (!lectura.equals("fin"));

        System.out.println(palabras);
    }
}
