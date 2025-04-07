package ficheros.videojuegos;

public class VideojuegoFisico extends Videojuego {
    private String tiendaOnline;
    private double tamanioGB;

    public VideojuegoFisico(String plataforma, String titulo, int nota, String tiendaOnline, double tamanioGB) {
        super(plataforma, titulo, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanioGB = tamanioGB;
    }
    public String getTipo(){
        return "Fisico";
    }
}
