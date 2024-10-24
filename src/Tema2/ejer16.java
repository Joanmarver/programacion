package Tema2;

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        double dinero;
        double dolar = 1.08;
        double euro = 0.92;
        char letra;
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime la cantidad de euros");
        dinero = usernum.nextDouble();
        System.out.println(" ahora pulsa la letra 'D' si quieres cambiar a dolares o 'E' si quiero convertir a euros");
        letra = usernum.next().charAt(0);
        switch (letra) {
            case 'D':
                dinero = dinero * dolar;
                System.out.println(" el total es " + dinero);
                break;
            case 'E':
                dinero = dinero * euro;
                System.out.println("el total es " + dinero );
                break;
        }

    }
}
