package Objetos.herencia.ejer_cuatro;

public class revistas extends Ficha{
    private int numPublicacion;
     private int ano;

    public revistas(int numero, String titulo, int numPublicacion, int ano) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.ano = ano;
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }

    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "revistas{" +
                "numPublicacion=" + numPublicacion +
                ", ano=" + ano +
                '}';
    }
}
