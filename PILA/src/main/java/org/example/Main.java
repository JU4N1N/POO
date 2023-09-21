package org.example;

public class Main {
    public static void main(String[] args) {
        Pila duracell = new Pila();

        duracell.ingresarNodo();
        duracell.ingresarNodo();
        duracell.ingresarNodo();
        duracell.ingresarNodo();
        System.out.println("La pila es...");
        duracell.mostrarPila();
        duracell.buscarNodo();
        duracell.eliminarNodo();
        System.out.println("La pila ahora es...");
        duracell.mostrarPila();
    }
}