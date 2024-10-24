package Tema2;


import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        Scanner usernum = new Scanner(System.in);
        System.out.println("dime 3 numeros ordenados");
        num1 = usernum.nextDouble();
        num2 = usernum.nextDouble();
        num3 = usernum.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println(" estan ordenados");
        } else {
            System.out.println("no estan ordenados");
        }
        usernum.close();
    }

}
