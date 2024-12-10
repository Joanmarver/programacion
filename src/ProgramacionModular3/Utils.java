package ProgramacionModular3;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("1.Conversor de millas a kilometros\n" + "2.tasas\n" + "3.impuesto\n" + "4.Monedas\n" + "5.DNI\n" + "6.Validad DNI\n" );
        int respuesta = userprint.nextInt();
        switch (respuesta) {
            case 1: {
                System.out.println("dime un numero");
                respuesta = userprint.nextInt();
                double millas = miles2kilometers(respuesta);
                System.out.println("millas: " + millas);
                break;
            }
            case 2: {
                System.out.println("dime la cantidad:");
                double cant = userprint.nextDouble();
                System.out.println("dime el porcentaje");
                int por = userprint.nextInt();
                double taxes = getTaxes(cant, por);
                System.out.println("impuestos:" + taxes);
                break;
            }
            case 3: {
                System.out.println("dime la cantidad:");
                double cant = userprint.nextDouble();
                System.out.println("dime el porcentaje");
                int por = userprint.nextInt();
                double impuestos = Impuestos(cant, por);
                System.out.println("cantidad total + impuestos :" + impuestos);
                break;
            }
            case 4: {
                System.out.println("dime la cantidad");
                double cant = userprint.nextDouble();
                String llamar = Monedas(cant);
                System.out.println(llamar);
                break;
            }
            case 5:{
                System.out.println("dime Los Numeros de tu DNI ");
                int cant = userprint.nextInt();
                char result = Letra(cant);
                System.out.println("Tu letra es " + result);
                break;
            }
            case 6 : {
                System.out.println("dime los numeros de tu DNI");
                int cant = userprint.nextInt();
                System.out.println("dime la letra de tu DNI");
                String Letra = userprint.nextLine();
                Letra = userprint.nextLine();
                String LetraM = Letra.toUpperCase();
                char LetraFInal= LetraM.charAt(0);
                boolean result = isValidNif(cant,LetraFInal);
                if (result == true){
                System.out.println("DNI VALIDO");
                } else System.out.println("DNI INVALIDO");
                break;
            }

        }

    }

    public static double miles2kilometers(double cantidad) {
        return cantidad * 1.6;
    }

    public static double getTaxes(double cantidad, int porcentaje) {
        double result = cantidad * porcentaje / 100;
        result = Math.round(result * 100) / 100.0;
        return result;
    }

    public static double Impuestos(double cantidad, int porcentaje) {
        double por = cantidad * porcentaje / 100;
        double result = por + cantidad;
        result = Math.round(result * 100) / 100.0;
        return result;
    }

    public static String Monedas(double a) {
        // pasar a centimos;

        int centimos = (int) a * 100 ;
        int monedados, monedaUno, MonedaCincuenta,MonedaVeinte,MonedaDiez,MonedaCinco,MonedaDos,MonedaUno;
        monedados = centimos / 200;
        centimos = centimos % 200;

        monedaUno = centimos / 100;
        centimos = centimos % 100;

        MonedaCincuenta = centimos / 50;
        centimos = centimos % 50;

        MonedaVeinte = centimos / 20;
        centimos = centimos % 20;

        MonedaDiez = centimos / 10;
        centimos = centimos%10;

        MonedaCinco = centimos / 5;
        centimos = centimos%10;

        MonedaDos = centimos / 2;
        centimos = centimos%2;

        MonedaUno = centimos / 1;
        centimos = centimos % 1;

        String result= "" + monedados + monedaUno+ MonedaCincuenta + MonedaVeinte + MonedaDiez + MonedaCinco + MonedaDos + MonedaUno;
        return result;
    }
    public static char Letra(int num){
        String Result= "TRWAGMYFPDXBNJZSQVHLCKE";
        int dninum = num % 23;
        char letra = Result.charAt(dninum);
        return letra;

    }
    public static boolean isValidNif(int num, char letrauser){
        boolean result = true;
        if (num > 99999999 && num < 00000001){
            result = false;
        }else {
            char Letra = Letra(num);
                if (Letra != letrauser){
                    result =false;
                }


        }
        return result;
    }
}

