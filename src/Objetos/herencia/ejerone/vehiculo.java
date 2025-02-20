package Objetos.herencia.ejerone;

// Clase base Vehiculo
class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String matricula;

    public Vehiculo(String marca, String modelo, int anio, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.matricula = matricula;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Matrícula: " + matricula);
    }
}




