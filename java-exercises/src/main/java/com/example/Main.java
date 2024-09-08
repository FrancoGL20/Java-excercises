package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int numberOne = scanner.nextInt();

        System.out.println("Enter a second number");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println("El resultado de la suma es " + sum);

        scanner.close();
    }
}