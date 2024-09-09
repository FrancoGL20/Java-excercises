package com.example;

public class Ex004_EqualityAndAllocation {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        boolean sonIguales = (num1 == num2);
        boolean sonDiferentes = (num1 != num2);

        System.out.println("¿Son iguales? " + sonIguales);
        System.out.println("¿Son diferentes? " + sonDiferentes);

        num1 += 5; // Equivalente a num1 = num1 + 5;
        System.out.println("Nuevo valor de num1: " + num1);
    }
}
