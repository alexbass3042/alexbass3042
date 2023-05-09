package SmartDevice;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    double pulgadas;
    int carga_mAh;
    int nCamaras;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, double pulgadas, int carga_mAh, int nCamaras, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.carga_mAh = carga_mAh;
        this.nCamaras = nCamaras;
        this.color = color;
    }

    public void mostrarDispositivoPadre() {
    System.out.println("Soy un " + marca + " " + modelo + ", tengo: " + pulgadas +
            "', Bateria de: " + carga_mAh + "mAh, y tengo: " + nCamaras + " camaras");
    }
    public void mostrarDispositivo() {
    }
}


