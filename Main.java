package CocheCRUD;

import java.util.List;
import CocheCRUD.CocheCRUDImpl;

/*
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y
llamar a cada uno de los métodos.

Ejemplo:
CocheCRUD cocheCrud = new CocheCRUDImpl()
*/

public class Main {
    static CocheCRUDD cocheCRUD;
    private static Coche coche;

    public static void main(String[] args) {

        CocheCRUDD cocheCrud = new CocheCRUDImpl();

        // añadir coches
        Coche toyota = new Coche("Toyota","Corolla",2020,2.30,"Rojo");
        Coche jeep   = new Coche("Jeep","Cherokee",2019,2.00,"Negro");

        //guardar coches
        cocheCrud.save(toyota);
        cocheCrud.save(jeep);

        //consultar
        List<Coche> coches = cocheCrud.findAll();
        System.out.println(coches);

        //remover
        cocheCrud.delete(jeep);

        //consultamos luego de remover
        List<Coche> cochesDespuesDeBorrar = cocheCrud.findAll();
        System.out.println(cochesDespuesDeBorrar);
    }
}
