package ProgramacionModular;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime un numero");
        double numero = userprint.nextDouble();
        double resultado;
        Tablamultiplicar(numero);
    }
    public static void Tablamultiplicar(double num){
        double result;
        result = 0;
        for (int i = 0; i <= 10; i++){
            result = i * num;
            System.out.println(result);

        }

    }
}
