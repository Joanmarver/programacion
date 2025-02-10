package colecciones.ejerdos;

import Objetos.Persona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapa {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        Map<String,Persona> usuarios= new HashMap<>();
        System.out.println("bienvenido");
        System.out.println("1.darse de alta/baja\n" + "2.mostrar datos de un Usuario\n" + "3.modificar usuarios");

    }

}
