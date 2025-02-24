package Objetos.herencia.ejer_cuatro;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Ficha> libros= new ArrayList<>();
        libros.add(new dvd(24,"beatless",2024,tipoDVD.ACCION));
        for (Ficha ficha:libros){
            System.out.println(ficha);
        }

    }
}
