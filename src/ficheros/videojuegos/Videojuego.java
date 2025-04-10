package ficheros.videojuegos;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    private String titulo;
    private String plataforma;
    private int nota;

    public Videojuego(String plataforma, String titulo, int nota) {
        this.plataforma = plataforma;
        this.titulo = titulo;
        this.nota = nota;
    }

    abstract String getTipo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) throws NotaInvalidaException {
        int notamax=10;
        int notamin=0;
        if (nota>notamax || nota<notamin){
            throw new NotaInvalidaException("nota Invalida");
        }
        this.nota = nota;
    }

    @Override
    public abstract String toString();
}
