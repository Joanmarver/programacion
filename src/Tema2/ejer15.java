package Tema2;

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        int mes;
        int año;
        Scanner usernum= new Scanner(System.in);
        System.out.println("dime el numero del mes y el año");
        mes = usernum.nextInt();
        año = usernum.nextInt();
        if ( año % 4 == 0 || año % 400 == 0 ){
            if (mes == 2){
                System.out.println("son 29 dias");
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("son 31 dias");

            } else {
                System.out.println("son 30 dias");
            }
        } else if (mes == 2) {
            System.out.println(" son 28");

        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

        } else {
            System.out.println("son 30");
        }
        usernum.close();
    }

}
