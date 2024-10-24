package Tema2;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime 3 numeros enteros");
        num1 = usernum.nextInt();
        num2 = usernum.nextInt();
        num3 = usernum.nextInt();
        if ( num1 - num3 == 2 && num1 - num2 == 1) {
            System.out.println("son consecutivos");
        } else if (num3 - num1 == 2 && num2 - num1 == 1) {
            System.out.println("son consecutivos");
        } else {
            System.out.println("no son consecutivos");
        }
        usernum.close();

    }
}
