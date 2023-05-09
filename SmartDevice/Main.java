package SmartDevice;

import SmartDevice.SmartWatch;
import SmartDevice.SmartPhone;
import SmartDevice.SmartWatch;

/*
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class Main {
    public static void main(String[] args) {

        // SmartPhone
        SmartDevice smartPhone1 = new SmartPhone("Apple", "IPHONE 12", 14.2, 3200, 4, "azul", true, true);
        System.out.println("Especificaciones Dispositivos:");
        System.out.println("*** SmartPhone ***");
        smartPhone1.mostrarDispositivo();


        // SmartWatch
        SmartDevice smartWatch1 = new SmartWatch("HUAWEI", "P20", 1.5, 1200, 1, "gris", false, true);
        System.out.println("*** SmartWatch ***");
        smartWatch1.mostrarDispositivo();
    }
}