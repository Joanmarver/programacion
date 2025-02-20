package Objetos.herencia.ejerone;

// Subclase Camion
class Camion extends Vehiculo {
    private double pesoMaximoAutorizado;
    private boolean mercanciaPeligrosa;

    public Camion(String marca, String modelo, int anio, String color, String matricula, double pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
        super(marca, modelo, anio, color, matricula);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Peso máximo autorizado: " + pesoMaximoAutorizado + " kg");
        System.out.print("Mercancía peligrosa: ");
        if (mercanciaPeligrosa == true) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
