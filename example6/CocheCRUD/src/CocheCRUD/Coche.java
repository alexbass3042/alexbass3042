package CocheCRUD;

public class Coche {

    //1. variables
    String marca;
    String modelo;
    int ano;
    double cilindros;
    String color;

    //2. constructor
    public Coche()    {    }
    public Coche(String marca, String modelo, int ano, double cilindros, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindros = cilindros;
        this.color = color;

    }
    //3. metodos
    @Override
    public String toString() {
        return "Coche {" +
                "Marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", año=" + ano +
                ", cilindraje=" + cilindros +
                ", color=" + color +
                '}';
    }

}
