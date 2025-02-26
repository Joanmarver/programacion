package Objetos.herencia.ejer_tres;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Figura2D>figuras= new ArrayList<>();
        figuras.add(new cuadrado(4));
        figuras.add(new triangulo(4,5));
        figuras.add(new rectangulo(3,5));
        figuras.add(new circulo(5));
        for (Figura2D figura: figuras){
            System.out.println(figura.area());
            System.out.println(figura.perimetro());
        }

    }
}
