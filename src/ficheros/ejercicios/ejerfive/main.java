package ficheros.ejercicios.ejerfive;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String carpetaNombre = "Diccionario";
        String diccionarioFuente = "diccionario.txt";


        File carpeta = new File(carpetaNombre);
        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Carpeta creada: " + carpetaNombre);
            } else {
                System.out.println("No se pudo crear la carpeta.");
                return;
            }
        }


        Map<Character, List<String>> palabrasPorLetra = new HashMap<>();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            palabrasPorLetra.put(letra, new ArrayList<>());
        }


        try (BufferedReader br = new BufferedReader(new FileReader(diccionarioFuente))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(linea.charAt(0));
                    if (palabrasPorLetra.containsKey(primeraLetra)) {
                        palabrasPorLetra.get(primeraLetra).add(linea);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo diccionario.txt");
            e.printStackTrace();
        }


        for (char letra = 'A'; letra <= 'Z'; letra++) {
            File archivo = new File(carpeta, letra + ".txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                for (String palabra : palabrasPorLetra.get(letra)) {
                    bw.write(palabra);
                    bw.newLine();
                }
                System.out.println("Archivo creado: " + archivo.getName());
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo " + archivo.getName());
                e.printStackTrace();
            }
        }
}}
