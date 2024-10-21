package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("dime un numero entero");
        Scanner num1 = new Scanner(System.in);
        int numen_uno = num1.nextInt();
        System.out.println("dime otro numero entero");
        Scanner num2 = new Scanner(System.in);
        int numen_dos = num2.nextInt();

        if (numen_dos - numen_uno < 0) {
            System.out.println("el numero mayor es " + numen_uno);
        } else {
            if (numen_dos == numen_uno) {
                System.out.println("los dos numeros son iguales");
            } else {
                System.out.println("el numero mayor es " + numen_dos);
            }
        }


    }
}
