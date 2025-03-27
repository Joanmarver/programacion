package ficheros.serializacionejer.ejerthree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        Path path = Paths.get("resources/Documentos/Libros/lazarillo.txt");

        try{
           String content= Files.readString(path);
           String[] palabras= content.split(" ");
            System.out.println("numero de palabras : "+ palabras.length);
        }catch (IOException e){

        }
    }
}
