package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito(){
    int edad = 25;
    double año = edad;

    System.out.println(año);
    }
    public static void demostrarCastingExplicito(){
    double dia = 35.24;
    int semana = (int) dia;

    System.out.println(semana);
    }



}
