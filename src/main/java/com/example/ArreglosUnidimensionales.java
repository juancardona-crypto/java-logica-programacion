package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;

        int[] valores = {1, 2, 3, 4, 5};

        String[] nombres = new String[]{"Ana", "Luis", "María"};

        System.out.println("Ejemplos creados:");
        System.out.println("numeros[2] = " + numeros[2]);
        System.out.println("valores.length = " + valores.length);
    }

    public static void mostrarLongitud() {
        double[] temperaturas = {23.5, 24.0, 22.8, 25.1};
        System.out.println("Cantidad de elementos: " + temperaturas.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (String dia : dias) {
            System.out.println(dia);
        }
    }

    public static void arrayComoParametroYRetorno() {
        int[] datos = {5, 8, 3, 12, 7};
        int[] duplicados = duplicarArray(datos);

        System.out.print("Array duplicado: ");
        for (int n : duplicados) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] duplicarArray(int[] arr) {
        int[] resultado = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultado[i] = arr[i] * 2;
        }
        return resultado;
    }

}
