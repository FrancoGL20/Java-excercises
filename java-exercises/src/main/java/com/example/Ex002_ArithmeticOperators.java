package com.example;

public class Ex002_ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double c = 2.4;
    
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int divisionEntera = a / b;
        double divisionConDecimal = a / c;
        int modulo = a % b;
    
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + divisionEntera);
        System.out.println("División con decimal: " + divisionConDecimal);
        System.out.println("Módulo: " + modulo);
    }
}
