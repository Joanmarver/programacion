package ProgramacionModular2;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("1.calcular perimetro y area");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                System.out.println("1. circulo\n" + "2.cuadrado\n" + "3.rectangulo");
                respuesta = userprint.nextInt();
                switch ( respuesta){
                    case 1:{
                        System.out.println("radio:");
                        double radios = userprint.nextInt();
                        circleArea(radios);
                        circlePerimetre(radios);
                        break;
                    }
                    case 2: {
                        System.out.println("lado:");
                        double lado = userprint.nextInt();
                        squareArea(lado);
                        squarePerimeter(lado);
                    break;
                    }
                    case 3: {
                        System.out.println("base:");
                        double base = userprint.nextInt();
                        System.out.println("altura:");
                        double altura = userprint.nextInt();
                        rectanglePerimeter(base,altura);
                        rectangleArea(base,altura);
                     break;

                    }
                    default:
                        System.out.println("respuesta invalida");

                }
                break;
            }
        }
    }
    public static void circlePerimetre(double radio){

        if (radio < 0){
            System.out.println("radio invalido, perimetro no disponible");
        }else {
            double result;
            result = radio * 2 * 3.14;
            System.out.println(result);
        }

    }
    public static void circleArea(double radiu){
        if (radiu < 0){
            System.out.println("radio invalida, Area no disponible");
        } else {
            double result;
            result = radiu * radiu * 3.14;
            System.out.println(result);
        }
    }
    public static void squarePerimeter(double lados){
        if (lados < 0){
            System.out.println("lado invalido, Perimetro no disponible");
        } else {
            double result;
            result = lados*4;
            System.out.println(result);
        }

    }
    public static void squareArea(double lados){
        if (lados < 0){
            System.out.println("lado invalida, Area no disponible");
        } else {
            double result;
            result = lados * lados;
            System.out.println(result);
        }
    }
    public static void rectanglePerimeter(double bass, double high){
        if (bass < 0&& high<0){
            System.out.println("datos invalidos, Perimetro no disponible");
        } else {
            double result;
            result = bass * 2 + high * 2;
            System.out.println(result);
        }
    }
    public static void rectangleArea(double bass, double high){
        if (bass < 0&& high<0){
            System.out.println("datos invalidos, Perimetro no disponible");
        } else {
            double result;
            result = bass * high;
            System.out.println(result);
        }
    }
}
