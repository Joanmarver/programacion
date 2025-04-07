package ficheros.videojuegos;

public class VideojuegoDigital extends Videojuego{
    private String tiendaCompra;
    private Estado estado;
    public VideojuegoDigital(String titulo, String plataforma, int nota) {
        super(titulo,plataforma,nota);

    }
    public String getTipo(){
        return "Digital";
    }
}
enum Estado{
    NUEVO,USADO
}
