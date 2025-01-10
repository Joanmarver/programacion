package EjerciciosRepaso;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime una palabra");
        String result = userprint.nextLine();
        String respuesta = result.toUpperCase();
        System.out.println(respuesta);

    }
}
