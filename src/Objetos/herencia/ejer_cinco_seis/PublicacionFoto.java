package Objetos.herencia.ejer_cinco_seis;

import java.sql.SQLOutput;

public class PublicacionFoto implements publicacionreact,abrirpublicacion{
    private String urlfoto;

    public PublicacionFoto(String url) {
        this.urlfoto = url;
    }

    @Override
    public void abrir() {
        System.out.println("abriendo foto");

    }

    @Override
    public void publicar() {
        System.out.println("publicando foto");
    }

    @Override
    public void compartir() {
        System.out.println("compartir foto");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("comentario:" + comentario);
    }
}
