package Tema2Bucles;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        int aprobado,suspendido,num;
        aprobado = 0;
        suspendido = 0;
        Scanner numuser = new Scanner(System.in);
        System.out.println("di las notas de los alumnos. Si deseas parar , escribe un numero negativo");
        do {
            num = numuser.nextInt();
           if (num <= 10 ){
                if (num <= 10 && num >=5)
                    aprobado++;
                else suspendido++;
           } else System.out.println("error");
        } while (num > 0);
        System.out.println("aprobados : " + aprobado + " suspendidos : " + suspendido);
    }
}
