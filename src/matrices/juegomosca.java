package matrices;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class juegomosca {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[][] matriz= new int[4][4];
        Mosca(matriz);




    }

    public static void Mosca(int[][] matriz ){
        Scanner userprint= new Scanner(System.in);
        boolean result;
        result= false;
        int total = 1;
        Random random = new Random();
        int numale = random.nextInt(4);
        int numaledos = random.nextInt(4);
        matriz[numale][numaledos]= 1;

        int respuesta;
        int respuestados;
        do {
            boolean numcorrecto= false;
            boolean numcorrectodos=false;
            do {
                System.out.println("dime en que fila está la mosca (del 1 al 4)");
                respuesta = userprint.nextInt();
                respuesta = respuesta - 1;
                if (respuesta <= 4 && respuesta >= 0) {
                    numcorrecto = true;
                } else {
                    System.out.println("respuesta incorrecta");
                }
            }while (numcorrecto==false);

            do {
                System.out.println("dime en que columna esta la mosca(del 1 al 4)");
                respuestados= userprint.nextInt();
                respuestados= respuestados-1;
                if (respuestados <=4 && respuestados >=0){
                    numcorrectodos=true;
                }else {
                    System.out.println("respuesta incorrecta");
                }
            }while (numcorrectodos==false);

            if (matriz[respuesta][respuestados] == 1) {
                result = true;
                System.out.println("ACERTASTE");
                result=true;
            } else if (comprobacion(respuesta,respuestados,numale,numaledos)){
                System.out.println("HAS FALLADO");
                System.out.println("la mosca se ha movido");
                matriz[numale][numaledos]=0;
                numale = random.nextInt(4);
                numaledos = random.nextInt(4);
                matriz[numale][numaledos]=1;


            }else {
                System.out.println("has fallado");
            }
        }while (result == false);

    }
    public static boolean comprobacion(int respuestauno, int respuestados, int numale, int numaledos){
        int diferenciafila= respuestauno - numale;
        int diferenciacolumna= respuestados - numaledos;
        if (diferenciafila<0) diferenciafila= - diferenciafila;
        if (diferenciacolumna<0) diferenciacolumna= - diferenciacolumna;
        return  diferenciafila <=1 && diferenciacolumna<=1;
    }
}
