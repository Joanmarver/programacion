package ficheros.videojuesgosrepaso;

public class VideojuegoDigital extends Videojuego {
    private String tiendaOnline;
    private double tamañoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamañoGB) {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamañoGB = tamañoGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public double getTamañoGB() {
        return tamañoGB;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }

    public void setTamañoGB(double tamañoGB) {
        this.tamañoGB = tamañoGB;
    }

    @Override
    public String toString() {
        return "VideojuegoDigital{" +
                "titulo='" + getTitulo() + '\'' +
                ", plataforma='" + getPlataforma() + '\'' +
                ", nota=" + getNota() +
                "tiendaOnline='" + tiendaOnline + '\'' +
                ", tamañoGB=" + tamañoGB +
                '}';
    }

    @Override
    String getTipo() {
        return "digital";
    }
}

