import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPrecio {

    public static boolean obtenerIva;
    private final ArrayList ServicioPrecio;
    //creo input
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //creo lista
    List<Precio> precios;

    public ServicioPrecio()
    {this.ServicioPrecio = new ArrayList();
     this.precios        = new ArrayList<>();}

    //creo precio
    public void crearPrecio() {
        String respuesta;
        String nombreProducto = "";
        double precio = 0;
        double iva = 0;

        do {    //bucle para crear precio
               //instancio el objeto precio
            Precio preci = new Precio(nombreProducto, precio, iva);
            System.out.println("Ingrese Nombre del Producto");
            nombreProducto = leer.next();
            preci.setNombreProducto(nombreProducto);

            System.out.println("Ingrese el Precio");
            double precioValor = leer.nextDouble();
            preci.setPrecio(precioValor);

            System.out.println("Ingrese % de IVA");
            double ivaValor = leer.nextDouble();
            preci.setIva(ivaValor);

            precios.add(preci); //lleno el listado de precios con el elemento precio
            System.out.println("Crear otro precio S/N");
            respuesta = leer.next();
            } while (respuesta.equalsIgnoreCase("S"));
    }
    //mostrar listado de Precios
    public void mostrarPrecios() {
        precios.stream().map((precio) -> {
            System.out.println("[" + precio + "]");
            return precio;
        }).forEachOrdered((_item) -> {
            //System.out.println("_");
        });
    }
    // método para obtener el IVA de un rango de precios
    public void obtenerTotalIva() {
        double totalIva = 0;
        double total2 = 0;
        for (int i = 0; i < precios.size(); i++) {
            double precio = precios.get(i).getPrecio();
            double iva = precios.get(i).getIva();
            double total = precio * iva;
            totalIva += total;
            total2 = precio + totalIva;
        }
        System.out.println("El % de IVA es: " + totalIva);
        System.out.println("El precio total incluido IVA es: " + total2);
    }
}