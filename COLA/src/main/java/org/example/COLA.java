package org.example;

import java.util.Scanner;

public class COLA {
    Nodo head;
    Nodo tail;
    Scanner teclado = new Scanner(System.in);
    public COLA(){
        head = null;
        tail = null;
    }

    public void insertarNodo(){
        Nodo nuevo = new Nodo();
        System.out.println("Ingresar el dato del Nodo: ");
        nuevo.dato = teclado.nextInt();
        if(head == null){
            head = nuevo;
            head.siguiente = null;
            tail = nuevo;
        }else{
            tail.siguiente = nuevo;
            nuevo.siguiente = null;
            tail = nuevo;
        }
        System.out.println("Nodo ingresado (:");
    }

    public void mostrarCola(){
        Nodo act = new Nodo();
        act = head;
        if(head != null){
            while(act != null){
                System.out.print(" " + act.dato + " -> ");
                act = act.siguiente;
            }
        }else{
            System.out.println("La cola está vacía");
        }
    }

    public void buscarNodo(){
        Nodo act = new Nodo();
        act = head;
        boolean encontrado = false;
        System.out.println("\nIngrese el dato a buscar: ");
        int search = teclado.nextInt();
        if(head != null){
            while(act != null && encontrado != true){
                if(act.dato == search){
                    System.out.println("Dato encontrado");
                    encontrado = true;
                }
                act = act.siguiente;
            }
            if(!encontrado){
                System.out.println("Dato no encontrado :(");
            }
        }else{
            System.out.println("La cola está vacía");
        }
    }

    public void eliminarNodo(){
        Nodo act = new Nodo();
        act = head;
        Nodo ant = new Nodo();
        ant = null;
        boolean encontrado = false;
        System.out.println("\nIngrese el primer dato de la cola: ");
        int search = teclado.nextInt();
        if(head != null){
            while(act != null && encontrado != true){
                if(act.dato == search){
                    if(act == tail){
                        ant.siguiente = null;
                        tail = ant;
                    }else{
                        ant.siguiente = act.siguiente;
                    }
                    System.out.println("Dato eliminado");
                    encontrado = true;
                }
                ant = act;
                act = act.siguiente;
            }
        }else{
            System.out.println("La cola está vacía");
        }
    }
}
