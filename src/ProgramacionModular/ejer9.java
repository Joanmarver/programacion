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
    public static void Triangulo(String caracter, int numLineas){
        for (int i = 0; i < numLineas; i++) {
            int espaciosIzquierda = numLineas - i - 1;
            int numCaracteres = 2 * i + 1;
            for (int j = 0; j < espaciosIzquierda; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numCaracteres; j++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
        }
    }

