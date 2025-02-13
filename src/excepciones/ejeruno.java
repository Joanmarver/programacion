package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejeruno {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        System.out.println("dime un numero entero");
        try {
            int respuesta= userprint.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        }
    }


}
