package ProgramacionModular;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        double fin;
        System.out.println("dime un numero");
        double num = userprint.nextInt();
        fin = numberSign(num);
        if (fin == -1) System.out.println("es negativo");
        if (fin==1) System.out.println("es postivio");
        if (fin==0) System.out.println("es 0");
    }
    public static double numberSign(double num){
       double result;
       if (num < 0) result=-1;
       else if (num > 0) result=1;
       else result = 0;
       return result;

    }
}
