package Objetos.herencia.ejerone;

// Subclase Ciclomotor
class Ciclomotor extends Vehiculo {
    private int cilindrada;

    public Ciclomotor(String marca, String modelo, int anio, String color, String matricula, int cilindrada) {
        super(marca, modelo, anio, color, matricula);
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet() {
        return cilindrada >= 125;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.print("¿Necesita carnet?:");
        if (necesitaCarnet() == true) {
            System.out.println("Si");

        } else {
            System.out.print("No");
        }
    }

    // Subclase Turismo
    static class Turismo extends Vehiculo {
        private int numPlazas;
        private String tipoUso; // "Profesional" o "Particular"

        public Turismo(String marca, String modelo, int anio, String color, String matricula, int numPlazas, String tipoUso) {
            super(marca, modelo, anio, color, matricula);
            this.numPlazas = numPlazas;
            this.tipoUso = tipoUso;
        }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Número de plazas: " + numPlazas);
            System.out.println("Tipo de uso: " + tipoUso);
        }
    }
}
