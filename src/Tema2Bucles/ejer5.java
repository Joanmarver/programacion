package Tema2Bucles;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
       int num,cont,suma;
       suma = 0;
       cont = 0;
        Scanner numuser = new Scanner(System.in);
       do {
           System.out.println("dime un numero entero");
           num = numuser.nextInt();
           if (num > 0 ) {
               cont ++;
               suma = suma + num;
           }
           } while (num > 0);
        System.out.println(" la media de los numeros positivos es "+ (suma / cont));

    }
}
