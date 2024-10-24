package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("dime un numero");
        Scanner num= new Scanner(System.in);
        double Radio= num.nextDouble();
        double area = 3.14 * Radio * Radio;
        System.out.println("el area de un circulo es " + area);
        num.close();
    }
}
