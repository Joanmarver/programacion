package Tema2;

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        double raiz,num1;
        Scanner numuser = new Scanner(System.in);
        System.out.println("dime un numero");
        num1 = numuser.nextDouble();
        raiz = Math.sqrt(num1);
        if (num1 < 0) {
            System.out.println("numero invalido");
        } else {
            System.out.println(" la raiz es " + raiz);
        }
        numuser.close();
    }
}
