package Objetos.herencia.ejer_cinco_seis;

public class main {
    public static void main(String[] args) {
        publicación texto = new PublicacionTexto("¡Hola, mundo!");
        publicación foto = new PublicacionFoto("foto.jpg");
        publicación video = new PublicacionVideo("video.mp4");

        // Publicar contenido
        texto.publicar();
        foto.publicar();
        video.publicar();

        // Compartir contenido
        texto.compartir();
        foto.compartir();
        video.compartir();

        // Abrir fotos y videos (usando AbrirPublicacion)
        abrirpublicacion abrirFoto = (PublicacionFoto) foto;
        abrirFoto.abrir();

        abrirpublicacion abrirVideo = (PublicacionVideo) video;
        abrirVideo.abrir();
    }
}
