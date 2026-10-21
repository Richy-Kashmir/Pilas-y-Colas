
public class Nodo<T> {

    // ----- Atributos -----
    private T dato;
    private Nodo<T> siguiente;

    // ----- Constructores -----

    // Crea un nodo vacío (sin dato y sin siguiente). //
    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    // Crea un nodo con un dato y sin siguiente. //
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Crea un nodo con un dato y enlazado a otro nodo. //
    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    // ----- Getters y Setters -----

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    // ----- Métodos de ayuda -----

    // Devuelve true si este nodo tiene otro detrás. //
    public boolean tieneSiguiente() {
        return siguiente != null;
    }

    // Muestra el dato del nodo como texto. //
    @Override
    public String toString() {
        return String.valueOf(dato);
    }
}