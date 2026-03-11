package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros(){

        byte numeroMuyPequeno = 127; 
        short numeroPequeno = 32000; 
        int numeroEntero = 2147483647;
        long numeroLargo = 9223372036854775807L; 

        System.out.println("Byte: " + numeroMuyPequeno);
        System.out.println("Short: " + numeroPequeno);
        System.out.println("Int: " + numeroEntero);
        System.out.println("Long: " + numeroLargo);
        

    }

    public static void demostrarFlotantes(){

        float decimalCorto = 3.1416f; 
        double decimalLargo = 3.14159265359; 

        System.out.println("Float: " + decimalCorto);
        System.out.println("Double: " + decimalLargo);

    }
    public static void demostrarCaracteres(){

        char letra = 'A'; 
        char codigoAscii = 65; 

        System.out.println("Char: " + letra + " (ASCII: " + (int) letra + ")");


    }
    public static void demostrarBooleanos(){

        boolean esVerdadero = true;
        boolean esFalso = false;

        System.out.println("Boolean: " + esVerdadero);

    }

    public static void demostrarValoresPorDefecto() {
        
        byte b = 0;           
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0F;
        double d = 0.0;
        char c = 0000; 
        boolean bool = false;

        System.out.println("byte por defecto:    " + b);
        System.out.println("short por defecto:   " + s);
        System.out.println("int por defecto:     " + i);
        System.out.println("long por defecto:    " + l);
        System.out.println("float por defecto:   " + f);
        System.out.println("double por defecto:  " + d);
        System.out.println("char por defecto:    " + c);
        System.out.println("boolean por defecto: " + bool);
    }
}
