package Objetos.herencia.ejer_cinco_seis;

public class PublicacionVideo implements publicación,abrirpublicacion{
    private String urlvideo;

    public PublicacionVideo(String urlvideo) {
        this.urlvideo = urlvideo;
    }

    @Override
    public void abrir() {
        System.out.println("abriendo video");
    }

    @Override
    public void publicar() {
        System.out.println("publicando...");
    }

    @Override
    public void compartir() {
        System.out.println("compartiendo..");
    }
}
