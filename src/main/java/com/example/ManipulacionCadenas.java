package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String s1 = "Hola";
        String s2 = " Mundo";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Java es divertido  ";

        System.out.println("length: " + texto.length());
        System.out.println("charAt(3): " + texto.charAt(3));
        System.out.println("substring(2,6): " + texto.substring(2, 6));
        System.out.println("toUpperCase: " + texto.toUpperCase());
        System.out.println("toLowerCase: " + texto.toLowerCase());
        System.out.println("trim: '" + texto.trim() + "'");
        System.out.println("equals 'java es divertido': " + texto.trim().equals("java es divertido"));
        System.out.println("equalsIgnoreCase: " + texto.trim().equalsIgnoreCase("JAVA ES DIVERTIDO"));
        System.out.println("contains 'div': " + texto.contains("div"));
        System.out.println("startsWith '  J': " + texto.startsWith("  J"));
        System.out.println("endsWith 'do  ': " + texto.endsWith("do  "));
    }

    public static void demostrarInmutabilidad() {
        String a = "Hola";
        String b = a.toUpperCase();
        System.out.println(a);      // sigue siendo "Hola"
        System.out.println(b);      // "HOLA"
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append(2025);
        sb.append(" - Java es genial!");

        sb.insert(5, "mundo ");
        sb.replace(20, 24, "increíble");

        System.out.println(sb.toString());
    }

}
