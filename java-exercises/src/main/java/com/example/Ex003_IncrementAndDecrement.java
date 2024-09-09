package com.example;

public class Ex003_IncrementAndDecrement {
    public static void main(String[] args) {
        int x = 5;

        // Prefijo
        int y = ++x; // x ahora vale 6, y también vale 6
        System.out.println(x); // Imprime 6
        System.out.println(y); // Imprime 6

        // Postfijo
        int z = x--; // z vale 6, pero x ahora vale 5
        System.out.println(x); // Imprime 5
        System.out.println(z); // Imprime 6
    }
}
