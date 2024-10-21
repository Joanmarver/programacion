package Tema2;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("dime la base del triangulo");
        double base = user.nextDouble();
        System.out.println("dime la altura del triangulo");
        double altura = user.nextDouble();
        System.out.println("el area es " + base * altura / 2);
    }
}
