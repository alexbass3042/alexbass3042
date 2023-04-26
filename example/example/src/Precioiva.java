public class Precioiva{
    public static void main(String[] args) {

        ServicioPrecio sp = new ServicioPrecio();
        System.out.println("---------Bienvenido al sistema--------");
        System.out.println("----Calcularemos el precio total con IVA----");
        System.out.println("--------------------------------------------");
        sp.crearPrecio();
        sp.mostrarPrecios();
        sp.obtenerTotalIva();
    }
}