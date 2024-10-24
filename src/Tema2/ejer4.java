package Tema2;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("dime un numero");
        double num1 = user.nextDouble();
        System.out.println("dime otro numero");
        double num2 = user.nextDouble();
        System.out.println("dime otro numero");
        double num3 = user.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("el numero mayor es " + num1);
        } else if (num2 > num1 && num2>num3) {
            System.out.println("el numero mayor es " + num2);
        } else {
            System.out.println(" el numero mayor es " + num3);
        }
        user.close();
    }
}
