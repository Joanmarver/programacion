package Objetos.herencia.ejer_cuatro;

public class dvd extends Ficha {
    private int ano;
    private tipoDVD tipo;

    public dvd(int numero, String titulo, int ano, tipoDVD tipo) {
        super(numero, titulo);
        this.ano = ano;
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public tipoDVD getTipo() {
        return tipo;
    }

    public void setTipo(tipoDVD tipo) {
        this.tipo = tipo;
    }
}
enum tipoDVD{
    ANIMACION, ACCION, DOCUMENTAL, CIENCIA, FICCION
}
