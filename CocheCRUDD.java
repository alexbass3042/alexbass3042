package CocheCRUD;

import java.util.List;

public interface CocheCRUDD {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);
}
