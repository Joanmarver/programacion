package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("dime un año");
        Scanner num1 = new Scanner(System.in);
        int año = num1.nextInt();
        if((año % 4 == 0 && año % 100 != 0 ) || (año % 400 == 0)){
            System.out.println("es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }
        num1.close();
    }
}
