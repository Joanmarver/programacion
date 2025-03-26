package ficheros.serializacionejer.ejertwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        String content="";
        Path path = Paths.get("resources/Documentos/usuario.txt");
        try {
           content = Files.readString(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);


    }
}
