package Tema2Bucles;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        int A,B,nummin,nummax;
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime dos numeros enteros");
        A = numuser.nextInt();
        B = numuser.nextInt();
        while (A < B) {
            if ( A % 2 != 0){
                System.out.println(A);
                A++;
            } else {
                A++;
            }
        }
    }
}
