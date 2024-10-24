package Tema2;

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        int personas;
        int dias;
        int precio;
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime el numero de personas");
        personas = usernum.nextInt();
        System.out.println("ahora dime el numero de dias");
        dias = usernum.nextInt();
        precio = 15 * dias;

        if (personas > 5 && dias >= 7) {
            precio = precio * ((15 * dias) * 25 / 100);
        } else {
            precio = 15 * dias;
        }
        System.out.println(" os costará " + precio);
        usernum.close();
    }
}
