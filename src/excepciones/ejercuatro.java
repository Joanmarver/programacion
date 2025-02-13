package excepciones;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class ejercuatro {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        Random random= new Random();
        int celdas = random.nextInt(100);
        int valores= random.nextInt(10);
        int[] array= new int[celdas];
        for (int i =0; i< array.length;i++){
            array[i]=valores;
        }
        boolean inicio=true;
        int answer=0;
        while (inicio){
        System.out.println("dime que posición quieres mostrar por pantalla");
        try {

            answer = userprint.nextInt();
            System.out.println(array[answer]);
        }catch (ArrayIndexOutOfBoundsException OutOfArray){
            if (answer<0){
                System.out.println("saliendo del bucle...");
                inicio=false;
            }else {
            System.out.println("el array es mas corto");}
        }catch (Exception invalidNumber){
            System.out.println("Numero invalido");
        }
        }
    }
}
