import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Cola de caracteres con capacidad fija
        Colas cola = new Colas(10);
        int opcion;

        do {
            System.out.println("--- Gestión de Cola de Clientes ---");
            System.out.println("1. Llegada cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el nombre del cliente: ");
                    String cliente = leer.nextLine();

                    if (cliente.trim().isEmpty()) {
                        System.out.println("Debes introducir un nombre.");
                        break;
                    }

                    // Es para agregar el primer carácter del nombre
                    cola.enqueue(cliente.charAt(0));
                    System.out.println("Cliente " + cliente + " agregado a la cola.");
                    break;

                case 2:
                    // Para atender cliente
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        char atendido = cola.dequeue();
                        System.out.println("Cliente atendido: " + atendido);
                    }
                    break;

                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Clientes en cola:");
                        Colas auxiliar = new Colas(10);

                        // En este bucle sirve para mostrar los elementos y mantenerlos en la cola
                        while (!cola.isEmpty()) {
                            char clienteActual = cola.dequeue();
                            System.out.println("- " + clienteActual);
                            auxiliar.enqueue(clienteActual);
                        }

                        // Aquí se restauran los elementos a la cola original
                        while (!auxiliar.isEmpty()) {
                            cola.enqueue(auxiliar.dequeue());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 4);

        leer.close();
    }
}
