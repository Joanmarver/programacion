package Tema2;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("dime el lado de el cuadrado y calcularé el area y el perimetro");
        double lado = user.nextDouble();
        System.out.println("el area es " + (lado * lado));
        System.out.println("el perimetro es " + (lado * 4));
        user.close();


    }
}
