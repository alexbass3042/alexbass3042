public class Precio {
    public String nombreProducto;
    public double precio;
    public double iva;

    public Precio(String nombreProducto, double precio, double iva){
    this.nombreProducto = nombreProducto;
    this.precio = precio;
    this.iva = iva;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio; }

    public double getIva() {return iva;}
    public void setIva(double iva) {this.iva = iva; }

    @Override
    public String toString() {
        return "Nombre del Producto= " + nombreProducto + ", Precio= " + precio + ", Iva= " + iva;
    }
}
