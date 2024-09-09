package com.example;

import java.util.Scanner;

public class Ex001_InputAndOutputOfData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int numberOne = scanner.nextInt();

        System.out.println("Enter a second number");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;

        System.out.println("The result of the sum is " + sum);

        scanner.close();
    }
}