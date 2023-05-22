package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creación de una lista
        TreeMap<Integer, Integer> numeros = new TreeMap<>();
        // Creación de una lista
        TreeMap<Integer, Integer> estrellas = new TreeMap<>();
        // Atributo para guardar la clave como objeto
        Object clave;
        // Atributo donde guardamos el número en tipo int
        int codigo;

        // Atributo número para introducir por el usuario
        int num;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        // Atributo que comprueba si quiere seguir metiendo números
        String seguir;

        do {
            // Introduce los números
            for (int i = 0; i < 5; i++) {
                // Introduce el número
                System.out.println("Mete un número: ");
                num = key.nextInt();
                key.nextLine();
                // Inserta el número con el put y lo guarda en la clave de tipo object
                clave = numeros.put(num, 1);

                // Comprueba si la clave es distinta de null
                if (clave != null) {
                    // Hace un cast a la clave y la guarda en otra variable
                    codigo = (int) clave;
                    // Reemplaza el código más uno
                    numeros.replace(num, codigo + 1);
                }
            }

            // Introduce los números
            for (int i = 0; i < 2; i++) {

                    System.out.println("Mete una estrella: ");
                    num = key.nextInt();
                    key.nextLine();

                clave = estrellas.put(num, 1);

                if (clave != null) {
                    codigo = (int) clave;
                    estrellas.replace(num, codigo + 1);
                }
            }

            // Imprime las estrellas y números
            System.out.println("---Números---");
            System.out.println(numeros);
            System.out.println("\n---Estrellas---");
            System.out.println(estrellas);

            System.out.println("¿Quieres seguir?: ");
            seguir = key.nextLine();
        } while (seguir.equalsIgnoreCase("Si"));



    }
}
