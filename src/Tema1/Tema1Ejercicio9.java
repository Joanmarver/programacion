package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {
        double div;
        int resto;
        System.out.println("dime un numero entero");
        Scanner num1 = new Scanner(System.in);
        int numen_uno = num1.nextInt();
        System.out.println("dime otro numero entero");
        int numen_dos = num1.nextInt();

        int suma = numen_uno + numen_dos;
        double resta = numen_uno - numen_dos;
        int prod = numen_uno * numen_dos;

        if (numen_uno > numen_dos){
            div = numen_uno / numen_dos;
            resto =  numen_uno % numen_dos;
        } else{
            div = numen_dos / numen_uno;
            resto = numen_dos % numen_uno;}
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("el producto es " + prod);
        System.out.println("la division es " + div );
        System.out.println("el resto es " + resto);
        num1.close();
    }

}
