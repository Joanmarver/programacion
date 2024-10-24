package Tema2;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        double num1;
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime un numero");
        num1 = usernum.nextDouble();
        if (num1 < 0){
            System.out.println("es un numero negativo");
        } else if (num1 == 0) {
            System.out.println("es el numero zero");
        } else {
            System.out.println("es un numero positivo");
        }
        usernum.close();
    }
}
