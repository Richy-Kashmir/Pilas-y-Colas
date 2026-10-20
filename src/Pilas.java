public class Pilas {

    // almacena los caracteres
    private char[] datos;
    // apunta al último elemento
    private int tope;

    public Pilas(int capacidad) {
        datos = new char[capacidad];
        tope = -1;
    }

    public void push(char c) {
        // Esto es lo mismo que tope = tope + 1;
        datos[++tope] = c;
    }

    public char pop() {
        // Y esto otro es lo mismo que tope = tope - 1;
        return datos[tope--];
    }

    public boolean isEmpty() {
        return tope == -1;
    }
}
