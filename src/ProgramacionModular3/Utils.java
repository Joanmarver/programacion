package ProgramacionModular3;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        System.out.println("1.Conversor de millas a kilometros\n" + "2.tasas\n" + "3.impuesto");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                System.out.println("dime un numero");
                respuesta = userprint.nextInt();
                double millas = miles2kilometers(respuesta);
                System.out.println("millas: " + millas);
                break;
            }
            case 2:{
                System.out.println("dime la cantidad:");
                double cant= userprint.nextDouble();
                System.out.println("dime el porcentaje");
                int por= userprint.nextInt();
                double taxes = getTaxes(cant,por);
                System.out.println("impuestos:" + taxes);
                break;
            }
            case 3:{
                System.out.println("dime la cantidad:");
                double cant= userprint.nextDouble();
                System.out.println("dime el porcentaje");
                int por= userprint.nextInt();
                double impuestos = Impuestos(cant,por);
                System.out.println("cantidad total + impuestos :" + impuestos);
                break;
            }

        }

    }
    public static double miles2kilometers(double cantidad){
        return cantidad * 1.6;
    }
    public static double getTaxes(double cantidad, int porcentaje){
        double result = cantidad * porcentaje / 100;
         result= Math.round(result * 100)/100.0;
         return result;
    }
    public static double Impuestos(double cantidad, int porcentaje){
        double por = cantidad *  porcentaje / 100;
        double result = por + cantidad;
        result = Math.round(result * 100)/100.0;
        return  result;
    }
}

