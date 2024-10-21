package Tema2;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        double dolares = 1.09;
        System.out.println("dime la cantidad que quieras pasar de euros a dolares");
        Scanner user = new Scanner(System.in);
        double num = user.nextDouble();
        System.out.println(" en dolares es " + num * dolares);



    }
}
