package com.example;

import java.util.Scanner;

public class Ex105_DoWhile {
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción:   ");
            opcion = input_scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1 elegida");
                    break;
                case 2:
                    System.out.println("Opción 2 elegida");
                    // Código para la opción 2
                    break;
                default:
                    System.out.println("Opción fuera del menú");
                    break;
            }
        } while (opcion != 3);

        input_scanner.close();
    }
}
