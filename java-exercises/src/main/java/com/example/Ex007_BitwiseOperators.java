package com.example;

public class Ex007_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // En binario: 00000101
        int b = 3; // En binario: 00000011

        // AND
        System.out.println("And: " + (a & b)); // 00000001 (1 en decimal)

        // OR
        System.out.println("Or: " + (a | b)); // 00000111 (7 en decimal)

        // XOR
        System.out.println("Xor: " + (a ^ b)); // 00000110 (6 en decimal)

        // NOT
        System.out.println("Not: " + ~a); // 11111010 (en complemento a dos, representa -6 en decimal)

        // Desplazamiento a la izquierda
        System.out.println("desplazamiento Izquierda 2 veces: " + (a << 2)); // 00010100 (20 en decimal)

        // Desplazamiento a la derecha
        System.out.println("desplazamiento Derecha 1 vez: " + (a >> 1)); // 00000010 (2 en decimal)
    }
}
