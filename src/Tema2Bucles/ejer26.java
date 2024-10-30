package Tema2Bucles;

import java.util.Scanner;

public class ejer26 {
    public static void main(String[] args) {
        int num;
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime un numero");
        num = numuser.nextInt();
        if (num % 2 != 0) {
            System.out.println("es un numero primo");
        }else {
            System.out.println("no es un numero primo");
        }
        numuser.close();
    }
}
