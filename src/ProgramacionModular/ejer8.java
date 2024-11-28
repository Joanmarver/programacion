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

       switch (b){
           case 1,3,5,7,8,10,12:{
               if (b>=1&& b<=12 && a<=31 && a>=1 && c>=0 ){
                   System.out.println("fecha correcta");
               }else System.out.println("fecha incorrecta");
               }
               break;
           case 4,6,9,11:{
               if (b<=1&& b>=12 && a<=30 && a>=1 && c>=0 ){
                   System.out.println("fecha correcta");
               }else System.out.println("fecha incorrecta");
           }
           case 2:{
               if (c % 4==0){
                   if  (b<=1&& b>=12 && a<=29 && a>=1 && c>=0 ){
                       System.out.println("fecha correcta");
                   }else System.out.println("fecha incorrecta");
               } else  {
                   if  (b<=1&& b>=12 && a<=28 && a>=1 && c>=0 ){
                       System.out.println("fecha correcta");
                   }else System.out.println("fecha incorrecta");
               }
               break;
           }
           default:
               System.out.println("fecha incorrecta");

                break;
        }

       }

    }

