package java;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered " + s);
        int a = in.nextInt();
        System.out.println("You entered " + a);
        float b = in.nextFloat();
        System.out.println("You entered " + b);
    }
}