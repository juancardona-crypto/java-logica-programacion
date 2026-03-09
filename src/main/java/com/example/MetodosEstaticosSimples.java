package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        saludar();
    }

    public static void saludar() {
        System.out.println("¡Hola desde método estático!");
    }

    public static void ejemploPasoParametros() {
        mostrarSuma(8, 12);
    }

    public static void mostrarSuma(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void ejemploRetornoValores() {
        double resultado = calcularAreaCirculo(5.0);
        System.out.println("Área: " + resultado);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static void ejemploSobrecarga() {
        System.out.println(sumar(3, 4));
        System.out.println(sumar(2.5, 3.5));
        System.out.println(sumar(1, 2, 3));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

}
