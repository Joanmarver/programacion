package Objetos.herencia.ejer_cuatro;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Ficha> lista= new ArrayList<>();
        lista.add(new dvd(24,"beatless",2024,tipoDVD.ACCION));
        lista.add(new libros(2,"la casa","ameva","josep"));
        System.out.println(lista);

    }
}
