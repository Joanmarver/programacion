package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejerdos {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        System.out.println("dime un numero");
        int numberOne= userprint.nextInt();
        System.out.println("dime otro numero");
        int numberTwo= userprint.nextInt();
        try {
            int result= numberOne/numberTwo;
            System.out.println(result);
        }catch (InputMismatchException InvalidatedNumber){
            System.out.println("Uno o varios numeros no son validos");

        }catch ( ArithmeticException InvalidateResult){
            System.out.println("error matematico");
        }
    }
}
