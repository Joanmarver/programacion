package excepciones;

import java.util.Random;
import java.util.Scanner;

public class ejercinco {
    public static void main(String[] args) throws Exception{
        Scanner userprint=new Scanner(System.in);
        Random random = new Random();
        int p = random.nextInt();
        int n = random.nextInt();
        System.out.println("1. imprimir valor 'N'\n"+ "2.Imprimir valor 'P'\n" + "3. Salir");
        int answer = userprint.nextInt();
        switch (answer){
            case 1:{
                imprimePositivo(n);
                break;
            }
            case 2:{
                imprimeNegativo(p);
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
            throw new Exception("error. el numero es negativo");
        }else {
            System.out.println(p);
        }



    }
    public static void imprimeNegativo(int n)throws Exception{
        if (n>0){
            throw new Exception("error. el numero es negativo");
        }else {
            System.out.println(n);
        }
    }
}
