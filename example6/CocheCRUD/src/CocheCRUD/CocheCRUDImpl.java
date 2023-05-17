package CocheCRUD;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUDD {

    //estructura de datos
    private List<Coche> coches = new ArrayList<>();

    //operaciones CRUD
    //guardar un coche
    @Override
    public void save(Coche coche) {
        coches.add(coche);
        System.out.println("Aqui guarda datos");
    }
    //listar coches
    @Override
    public List<Coche> findAll() {
        System.out.println("Aqui findAll");
        return coches;
    }
    //borrar coche
    @Override
    public void delete(Coche coche) {
        System.out.println("Aqui remueve");
        coches.remove(coche);
    }
}
