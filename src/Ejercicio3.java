import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una palabra o frase: ");
        String texto = leer.nextLine();

        // Normalizar texto para ignorar mayúsculas y espacios
        texto = texto.toLowerCase().replace(" ", "");

        //  Crear PILA y COLA con capacidad suficiente
        Pilas pila = new Pilas(texto.length());
        Colas cola = new Colas(texto.length());

        // Insertar caracteres en ambas estructuras
        for (char c : texto.toCharArray()) {
            pila.push(c);     // PUSH
            cola.enqueue(c);  // ENQUEUE
        }

        // Comparar desapilando y desencolando
        boolean esPalindroma = true;

        // En este bucle compara los caracteres desde la pila y la cola
        while (!pila.isEmpty() && !cola.isEmpty()) {
            char desdePila = pila.pop();      // POP
            char desdeCola = cola.dequeue();  // DEQUEUE


            // Si los caracteres no coinciden, ya no es palíndroma
      if (desdePila != desdeCola) {
                esPalindroma = false;
                break;
            }
        }

        //  Y aquí el resultado
        if (esPalindroma) {
            System.out.println("Es palíndroma.");
        } else {
            System.out.println("No es palíndroma.");
        }

        leer.close();
    }
}
