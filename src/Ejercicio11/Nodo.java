package Ejercicio11;

public class Nodo {
    public int dato;
    public Nodo siguienteNodo;

    Nodo(int dato) {
        this.dato = dato;
        this.siguienteNodo = this;
    }
}
