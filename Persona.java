package com.example.project2;

    /*Crear clase Persona.
    Crear variables las privadas edad, nombre y telefono de la clase Persona.
    Crear gets y sets de cada propiedad.
    Crear un objeto persona en el main.
    Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
     por último muéstralas por consola.   */

public class Persona {
    private int edad;
    private String nombre;
    private int tlf;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTlf() {
        return this.tlf;
    }

    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(20);
    persona.setNombre("alex");
    persona.setTlf(98765432);
    System.out.println();
    System.out.println("Nombre es: " + persona.getNombre() + ", Edad: " + persona.getEdad()+ ", Tlf: " + persona.getTlf());
    System.out.println();
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Tlf: " + persona.getTlf());
    }
}







/*
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
        int Numerodw = 3;
        do {
            System.out.println("El numero es: " + Numerodw);
            Numerodw++;
        } while (Numerodw < 3);
        System.out.println("El numero es mayor");

        // Paso 4
        for (int numeroFor = 3; numeroFor <= 3; numeroFor++) {
            System.out.println("Respuesta For: " + numeroFor);
        }
        System.out.println("El numero es mayor");

        // Paso 5
        String estacion = "otoño";
        switch (estacion) {
            case "verano":
                System.out.println("Es: verano");
                break;
            case "invierno":
                System.out.println("Es: invierno");
                break;
            case "otoño":
                System.out.println("Es: otoño");
                break;
            case "primavera":
                System.out.println("Es: primavera");
                break;
            default:
                System.out.println("No es una estación");
  */
