package Tema2;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime un numero");
        double num1 = usernum.nextDouble();
        System.out.println("dime otro numero");
        double num2 = usernum.nextDouble();
         if (num1 > num2){
             System.out.println("el resultado es " + (num1 - num2));

         } else {
             System.out.println("el resultado es " + (num2 - num1));

         }
         usernum.close();
    }
}
