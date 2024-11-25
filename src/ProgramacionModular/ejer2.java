package ProgramacionModular;

import java.awt.*;
import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        boolean func;
        Scanner userprint= new Scanner(System.in);
        System.out.println("dime tu edad");
        int edad= userprint.nextInt();
        func=isAdult(edad);
        if (func == true) System.out.println("es mayor de edad");
        if (func == false)System.out.println("es menor de edad");

    }

    public static boolean isAdult(int age){
      boolean result;
      result = false;
        if (age >= 18) result = true;
        if (age < 18) result = false;
        return result;
    }
}
