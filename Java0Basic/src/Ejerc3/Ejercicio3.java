package Ejerc3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // pedimos la cantidad de nombres
        System.out.println("Ingrese la cantidad de nombres a visualizar: ");
        while (!teclado.hasNextInt()) { //valida que sea una cantidad correcta
            System.out.println("Ingrese una cantidad válida: ");
            teclado.nextLine();
        }
        int tamanoNombres = Integer.parseInt(teclado.nextLine());
        String[] nombres = new String[tamanoNombres];

        for (int i = 0; i < tamanoNombres; i++) { //solicitamos nombres
            System.out.println("Ingrese el nombre " + (i+1) + " = ");
            nombres[i] = teclado.nextLine();
        }
        System.out.print("Los nombres ingresados son: "); //imprimimos los datos ingresados
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }
}