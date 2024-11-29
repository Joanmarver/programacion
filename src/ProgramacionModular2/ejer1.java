package ProgramacionModular2;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        double area,perimetro;
        boolean numpri, numpri2;
        long digitos;
        Scanner userprint = new Scanner(System.in);
        System.out.println("1.calcular perimetro y area\n" + "2.Numero primo o no\n" + "3.Numero de digitos de un numero\n");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                System.out.println("1. circulo\n" + "2.cuadrado\n" + "3.rectangulo");
                respuesta = userprint.nextInt();
                switch ( respuesta){
                    case 1:{
                        System.out.println("radio:");
                        double radios = userprint.nextInt();
                        area = circleArea(radios);
                        perimetro = circlePerimetre(radios);
                        System.out.println("el area es " + area + "\n" + "el perimetro es " + perimetro);
                        break;
                    }
                    case 2: {
                        System.out.println("lado:");
                        double lado = userprint.nextInt();
                        area = squareArea(lado);
                        perimetro = squarePerimeter(lado);
                        System.out.println("el area es " + area + "\n" + "el perimetro es " + perimetro);
                    break;
                    }
                    case 3: {
                        System.out.println("base:");
                        double base = userprint.nextInt();
                        System.out.println("altura:");
                        double altura = userprint.nextInt();
                        area= rectangleArea(base,altura);
                        perimetro = rectanglePerimeter(base,altura);
                        System.out.println("el area es " + area + "\n" + "el perimetro es " + perimetro);
                     break;

                    }
                    default:
                        System.out.println("respuesta invalida");

                }
                break;
            }
            case 2:{
                System.out.println("dime un numero");
                respuesta = userprint.nextInt();
                numpri = numeroprimo(respuesta);
                numpri2 = numeronoprimo(respuesta);
                 if (numpri == true){
                     System.out.println("Es primo");
                 }
                 if (numpri2 == true){
                     System.out.println("no es primo");
                 }
                break;
            }
            case 3: {
                System.out.println("1.Digitos de un numero entero\n" + "2.Digitos pares de un numero entero\n" + "3.Digitos impares de un numero entero");
                respuesta = userprint.nextInt();
                switch (respuesta){
                    case 1:{
                        System.out.println("dime un numero");
                        respuesta = userprint.nextInt();
                        digitos = DigitosNumero(respuesta);
                        System.out.println("tiene "+ digitos + " digitos");
                        break;
                    }
                    case 2: {
                        System.out.println("dime un numero");
                        respuesta = userprint.nextInt();
                        digitos = DigitosparesNUmero(respuesta);
                        System.out.println("tiene "+ digitos + " digitos pares");
                        break;
                    }
                    case 3: {
                        System.out.println("dime un numero");
                        respuesta = userprint.nextInt();
                        digitos = DigitosImparesNUmero(respuesta);
                        System.out.println("tiene "+ digitos + " digitos pares");
                        break;
                    }
                    default:
                        System.out.println("numero invalido");
                }


            } case 4 :
        }
    }
    public static double circlePerimetre(double radio){
        double result = 0;
        if (radio < 0){
            System.out.println("radio invalido, perimetro no disponible");
        }else {

            result = radio * 2 * 3.14;

        }
        return result;

    }
    public static double circleArea(double radiu){
        double result;
        result = 0;
        if (radiu < 0){
            System.out.println("radio invalida, Area no disponible");
        } else {
            result = radiu * radiu * 3.14;
        }
        return result;
    }
    public static double squarePerimeter(double lados){
        double result;
        result = 0;
        if (lados < 0){
            System.out.println("lado invalido, Perimetro no disponible");
        } else {

            result = lados*4;
        }
        return result;
    }
    public static double squareArea(double lados){
        double result = 0;
        if (lados < 0){
            System.out.println("lado invalida, Area no disponible");
        } else {

            result = lados * lados;

        }
        return result;
    }
    public static double rectanglePerimeter(double bass, double high){
        double result = 0;
        if (bass < 0&& high<0){
            System.out.println("datos invalidos, Perimetro no disponible");
            return bass;
        } else {

            result = bass * 2 + high * 2;

        }
        return result;
    }
    public static double rectangleArea(double bass, double high){
        double result= 0;
        if (bass < 0&& high<0){
            System.out.println("datos invalidos, Perimetro no disponible");
        } else {
            result = bass * high;
        }
        return result;
    }

    public static boolean numeroprimo(int numero){
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        }
        for (int i = 2; i < numero; i++ ){
            if (numero % i == 0) primo = false;
        }
        return primo;
    }
    public static boolean numeronoprimo(int numero){
        boolean noprimo = true;
        if (numero <= 1) {
            noprimo = false;
        }
        for (int i = 2; i < numero; i++ ){
            if (numero % i != 0) noprimo = false;
        }
        return noprimo;
    }
    public static int DigitosNumero(int number){
        int result;
        result= 0;
        while (number<1);{
            number = number/10;
            result++;
        }
        return result;
    }
    public static int DigitosparesNUmero(int number){
        // pasar a valor absoluto

        int cont = 0;
        while (number >= 1){
            int digitos = number % 10;
            if (number % 2==0){
                cont++;
            }
            number /= 10;
        }

        return cont;
    }
    public static int DigitosImparesNUmero(int number){
        // pasar a valor absoluto

        int cont = 0;
        while (number >= 1){
            int digitos = number % 10;
            if (number % 2 !=0){
                cont++;
            }
            number /= 10;
        }

        return cont;
    }
    public static int FuncFactorial(int numero){
        int result = 0;
        for (int i = 1; i <= numero; i++) {
            result *= i;
        }
        return result;
    }
    public static int FncFactorialRecursiva(int numero){
        int result = 0;
        for (int i = numero; i >= 1 ; i--) {
            result *= i;
        }
        return result;
    }
}
