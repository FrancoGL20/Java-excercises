package com.example;

public class Ex005_LogicalOperators {
    public static void main(String[] args) {
        int edad = 25;
        boolean tieneLicencia = true;

        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("¿Puede conducir? " + puedeConducir);

        boolean esMayorDeEdadOTieneLicencia = (edad >= 18) || tieneLicencia;
        System.out.println("¿Es mayor de edad o tiene licencia? " + esMayorDeEdadOTieneLicencia);
    }
}
