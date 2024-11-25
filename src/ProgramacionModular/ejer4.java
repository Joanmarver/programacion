package ProgramacionModular;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        double euros, dolares;
        System.out.println("Pulsa '1' para pasar de euros a dolares\n" + "Pulsa '2' para pasar de dolares a euros");
        double num = userprint.nextDouble();
        if (num == 1) {
            System.out.println("dime la cantidad");
            num = userprint.nextDouble();
            dolares = euro2dollar(num);
            System.out.println("son " + dolares + " dolares");

        } else if (num==2) {
            System.out.println("dime la cantidad");
            num = userprint.nextDouble();
            euros = dollar2euro(num);
            System.out.println("son "+ euros + " euros");

        }else System.out.println("numero invalido");
    }
    public static double euro2dollar(double cant){
        double result;
        result = cant * 1.05;
        return result;

    }
    public static double dollar2euro(double cant){
        double result;
        result = cant * 0.96;
        return result;
    }
}
