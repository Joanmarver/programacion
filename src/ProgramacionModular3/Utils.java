package ProgramacionModular3;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        System.out.println("1.Conversor de millas a kilometros");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                System.out.println("dime un numero");
                respuesta = userprint.nextInt();
                double millas = miles2kilometers(respuesta);
                System.out.println("millas: " + millas);
            }
        }

    }
    public static double miles2kilometers(double cantidad){
        return cantidad * 1.6;
    }
    public static double getTaxes(double cantidad, double porcentaje){
         double result= Math.round(cantidad * porcentaje)/100.00;
         return result;
    }
}

