package ficheros.serializacionejer.ejerone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime tu nombre");
        String name = scanner.nextLine();
        System.out.println("dime tu apellido");
        String apellido= scanner.nextLine();
        File archivo = new File("resources/Documentos/usuario.txt");
        Path path= Paths.get("resources/Documentos/usuario.txt");

        try {
            if (!Files.exists(path)){
                Files.createFile(path);
            }else{
                System.out.println("error al crear archivo");
            }
            Files.writeString(path, "Nombre: "+ name + "`\nEdad: " + apellido) ;

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
