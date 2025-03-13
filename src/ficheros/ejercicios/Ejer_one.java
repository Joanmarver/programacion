package ficheros.ejercicios;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ejer_one {
    public static void main(String[] args) {
        List<String>fichero= new ArrayList<>();
        String numfichero= "/home/joamarver3/Escriptori/programacion/Documentos/numeros.txt";
        long nummax=0;
        long nummin=999999999;
        int compare=0;
        try {
            fichero = Files.readAllLines(Paths.get(numfichero));

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i =0; i < fichero.size();i++){
            compare=Integer.parseInt(fichero.get(i));
            if (nummin>compare){
                nummin=compare;

            } else if (nummax<compare) {
                nummax=compare;
            }
        }
        System.out.println("Numero max: " + nummax);
        System.out.println("Numero min: " + nummin);
    }
}
