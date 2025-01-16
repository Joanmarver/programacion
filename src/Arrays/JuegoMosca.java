package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class JuegoMosca {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[] array= new int[15];
        Mosca(array);




    }
    public static void PosAleatoria(int[]array){
    int total = 1;
    Random random = new Random();
    int numale = random.nextInt(15);
    array[numale]= 1;

    }
    public static void Mosca(int[] array ){
        Scanner userprint= new Scanner(System.in);
        boolean result;
        result= false;
        PosAleatoria(array);
        int respuesta;
        do {
            boolean numcorrecto= false;
            do {
                System.out.println("dime en que celda está la mosca");
                respuesta = userprint.nextInt();
                respuesta = respuesta - 1;
                if (respuesta <= 14 && respuesta >= 0) {
                    numcorrecto = true;
                } else {
                    System.out.println("respuesta incorrecta");
                }
            }while (numcorrecto==false);

            if (array[respuesta] == 1) {
                result = true;
                System.out.println("ACERTASTE");
            } else {
                System.out.println("HAS FALLADO");
                if ((respuesta < 14 && array[respuesta + 1] == 1) || (respuesta > 0 && array[respuesta - 1] == 1)) {
                    System.out.println("la mosca ha cambiado de posición");

                    if (respuesta <= 14 && array[respuesta + 1]==1){
                        array[respuesta + 1]= 0;
                    }
                    if (respuesta > 0 && array[respuesta -1]==1){
                        array[respuesta -1]= 0;
                    }
                    PosAleatoria(array);
                }
            }
        }while (result == false);

    }
}
