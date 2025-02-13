package excepciones;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ejertres {
    public static void main(String[] args) {
        Scanner userprint =  new Scanner(System.in);
        double[] array= new double[5];
        int cont=0;
        try{
        for (int i =0; i < array.length; i++){
            System.out.println("dime un numero");
            array[i]= userprint.nextDouble();
        }
        }catch (ArrayIndexOutOfBoundsException OutOfArray){
            System.out.println("demasiados valores");

        }catch (Exception exception){
            System.out.println("error invalido");
        }
    }
}
