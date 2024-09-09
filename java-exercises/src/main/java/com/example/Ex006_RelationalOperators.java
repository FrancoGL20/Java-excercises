package com.example;

public class Ex006_RelationalOperators {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 20;

        boolean esMayor = (numero1 > numero2);
        boolean esMenor = (numero1 < numero2);
        boolean sonIguales = (numero1 == numero2);
        boolean sonDiferentes = (numero1 != numero2);

        System.out.println("¿Es numero1 mayor que numero2? " + esMayor);
        System.out.println("¿Es numero1 menor que numero2? " + esMenor);
        System.out.println("¿Son iguales? " + sonIguales);
        System.out.println("¿Son diferentes? " + sonDiferentes);
    }
}