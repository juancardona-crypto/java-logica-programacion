package com.example;

public class VariablesYConstantes {
    public static void demostrarAclaracionAsignacion(){
        int año;
        año = 2025;

        int edad = 17;

        var nombre = "juan diego";

        String apellido = "cardona";

        System.out.println("hola " + nombre + " " + apellido + " " + "tienes " + edad + " años de edad y actualmente vives en el año" + año);
    }

    public static void demostrarConvencionesNombres(){
        int depositoCuenta = 2500000;

        var nombreMadre = "Sirley";

        String nombrePadre = "William";

        boolean estanVivos = true;

        System.out.println("hola señora " + nombreMadre + " y señor " + nombrePadre + " me comentaro que " + (estanVivos ? "si" : "no") + " estan vivos");

    }

    public static final int NOTA_MINIMA = 6;
    public static final int NOTA_MAXIMA = 10;
    public static final double PI = 3.14159;

    public static void demostrarConstantes(){
        System.out.println("Nota mínima para aprobar: " + NOTA_MINIMA);
        
        int miNota = 7;
        if (miNota >= NOTA_MINIMA) {
            System.out.println("mi nota es " + miNota +  " \nAprobado!");
        }
    }

}
