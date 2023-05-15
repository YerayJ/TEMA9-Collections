package ejercicios;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Se define una lista
        LinkedHashSet<String> palabras = new LinkedHashSet<>();

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
