package ficheros.videojuegos;

public class VideojuegoFisico extends Videojuego{
    private String tiendaCompra;
    private Estado estado;

    public VideojuegoFisico(String plataforma, String titulo, int nota, String tiendaCompra, Estado estado) {
        super(plataforma, titulo, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }


    public String getTipo(){
        return "Digital";
    }



    @Override
    public String toString() {
        return "VideojuegoFisico{" +
                "tiendaCompra='" + tiendaCompra + '\'' +
                ", estado=" + estado +
                ", titulo=" + getTitulo() + '\'' +
                ", plataforma= " +  getPlataforma() + '\'' +
                ", nota=" + getNota() + '\'' +
                '}';
    }
}
enum Estado{
    NUEVO,USADO
}
