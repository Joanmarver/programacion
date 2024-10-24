package Tema2;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("dime la base del rectangulo");
        double base = user.nextDouble();
        System.out.println("dime la altura del rectangulo");
        double altura = user.nextDouble();
        System.out.println("el area es " + base * altura);
        System.out.println(" el perimetro es " + (base*2 + altura*2));
        user.close();

    }
}
