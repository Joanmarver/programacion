package Tema2Bucles;

import java.util.Scanner;

public class ejer27 {
    public static void main(String[] args) {
        int cont, num1;
        cont = 0;
        num1 = 1;

        while (cont <= 20) {
            if (num1 % 2 !=0) {
                System.out.println(num1);
                cont++;
                num1++;
            } else num1++;
        }




    }
}
