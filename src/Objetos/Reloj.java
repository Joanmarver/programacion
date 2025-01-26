package Objetos;

public class Reloj {
    // Atributos privados
    private int horas;
    private int minutos;
    private int segundos;
    private boolean formato24Horas; // true para 24 horas, false para 12 horas

    // Constructor vacío
    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.formato24Horas = true; // Por defecto, formato 24 horas
    }

    // Constructor con parámetros
    public Reloj(int horas, int minutos, int segundos) {
        setHoras(horas); // Validación en el setter
        setMinutos(minutos);
        setSegundos(segundos);
        this.formato24Horas = true; // Por defecto, formato 24 horas
    }

    // Getters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean isFormato24Horas() {
        return formato24Horas;
    }

    // Setters con validación
    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else {
            System.out.println("Error: Las horas deben estar entre 0 y 23.");
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Error: Los minutos deben estar entre 0 y 59.");
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.println("Error: Los segundos deben estar entre 0 y 59.");
        }
    }

    public void setFormato24Horas(boolean formato24Horas) {
        this.formato24Horas = formato24Horas;
    }

    // Método para mostrar la hora por pantalla
    public void mostrarHora() {
        String horaFormateada;
        if (formato24Horas) {
            horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        } else {
            int horas12 = (horas == 0 || horas == 12) ? 12 : horas % 12;
            String periodo = (horas < 12) ? "AM" : "PM";
            horaFormateada = String.format("%02d:%02d:%02d %s", horas12, minutos, segundos, periodo);
        }
        System.out.println("Hora actual: " + horaFormateada);
    }

    // Método toString() para representar el reloj como una cadena
    @Override
    public String toString() {
        String formato = formato24Horas ? "24 horas" : "12 horas";
        return String.format("Hora: %02d:%02d:%02d (Formato: %s)", horas, minutos, segundos, formato);
    }
}

