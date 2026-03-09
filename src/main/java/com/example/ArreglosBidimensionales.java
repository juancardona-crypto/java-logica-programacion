package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz = new int[3][4];

        int[][] tabla = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[][] tablero = new String[3][3];

        System.out.println("matriz filas: " + matriz.length);
        System.out.println("matriz columnas primera fila: " + matriz[0].length);
    }

    public static void recorrerMatriz() {
        int[][] numeros = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrizB = {
                {5, 6},
                {7, 8}
        };

        int[][] suma = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Suma de matrices:");
        for (int[] fila : suma) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
