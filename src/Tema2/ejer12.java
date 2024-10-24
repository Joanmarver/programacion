package Tema2;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        double num4;
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime 3 numeros y los ordenaré");
        num1 = numuser.nextDouble();
        num2 = numuser.nextDouble();
        num3 = numuser.nextDouble();
        if ( num3 > num1){
            num4 = num1;
            num1 = num3;
            num3 = num4;
        }
        if (num2 > num1){
            num4 = num1;
            num1 = num2;
            num2 = num4;
        }
        if (num3 > num2){
            num4 = num2;
            num2 = num3;
            num3 = num4;
        }
        System.out.println("ordenado quedaria asi " + num1 + " "+  num2 + " " +num3);
        numuser.close();

    }
}
