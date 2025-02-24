package Objetos.herencia.ejer_cuatro;

import java.util.Scanner;

public class libros extends Ficha {
    private String editorial;
    private String autor;

    public libros(int numero, String titulo,String editorial, String autor) {
        super(numero,titulo);
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "libros{" +
                "editorial='" + editorial + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
