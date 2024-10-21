package Tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("dime un numero");
        double num1 = user.nextDouble();
        System.out.println("dime otro numero");
        double num2 = user.nextDouble();
        System.out.println("dime otro numero");
        double num3 = user.nextDouble();

        double media;
        media = num1 + num2 + num3 / 3;
        DecimalFormat truncado = new DecimalFormat("#");
        System.out.println(String.format(String.format("la media sin decimales es " + truncado.format(media))));
        System.out.println("la media con decimales es "+ (num1 + num2 + num3 / 3));


    }
}
