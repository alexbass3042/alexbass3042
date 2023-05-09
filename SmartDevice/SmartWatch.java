package SmartDevice;

public class SmartWatch extends SmartDevice {

    boolean sensorCalor;
    boolean botones;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, double pulgadas, int carga_mAh, int nCamaras, String color,
                      boolean sensorCalor, boolean botones) {
        super(marca, modelo, pulgadas, carga_mAh, nCamaras, color);
        this.sensorCalor = sensorCalor;
        this.botones = botones;
    }

    public void mostrarDispositivo() {
        super.mostrarDispositivoPadre();
        System.out.println("Color: " + this.color + ", NFC(sensor calor): "
                + this.sensorCalor + ", GPS: " +this.botones + ".");
    }
}
