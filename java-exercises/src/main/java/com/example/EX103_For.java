package com.example;

public class EX103_For {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " "); // Imprime una tabla de multiplicar de 3x3
            }
            System.out.println();
        }
    }
}
