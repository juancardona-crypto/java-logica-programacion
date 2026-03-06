package com.example;

public class Operadores {

    public static void demostrarAritmeticos(){
        int suma = 4 + 5;
        int resta = 4 - 5;
        int multiplicacion = 4 * 5;
        double division = 4.0 / 3;
        int modulo = 25 % 5;

        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
    }

    public static void dimostrarIncrementoDecremento(){
        int num = 4;
        num += 1;
        //incremento:
        num++;
        System.out.println("incremento: " + num);
        //decremento:
        num--;
        System.out.println("decremento: " + num);


    }

    public static void demostrarRelaciones(){
        boolean i = 4 > 5;
        boolean ii = 4 >= 5;
        boolean iii = 4 < 5;
        boolean iv = 4 <= 5;
        boolean v = 4 == 5;
        boolean vi = 4 != 5;
        
        System.out.println(i);
        System.out.println(ii);
        System.out.println(iii);
        System.out.println(iv);
        System.out.println(v);
        System.out.println(vi);
    }

    public static void demostrarLogicos(){
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero && verdadero);
        System.out.println(verdadero && falso);
        System.out.println(verdadero || verdadero);
        System.out.println(verdadero || falso);
        System.out.println(!verdadero);
        System.out.println(!falso);
    }

    public static void demostrarAsignacionCompuesta() {
        int num = 10;

        num += 4;
        num -= 4;
        num *= 4;
        num /= 4;
        num %= 4;

        System.out.println("asignacion compuesta: " + num);
        System.out.println("num += 4: " + (num += 4));
        System.out.println("num -= 4: " + (num -= 4));
        System.out.println("num *= 4: " + (num *= 4));
        System.out.println("num /= 4: " + (num /= 4));
        System.out.println("num %= 4: " + (num %= 4));
    }

    public static void demostrarOperadorTernario() {

        int edad = 17;

        String tieneAcceso = (edad >= 18)? "si" : "no";
        System.out.println("Tiene acceso: " + tieneAcceso);
       
    }
}
