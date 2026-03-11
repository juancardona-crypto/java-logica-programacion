package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {
    
    public static void ejemploTryCatchDivision() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }

    public static void ejemploTryCatchInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero válido");
        }
    }

    public static void ejemploTryCatchFinally() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();
            System.out.println("Edad registrada: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida");
        } finally {
            System.out.println("Bloque finally → cerrando recursos si fuera necesario");
        }
    }

    public static void evitarCierrePrograma() {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número positivo: ");
                numero = scanner.nextInt();
                if (numero > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("Debe ser positivo. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: ingrese solo números enteros.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Número válido ingresado: " + numero);
    }
}
