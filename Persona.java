package com.example.project2;
/*
Crea una clase Persona con las siguientes variables: La edad El nombre El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con
una variable salario que solo tenga la clase Trabajador.
*/
public class Persona {
    private int edad;
    private String nombre;
    private int tlf;

    public void setEdad(int edad) {this.edad = edad;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTlf(int tlf) {this.tlf = tlf;}

    public int getEdad() {return this.edad;}
    public String getNombre() {return this.nombre;}
    public int getTlf() {return this.tlf;}

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Alex");
        cliente.setTlf(98765432);
        cliente.setCredito("SI");

        System.out.println("Nombre es: " + cliente.getNombre() + ", Edad: " + cliente.getEdad()+ ", Tlf: " + cliente.getTlf()+ ", Credito:" + cliente.getCredito());
        System.out.println();
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Tlf: " + cliente.getTlf());
        System.out.println("Credito:" + cliente.getCredito());
        System.out.println();

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Alex");
        trabajador.setEdad(Integer.parseInt("40"));
        trabajador.setTlf(998899);
        trabajador.setSalario(Integer.parseInt("1200"));

        System.out.println("Nombre es: " + trabajador.getNombre() + ", Edad: " + trabajador.getEdad()+ ", Tlf: " + trabajador.getTlf()+ ", Salario:" + trabajador.getSalario());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Tlf: " + trabajador.getTlf());
        System.out.println("Salario: $" + trabajador.getSalario());
    }
static class Cliente extends Persona{
    private String credito;
    public void setCredito(String credito) {
        this.credito = credito;
    }
    public String getCredito(){
        return this.credito;
    }
}
static class Trabajador extends Persona{
    private int salario;
    public void setSalario(int salario) {this.salario = salario;}
    public int getSalario(){return this.salario;}
}
}