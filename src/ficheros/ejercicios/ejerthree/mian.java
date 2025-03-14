package ficheros.ejercicios.ejerthree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class mian {
    public static void main(String[] args) {
        File nuevoarchivo = new File("archivo_B.txt");
        Path Patharchivo = Paths.get("archivo_B.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime el archivo que quieres leer");
        String archivo = scanner.next();
        String content=null;
        try {

                List<String> lines= Files.readAllLines(Paths.get(archivo));
                Collections.sort(lines);
            for (String linea: lines){
                Files.writeString(Patharchivo,linea, StandardOpenOption.APPEND);


            }
            String contenido = Files.readString(Patharchivo);

        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
