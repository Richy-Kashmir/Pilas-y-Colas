import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    public static void main (String[] args){
    Scanner leer = new Scanner(System.in);

        System.out.print("Introduce una línea de texto: ");
        String texto = leer.nextLine();

        // crear la pila de caracteres
        Stack<Character> pila = new Stack<>();

        // Ahora el "PUSH" para apilar
        for (int i=0; i<texto.length(); i++){
            pila.push(texto.charAt(i));
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