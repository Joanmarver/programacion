package excepciones;

import java.util.Random;
import java.util.Scanner;

public class ejercinco {
    public static void main(String[] args) {
        Scanner userprint=new Scanner(System.in);
        Random random = new Random();
        int p = random.nextInt();
        int n = random.nextInt();
        System.out.println("1. imprimir valor 'N'\n"+ "2.Imprimir valor 'P'\n" + "3. Salir");
        int answer = userprint.nextInt();
        switch (answer){
            case 1:{

                break;
            }
            case 2:{
                imprimeNegativo(n);
                break;
            }
            case 3:{
                break;
            }
            default:
                System.out.println("num invalido");
        }

    }
    public static void imprimePositivo(int p) throws Exception{
        if (p<0){
            System.out.println("error. el numero es negativo");
        }



    }
    public static void imprimeNegativo(int n){

    }
}
