package Tema2;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        double euros = 0.92;
        Scanner num = new Scanner(System.in);
        System.out.println("dime la cantidad de dinero en dolares ");
        double num1 = num.nextDouble();
        System.out.println("la cantidad en euros es " + num1 * euros);


    }
}
