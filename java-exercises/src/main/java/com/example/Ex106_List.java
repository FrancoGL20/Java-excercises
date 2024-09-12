package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Ex106_List {
    public static void main(String[] args) {

        // * ArrayList
        System.out.println("\nArrayList");
        ArrayList<String> frutas = new ArrayList<>();

        // Añadir elementos a la lista
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        // Acceso por índice
        System.out.println("Fruta en el índice 1: " + frutas.get(1));  // Banana

        // Modificar un elemento
        frutas.set(1, "Mango");
        System.out.println("Fruta modificada en el índice 1: " + frutas.get(1));  // Mango

        // Eliminar un elemento
        frutas.remove(2);  // Elimina "Cereza"

        // Recorrer la lista
        for (String fruta : frutas) {
            System.out.println(fruta);
        }



        // * LinkedList
        System.out.println("\nLinkedList");
        LinkedList<String> animales = new LinkedList<>();

        // Añadir elementos al inicio y al final
        animales.addFirst("Perro");
        animales.addLast("Gato");
        animales.add("Conejo");

        // Acceso por índice
        System.out.println("Primer animal: " + animales.getFirst());  // Perro
        System.out.println("Último animal: " + animales.getLast());  // Conejo

        // Eliminar el primer elemento
        animales.removeFirst();  // Elimina "Perro"

        // Recorrer la lista
        for (String animal : animales) {
            System.out.println(animal);
        }
        


        // * Vector
        System.out.println("\nVector");
        Vector<String> colores = new Vector<>();

        // Añadir elementos al vector
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        // Acceso por índice
        System.out.println("Color en el índice 1: " + colores.get(1));  // Verde

        // Eliminar un elemento
        colores.remove(2);  // Elimina "Azul"

        // Recorrer el vector
        for (String color : colores) {
            System.out.println(color);
        }



        // * Stack
        System.out.println("\nStack");
        Stack<String> pila = new Stack<>();

        // Añadir elementos a la pila
        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3");

        // Ver el elemento en la cima de la pila
        System.out.println("Elemento en la cima: " + pila.peek());  // Libro 3

        // Eliminar el elemento en la cima
        pila.pop();  // Elimina "Libro 3"

        // Recorrer la pila
        for (String libro : pila) {
            System.out.println(libro);
        }
    }
}
