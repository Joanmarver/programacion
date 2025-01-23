package STrings;

import javax.print.DocFlavor;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("dime una palabra");
        String palabra= scanner.nextLine();
        char[] visible= new char[palabra.length()];
        menu(palabra,visible);
    }
    public static void menu(String palabra , char[] visible){
        Scanner userprint= new Scanner(System.in);
        int cont=0;

        for (int i = 0; i<100; i ++){
            System.out.println();
        }
            while (cont <=6){
        System.out.println("1.resolver\n" + "2.letra");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1: {
                System.out.println("dime la palabra");
                userprint.nextLine();
                String palabrauser= userprint.nextLine();

                if (palabra.equalsIgnoreCase(palabrauser)){
                    System.out.println("has acertado");
                    cont= 7;
                }else {
                    System.out.println("has fallado");
                    cont++;
                }
                break;
            }
            case 2: {


                System.out.println("dime la letra");
                userprint.nextLine();
                String letra = userprint.nextLine();
                boolean result = comprobacion(letra,palabra,visible);

                    if (result==false){
                        System.out.println("has fallado");
                        cont++;
                        switch (cont){
                            case 1:{
                                hangmanuno();
                                
                                break;
                            }
                            case 2:{
                                hangmandos();
                                break;
                            }
                            case 3:{
                                hangmantres();
                                break;
                            }
                            case 4:{
                                hangmancuatro();
                                break;
                            }
                            case 5:{
                                hangmancinco();
                                break;
                            }
                            case 6:{
                                hangmanseis();
                                break;
                            }
                        }
                    }else {
                        System.out.println("tu letra esta en tu palabra");
                        mostrararray(visible);
                        String palabrados = new String(visible);
                        if (palabra.equalsIgnoreCase(palabrados)){
                            System.out.println("has acertado");
                            cont = 7;
                        }
                    }

                    break;
                }



            }
        }


    }
    public static boolean comprobacion(String letra, String palabra, char[] visible){
        char[]arraypalabra= palabra.toCharArray();

        int cont=0;
        boolean result = true;
        for (int i =0; i< arraypalabra.length;i++){
            if (arraypalabra[i] == letra.charAt(0)){
                cont++;
                visible[i]=arraypalabra[i];

            }
        }
        if (cont <=0){
            result=false;
        }
    return  result;
    }
    public static void hangmanuno(){
        System.out.println(" o ");
    }
    public static void hangmandos(){
        System.out.println(" o \n" + "/");
    }
    public static void hangmantres(){
        System.out.println(" o \n" + "/|");
    }
    public static void hangmancuatro(){
        System.out.println(" o \n" + "/|\\");
    }
    public static void hangmancinco(){
        System.out.println(" o \n" + "/|\\\n" + "/");
    }
    public static void hangmanseis(){
        System.out.println(" o \n" + "/|\\\n" + "/ \\");
    }
    public static void mostrararray(char[] visible){
        for (int i =0; i < visible.length; i ++){
            System.out.print(visible[i]+ " ");
        }
        System.out.println();
    }

}
