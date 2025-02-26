package Objetos.herencia.ejer_cinco_seis;

public class PublicacionTexto implements publicacionreact {
    private String texto;

    public PublicacionTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public void publicar() {
        System.out.println("publicando");
    }

    @Override
    public void compartir() {
        System.out.println("compartiendo...");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("comentario :" + comentario);
    }
}
