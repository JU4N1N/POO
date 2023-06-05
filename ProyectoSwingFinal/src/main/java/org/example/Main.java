package org.example;

import org.example.controlador.ControladorBicicleta;
import org.example.vista.VentanaBici;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaBici view = new VentanaBici("MVC Bicicletas");
        ControladorBicicleta controller = new ControladorBicicleta(view);
    }
}