package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo");
        }
    }

    public static void ejemploIfElse() {
        int numero = -5;
        if (numero >= 0) {
            System.out.println("No negativo");
        } else {
            System.out.println("Negativo");
        }
    }

    public static void ejemploIfElseIfElse() {
        int calificacion = 75;
        if (calificacion >= 90) {
            System.out.println("A");
        } else if (calificacion >= 80) {
            System.out.println("B");
        } else if (calificacion >= 70) {
            System.out.println("C");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void ejemploSwitch() {
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Otro día");
        }
    }

    public static void ejemploSwitchExpression() {
        // Java 14+
        String dia = "MIERCOLES";
        String tipo = switch (dia) {
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> "Laborable";
            case "SABADO", "DOMINGO" -> "Fin de semana";
            default -> "Desconocido";
        };
        System.out.println(tipo);
    }

}
