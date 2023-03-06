package com.example.project1;

public class numeros {
       /*
        * Primera parte:
        * Crear una función con tres parámetros que sean números que se suman entre sí.
        * Llamar a la función en el main y darle valores.
        */
       static int sumar(int num1, int num2, int num3) {// Crear una función con tres parámetros que sean números que se
              // suman entre sí.
              int suma = num1 + num2 + num3;
              return suma;
       }

       /*
        * Segunda parte:
        * Crear una clase coche.
        * Dentro de la clase coche, una variable numérica que almacene el número de
        * puertas que tiene.
        * Una función que incremente el número de puertas que tiene el coche.
        * Crear un objeto miCoche en el main y añadirle una puerta.
        * Mostrar el número de puertas que tiene el objeto.
        */
       public static class Coche { // Crear una clase coche.
              static int puertas = 4; // Dentro de la clase coche, una variable numérica que almacene el número de
              // puertas que tiene.

              void NumeroDePuertas(int increPuertas) {// Una función que incremente el número de puertas que tiene el coche.
                     puertas += increPuertas;
                     System.out.println("Numero de Puertas:" + String.valueOf(Coche.puertas));// Mostrar el número de puertas que
                     // tiene el objeto.
              }
       }

       public static void main(String[] args) {
              /* Primera parte: */
              int resultado;
              resultado = sumar(7, 2, 2);
              System.out.println("La suma es: " + resultado);

              /* Segunda parte */
              Coche miCoche = new Coche(); // Crear un objeto miCoche en el main y añadirle una puerta.
              miCoche.NumeroDePuertas(1);
       }
}
