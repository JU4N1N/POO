package org.example;

public class Nodo {
    public int dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo() {
    }

    public Nodo(int dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

}
