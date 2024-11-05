package Tema2Bucles;

import java.util.Scanner;

public class ejer28 {
    public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("pideme un numero");
            int num = user.nextInt();

            int i;

            for (i=1 ; i < 10 ; i++) {
                System.out.println(i * num);
            }

        }
    }

