package org.example;

import java.util.Scanner;

public class Pila {
    Nodo primero;
    Scanner teclado = new Scanner(System.in);
    public Pila(){
        primero = null;
    }

    public void ingresarNodo(){
        Nodo nuevo = new Nodo();
        System.out.println("Ingrese el dato: ");
        nuevo.dato = teclado.nextInt();
        nuevo.siguiente = primero;
        primero = nuevo;
        System.out.println("Nodo creado con éxito");
    }

    public void mostrarPila(){
        Nodo act = new Nodo();
        act = primero;
        if(primero != null){
            while (act != null){
                System.out.print(" " + act.dato + " -> ");
                act = act.siguiente;
            }
        }else{
            System.out.println("La pila está vacía");
        }
    }

    public void buscarNodo(){
        Nodo act = new Nodo();
        act = primero;
        boolean encontrado = false;
        System.out.println("\nIngrese el dato a buscar: ");
        int nodosearch = teclado.nextInt();
        if(primero != null){
            while (act != null && encontrado != true){
                if(act.dato == nodosearch){
                    System.out.println("Nodo " + nodosearch + " encontrado (:");
                    encontrado = true;
                }
                act = act.siguiente;
            }
            if(!encontrado){
                System.out.println("Ese dato no existe :(");
            }
        }else{
            System.out.println("La pila está vacía");
        }
    }

    public void eliminarNodo(){
        Nodo act = new Nodo();
        act = primero;
        if(primero != null){
            while (act == primero){
                primero = primero.siguiente;
                System.out.println("Nodo eliminado (:");
            }
        }else{
            System.out.println("La pila está vacía");
        }
    }
}
