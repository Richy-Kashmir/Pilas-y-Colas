import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = leer.nextInt();

        // Caso especial: si el número es 0, su binario es "0"
        if (numero == 0) {
            System.out.println("Binario: 0");
            return;
        }

        // Crear pila con capacidad suficiente
        Pilas pila = new Pilas(32);
        // 32 bits para enteros normales

        int n = numero;

        //  Divisiones sucesivas entre 2
        while (n > 0) {
            int resto = n % 2;      // resto (0 o 1)
            pila.push((char)(resto + '0'));  // convertir a carácter '0' o '1'
            n = n / 2;              // división entera
        }

        //  Desapilar para obtener el binario
        StringBuilder binario = new StringBuilder();

        while (!pila.isEmpty()) {
            binario.append(pila.pop());
        }

        System.out.println("Binario de " + numero + ": " + binario.toString());

        leer.close();
    }
}