package ProgramacionModular;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime el dia");
        int dia = userprint.nextInt();
        System.out.println("dime el mes");
        int mes = userprint.nextInt();
        System.out.println("dime el año");
        int ano = userprint.nextInt();
        FechaCorrecta(dia,mes,ano);
    }
    public static void FechaCorrecta (int a, int b, int c){

        if (a <= 31 && a > 1){
            if (b <= 12 && b > 1){
                if (c >= 0){
                    System.out.println("fecha correcta");
                }else System.out.println("fecha incorrecta");
            }else System.out.println("fecha incorrecta");
        } else System.out.println("fecha incorrecta");

    }
}
