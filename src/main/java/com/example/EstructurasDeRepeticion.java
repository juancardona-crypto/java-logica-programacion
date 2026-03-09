package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        int i = 1;
        while (i <= 5) {
            System.out.println("While: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        int i = 1;
        do {
            System.out.println("Do-While: " + i);
            i++;
        } while (i <= 5);
    }

    public static void ejemploForClasico() {
        for (int i = 0; i < 5; i++) {
            System.out.println("For: " + i);
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue;
            if (i == 7) break;
            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        externo:
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i * j > 10) break externo;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
