package ficheros.ejercicios.ejertwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<alumno> alumno= new ArrayList<>();

        String notasalum= "resources/Documentos/alumnos_notas.txt";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(notasalum))) {
                String line;
                System.out.println("bufferedReader");
                while ((line = br.readLine()) != null) {
                    String [] lineas= line.split(" ");
                    String nombre= lineas[0];
                    String apellidos= lineas[1];
                    List<String> notas= new ArrayList<>();
                    for (int i = 2; i< lineas.length;i++){
                        notas.add(lineas[i]);
                    }
                    alumno.add(new alumno(nombre,apellidos,notas));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (alumno alumnos: alumno){
            System.out.println(alumno.toString());
        }

    }
}
