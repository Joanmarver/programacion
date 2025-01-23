package STrings;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("1.encriptar\n" + "2.desemcriptar?");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
            System.out.println("dime la frase que quieres descifrar");
            String cadena= userprint.nextLine();
            String result= encriptar(cadena);
            System.out.println(result); }
            case 2:{
                System.out.println("dime la frase que quieres desencriptar");
                String cadena= userprint.nextLine();
                String result= desencriptar(cadena);
                System.out.println(result); }
            }
        }
    public static String encriptar(String cadena){
        cadena = cadena.toUpperCase();

        String encriptar="9876543210ZYXWVUTSRQPONMLKJIHGFEDCBA";
        char[] array = cadena.toCharArray();
        String result="";
        for (int i =0; i< array.length; i ++){
            for (int j = 0; j< encriptar.length(); j++){

                if (array[i]=='Z'){
                    array[i]='A';
                    continue;

                }
                if (array[i]=='9'){
                    array[i]='0';
                    continue;
                }
                if (array[i]==' '){
                    array[i]=' ';
                    continue;
                }
                if (array[i]==encriptar.charAt(j)){
                    if (j  < encriptar.length()){
                        array[i]= encriptar.charAt(j-1);
                    }

                }

            }
        }
        for (int i =0; i< array.length; i++){
            result = result + array[i];
        }
        return result;
    }
    public static String desencriptar(String cadena){
        cadena = cadena.toUpperCase();

        String encriptar="9876543210ZYXWVUTSRQPONMLKJIHGFEDCBA";
        char[] array = cadena.toCharArray();
        String result="";
        for (int i =0; i< array.length; i ++){
            for (int j = 0; j< encriptar.length(); j++){

                if (array[i]=='A'){
                    array[i]='Z';
                    continue;

                }
                if (array[i]=='0'){
                    array[i]='9';
                    continue;
                }
                if (array[i]==' '){
                    array[i]=' ';
                    continue;
                }
                if (array[i]==encriptar.charAt(j)){
                    if (j  < encriptar.length()){
                        array[i]= encriptar.charAt(j+1);
                    }

                }

            }
        }
        for (int i =0; i< array.length; i++){
            result = result + array[i];
        }
        return result;
    }
    }


