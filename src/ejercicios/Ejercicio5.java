package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declara lista de pares valores
        HashMap<String, Double> productos = new HashMap<>();

        // Atributo para elegir la opción
        int opc;

        // Atributos: nombre y precio de los artículos
        double precio;
        String nombre;

        // Creación de un objeto de tipo Object para guardar el resultado y comprobar que es correcto
        Object producto;

        // Creación de escáner
        Scanner key = new Scanner(System.in);

        do {
            menu();
            // Pide al usuario la opción
            System.out.println("Elija una opción: ");
            opc = key.nextInt();
            key.nextLine();

            switch (opc) {
                case 1 -> { // Alta de producto
                    System.out.println("Introduce un nombre: ");
                    nombre = key.nextLine();
                    System.out.println("Introduce un precio: ");
                    precio = key.nextDouble();

                    // Inserta los datos en la lista
                    producto = productos.put(nombre,precio);

                    if (producto == null) { // Comprobación de producto, si está a null significa que no ha registrado los datos
                        System.out.println("Se ha registrado el producto");
                    } else { // Si no significa que el producto ya existe
                        System.out.println("El producto ya existe");
                    }

                }
                case 2 -> { // Baja de producto
                    System.out.println("Introduce un nombre: ");
                    nombre = key.nextLine();

                    // Elimina el producto por el nombre
                    producto = productos.remove(nombre);

                    if (producto != null) { // Comprobación de producto, si está a null significa que no ha registrado los datos
                        System.out.println("Se ha eliminado el producto");
                    } else { // Si no significa que el producto ya existe
                        System.out.println("El producto no se encuentra");
                    }

                }
                case 3 -> { // Listar productos
                    System.out.println(productos);
                }
                case 0 -> {
                    System.out.println("Está saliendo...");
                }

            }

        } while (opc != 0);

    }

    /**
     * Método para mostrar el menú
     */
    static public void menu() {
        System.out.println("\n--------------PRODUCTOS--------------" +
                "\n1. Alta de producto" +
                "\n2. Baja de producto" +
                "\n3. Listar existencias" +
                "\n0. Salir");
    }
}
