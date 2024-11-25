package ProgramacionModular;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime un radio valido");
        int rad = userprint.nextInt();
        boolean radioval;
        double perimetro;
        double area;
        perimetro = calculateCirclePerimeter(rad);
        radioval = validRadius(rad);
        area = calculateCircleArea(rad);
        if (radioval == true) {
            System.out.println("el perimetro es " + perimetro);
            System.out.println("el area  es " + area);
        }else System.out.println("parametro invalido");



    }
    public static boolean validRadius (int radius){
        boolean result;
        result = true;
        if (radius > 0) result = true;
        else result = false;
        return result;
    }
    public static double calculateCirclePerimeter(double radius){
        double result;
        result = radius * 2 * 3.14;
        return result;
    }
    public static double calculateCircleArea(double radius){
        double result;
        result = radius * radius * 3.14;
        return result;
    }
}
