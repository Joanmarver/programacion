package Tema2;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        Scanner usernun = new Scanner(System.in);
        System.out.println("dime las horas los minutos y los segundos por separado");
        horas = usernun.nextInt();
        minutos = usernun.nextInt();
        segundos = usernun.nextInt();

        segundos = segundos + 1;

        if (segundos >= 60) {
            segundos = segundos - 60;
            minutos = minutos + 1;
        }
        if (minutos >=60) {
            minutos = minutos - 60;
            horas = horas + 1;
        }
        if (horas >=24){
            horas = horas - 24;
        }

        System.out.println(" son las " + horas+":"+ minutos+":"+segundos);
        usernun.close();
    }
}
