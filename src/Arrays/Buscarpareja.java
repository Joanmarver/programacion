package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscarpareja {
    public static void main(String[] args) {
        Random random= new Random();
        boolean[] visibles= new boolean[20];
        int[] parejas = new int [20];
        juego(parejas,visibles);
    }
    public static void parejas(int[] parejas){
        int num = 1;
        for (int i= 0; i<20;i +=2){
            parejas [i]= num;
            parejas [i+1]= num;
            num++;
        }
    }
    public static void aleatorio(int[] parejas){
        parejas(parejas);
        Random random = new Random();
        for (int i=0;i< parejas.length;i++){
            int numale= random.nextInt(20);
            int extra= parejas[i];
            parejas[i]= parejas[numale];
            parejas[numale]= extra;
        }
    }
    public static void juego(int [] parejas , boolean[] visibles){
        boolean tvisible = false;
        int posicionuno = 1;
        int posiciondos = 1;
        aleatorio(parejas);
        Scanner userprint = new Scanner(System.in);
        System.out.println("HOLAAAA\n" + "Bienvenido al juego por parejas" );
        System.out.println("El juego consiste en que tienes que encontrar las parejas para ");
        System.out.println("tablero actual :");
        for (int i=0; i< visibles.length; i++){
            System.out.print(visibles[i] + "\t");
        }
        boolean result = tvisibles(visibles,tvisible);
        while (result==false) {
            boolean comprobar= false;
            boolean comprobar2=false;
            while (comprobar ==false) {
                System.out.println("\nselecciona la primera casilla (del 0 al 19) ");
                posicionuno = userprint.nextInt();
                if ( posicionuno < 0 || posicionuno > 19 ) {
                    System.out.println("error, valor invalido");
                } else {
                    comprobar = true;
                }
            }

            System.out.println("has encontrado el numero: " + parejas[posicionuno]);
            while (comprobar2==false) {
                System.out.println("selecciona la segunda (del 0 al 19");
                posiciondos = userprint.nextInt();
                if (posicionuno == posiciondos || posiciondos < 0 || posiciondos > 19) {
                    System.out.println("error, valor invalido");

                } else {
                    comprobar2=true;
                }
            }
            comprobacion(parejas,posicionuno,posiciondos,visibles);
            for (int i=0; i< visibles.length; i++){
                System.out.print(visibles[i] + "\t");
            }

        }
        System.out.println("ENHORABUENA, HAS ACERTADO TODAS LAS PAREJAS");


    }
    public static void comprobacion(int[] parejas, int posicionuno , int posiciondos, boolean[] visibles){
        if (parejas[posicionuno] == parejas[posiciondos]){
            System.out.println("ACERTASTES!!");
            visibles[posicionuno] = true;
            visibles[posiciondos]= true;
        } else {
            System.out.println("FALLASTES!!");
            System.out.println("vuelve a comenzar");
            for (int i = 0 ; i < visibles.length; i++){
                visibles[i] = false;
            }
        }
    }
    public static boolean tvisibles(boolean[] visibles, boolean visible){
        visible = true;
        for (int i=0; i<visibles.length; i++){
            if (visibles[i] == false){
                visible = false;
            }
        }
        return visible;

    }
}


