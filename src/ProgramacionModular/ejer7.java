package ProgramacionModular;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        boolean iniciobucle;
        iniciobucle = true;
        System.out.println("dime un numero. para salir pulsa '0'");
        while (iniciobucle){
            double num = userprint.nextDouble();
            if (num == 0) iniciobucle=false;
            else numeroprimo(num);


        }
    }
    public static void numeroprimo(double numero){
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        }
        for (int i = 2; i < numero; i++ ){
            if (numero % i == 0) primo = false;
        }
        if (primo == true){
            System.out.println("es primo");
        }else {
            System.out.println("no es primo");
        }
    }
}
