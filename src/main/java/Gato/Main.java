package Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 9 caracteres (solo X,O, _): ");
        String input = teclado.nextLine();
        String input2 = input.toUpperCase();

        if (input2.length() != 9) {
            System.out.println("Error mi chavo, la cadena solo es de 9 caracteres");
            return;
        }
        for (int i = 0; i < input2.length(); i++) {
            if (input2.charAt(i) != 'X' && input2.charAt(i) != 'O' && input2.charAt(i) != '_') {
                System.out.println("Solo son posibles los caracteres X,O,_");
                return;
            }
        }
        System.out.println("Introduciste la cadena: " + input2);
        System.out.println("-----");
        System.out.println("|" + input2.charAt(0) + input2.charAt(1) + input2.charAt(2) + "|");
        System.out.println("|" + input2.charAt(3) + input2.charAt(4) + input2.charAt(5) + "|");
        System.out.println("|" + input2.charAt(6) + input2.charAt(7) + input2.charAt(8) + "|");
        System.out.println("-----");
    }
}




