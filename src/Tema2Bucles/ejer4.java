package Tema2Bucles;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        int num1, cont, result;
        cont = 0;
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime un numero y te diré cuantas cifras tiene");
        num1 = numuser.nextInt();
        while (num1 > 1) {
            num1 = num1 / 10;
            cont++;
        }
        System.out.println("cifras que tiene: " +  cont);
    }
}
