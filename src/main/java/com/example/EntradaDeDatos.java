package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un entero: ");
        int entero = scanner.nextInt();

        System.out.print("Ingrese un double: ");
        double decimal = scanner.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        System.out.print("Ingrese una frase completa: ");
        String frase = scanner.nextLine();

        System.out.println("entero  = " + entero);
        System.out.println("double  = " + decimal);
        System.out.println("palabra = " + palabra);
        System.out.println("frase   = " + frase);

    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese edad (número): ");
        int edad = scanner.nextInt();

        scanner.nextLine(); // 

        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);

    }

}
