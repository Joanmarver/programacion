package Tema2Bucles;

import java.util.Random;
import java.util.Scanner;

public class ejer29 {
    public static void main(String[] args) {
    Random random = new Random(System.currentTimeMillis());
    int numsec = random.nextInt(100);
    Scanner usernum = new Scanner(System.in);
    System.out.println("dime un numero");
    int numuser = usernum.nextInt();

        while (numsec != numuser) {
            if (numuser > numsec) {
                System.out.println("tu numero es mayor dime otro");
                numuser = usernum.nextInt();
            } else  {
                System.out.println("tu numero es menor. dime otro");
                numuser = usernum.nextInt();
            }
        }
        System.out.println("acertastes");





    usernum.close();

    }
}
