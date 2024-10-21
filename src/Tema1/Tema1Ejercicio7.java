package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("dime la cara de un dado");
        Scanner valoruser = new Scanner(System.in);
       int cara= valoruser.nextInt();

       if (cara > 1 && cara < 6){
           System.out.println("es un valor correcto");
           System.out.println("la cara opuesta es " + (7 - cara));
       }else {
           System.out.println("no es un valor correcto");
       }
}
}
