package Tema2;

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        double areacua,arearec,percua,perrec,areatri,ladocua,lado1,altrec, basetri, alttri;

        int num1;
        Scanner numuser =new Scanner(System.in);
        System.out.println("pulsa el numero 0 si quieres que muestre el area y perimetro de un cuadrado, el 1 para area y perimtreo de un rectangulo y 2 para el area de un triangulo");
        num1 = numuser.nextInt();
        switch (num1)  {
        case 0 -> {
            System.out.println("ahora dime el lado del cuadrado");
            ladocua = numuser.nextDouble();
            areacua = ladocua * ladocua;
            percua = ladocua * 4;
            System.out.println(" el resultado del area es " + areacua + " y el perimetro es " + percua);
        }

        case 1 -> {
            System.out.println("dime la base del rectangulo y la altura");
            lado1 = numuser.nextDouble();
            altrec =numuser.nextDouble();
            arearec = lado1 * altrec;
            perrec= altrec * 2 + lado1 * 2;
            System.out.println("el area es " + arearec + " y el perimetro es "+ perrec);
        }

        case 2 -> {
            System.out.println("dime la base y la altura del triangulo");
            basetri = numuser.nextDouble();
            alttri = numuser.nextDouble();
            areatri = basetri * alttri / 2;
            System.out.println("el area es " + areatri);
        }
        default -> System.out.println("error");
    } numuser.close();
}}
