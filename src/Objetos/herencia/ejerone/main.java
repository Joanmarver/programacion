package Objetos.herencia.ejerone;

public class main {
    public static void main(String[] args) {
        Ciclomotor.Turismo turismo = new Ciclomotor.Turismo("Toyota", "Corolla", 2022, "Rojo", "1234-ABC", 5, "Particular");
        Camion camion = new Camion("Mercedes", "Actros", 2021, "Blanco", "5678-DEF", 18000, true);
        Ciclomotor ciclomotor = new Ciclomotor("Yamaha", "YZF-R125", 2023, "Azul", "9101-GHI", 125);

        System.out.println(" Información del Turismo:");
        turismo.mostrarInfo();

        System.out.println("\n Información del Camión:");
        camion.mostrarInfo();

        System.out.println("\n Información del Ciclomotor:");
        ciclomotor.mostrarInfo();
    }
}
