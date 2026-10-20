import java.util.Scanner;


public class Ejercicio1 {
    public static void main (String[] args){
    Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una línea de texto: ");
        String texto = leer.nextLine();

        // Llamamos a la clase Pilas y creamos un objeto
        Pilas pila = new Pilas(texto.length());

        // Ahora el "PUSH" para apilar
        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        // desapilar y mostrar
        StringBuilder inversa = new StringBuilder();
        while (!pila.isEmpty()) {
            inversa.append(pila.pop());
        }
        System.out.println("Texto invertido: " + inversa.toString());

        leer.close();
    }
}