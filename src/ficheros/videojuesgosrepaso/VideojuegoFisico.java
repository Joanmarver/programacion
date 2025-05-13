package ficheros.videojuesgosrepaso;

public class VideojuegoFisico extends Videojuego {
    private String tiendaCompra;
    private Estado estado;

    public VideojuegoFisico( String titulo,String plataforma,int nota,String tiendaCompra, Estado estado ) {
        super(titulo,plataforma,nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }


    @Override
    public String toString() {
        return "VideojuegoFisico{" +
                "titulo='" + getTitulo() + '\'' +
                ", plataforma='" + getPlataforma() + '\'' +
                ", nota=" + getNota() +
                "tiendaCompra='" + tiendaCompra + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    String getTipo() {
        return "fisico";
    }
}
enum Estado{
    NUEVO,USADO
}
