package ProgramacionModular;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime el caracter");
        String caracter = userprint.nextLine();
        System.out.println("dime el numero de lineas del triangulo");
        int lineas = userprint.nextInt();
        Triangulo(caracter,lineas);

    }
    public static void Triangulo(String A, int B){
        String linea = A;
        for (int i = 0; i<=B; i++){
            System.out.println(" ");
        }
    }
}
