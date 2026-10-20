public class Colas{

    // almacena los caracteres
    private char[] datos;
    // apunta al primer elemto
    private int frente;
    //apunta al siguiente hueco libre
    private int fin;

    public Colas(int capacidad) {
        datos = new char[capacidad];
        frente = 0;
        fin = 0;
    }

    public void enqueue(char c) {
        datos[fin++] = c;
    }

    public char dequeue() {
        return datos[frente++];
    }

    public boolean isEmpty() {
        return frente == fin;
    }
}
