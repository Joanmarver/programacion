package Tema2Bucles;

import java.util.Random;
import java.util.Scanner;

public class ejer28 {
    public static void main(String[] args) {
        int aleatorio, num;
        Scanner user = new Scanner(System.in);
        Random numlot = new Random(System.currentTimeMillis());
        aleatorio = numlot.nextInt(99999);
        for (int i = 1; i != 5; i++) {
            System.out.println("dime un numero");
            num = user.nextInt();
            if (num != aleatorio) {
                System.out.println("fallastes");
            }else {
                System.out.println("acertastes");
            }
        }
    }
}
