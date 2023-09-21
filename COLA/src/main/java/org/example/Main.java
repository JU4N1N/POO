package org.example;

public class Main {
    public static void main(String[] args) {
       COLA tails = new COLA();
        tails.insertarNodo();
        tails.insertarNodo();
        tails.insertarNodo();
        System.out.println("La cola es...");
        tails.mostrarCola();
        tails.buscarNodo();
        tails.eliminarNodo();
        System.out.println("Ahora la cola es...");
        tails.mostrarCola();
    }
}