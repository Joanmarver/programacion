package EjerciciosRepaso;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime 3 numeros");
        double num1 = userprint.nextDouble();
        double num2 = userprint.nextDouble();
        double num3 = userprint.nextDouble();
        double num4;
        if (num1 < num3){
            num4 = num1;
            num1 = num3;
            num3 = num4;
        }
        if (num1 < num2){
            num4 = num1;
            num1 = num2;
            num2 = num4;
        }
        if (num2 < num3){
            num4 = num2;
            num2 = num3;
            num3 = num4;
        }
        System.out.println(num1 + ">" + num2 + ">" + num3);
    }
}
