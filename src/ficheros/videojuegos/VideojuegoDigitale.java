package ficheros.videojuegos;

public class VideojuegoDigitale extends Videojuego {
    private String tiendaOnline;
    private double tamanioGB;


    public VideojuegoDigitale(String plataforma, String titulo, int nota, String tiendaOnline, double tamanioGB) {
        super(plataforma, titulo, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanioGB = tamanioGB;
    }

    @Override
    public String toString() {
        return "VideojuegoDigitale{" +
                "tiendaOnline='" + tiendaOnline + '\'' +
                ", tamanioGB=" + tamanioGB + '\'' +
                ", titulo=" + getTitulo() + '\'' +
                ", plataforma= " +  getPlataforma() + '\'' +
                ", nota=" + getNota() + '\'' +
                '}';
    }

    @Override


    public String getTipo(){
        return "Fisico";
    }
}
