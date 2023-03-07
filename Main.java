package com.example.project2;

public class Main{

    // <MENOR >MAYOR
    // Paso 1 numeroIf es positivo, negativo, o 0
    public static void main(String[] args) {
        int numeroif = 0;
        if (numeroif < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroif > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        // Paso 2 incrementa numero
        int NumeroW = 2;
        while (NumeroW < 3) {
            System.out.println("El numero es: " + NumeroW);
            NumeroW++;
        }
        System.out.println("El numero es mayor");

        // Paso 3
        int Numerodw = 4;
        do {
            System.out.println("El numero es: " + Numerodw);
            Numerodw++;
        } while (Numerodw < 3);
        System.out.println("El numero es mayor");

        // Paso 4
        for (int numeroFor = 4; numeroFor <= 3; numeroFor++) {
            System.out.println("Respuesta For: " + numeroFor);
        }
        System.out.println("El numero es mayor");

        // Paso 5
        String estacion = "vera";
        switch (estacion) {
            case "verano":
                System.out.println("Es: verano");
                break;
            case "invierno":
                System.out.println("Es: invierno");
                break;
            case "otono":
                System.out.println("Es: otono");
                break;
            case "primavera":
                System.out.println("Es: primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}