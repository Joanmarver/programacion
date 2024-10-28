package Tema2Bucles;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime un numero");
        int decrec;
        int result;
        result = 1;
        int num = numuser.nextInt();

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("el factrorial es " + result);
    }
}

