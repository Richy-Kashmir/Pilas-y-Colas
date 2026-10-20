import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Queue<Character> cola = new LinkedList<>();
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
                    cola.offer(cliente.charAt(0));
                    System.out.println("Cliente " + cliente + " agregado a la cola.");
                    break;
                case 2:
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        char atendido = cola.poll();
                        System.out.println("Cliente atendido: " + atendido);
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Clientes en cola:");
                        for (Character c : cola) {
                            System.out.println("- " + c);
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
    }
}
