package ficheros.ejercicios.ejerfive;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String carpetaNombre = "Diccionario";
        Path diccionarioFuente = Paths.get("diccionario.txt");

        // Crear la carpeta 'Diccionario' si no existe
        File carpeta = new File(carpetaNombre);
        if (!carpeta.exists() && !carpeta.mkdir()) {
            System.out.println("No se pudo crear la carpeta.");
            return;
        }

        // Mapa para clasificar palabras por letra
        Map<Character, List<String>> palabrasPorLetra = new HashMap<>();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            palabrasPorLetra.put(letra, new ArrayList<>());
        }

        // Verificar existencia del archivo diccionario.txt y crearlo si no existe
        try {
            if (!Files.exists(diccionarioFuente)) {
                Files.createFile(diccionarioFuente);
                System.out.println("Archivo diccionario.txt creado.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear diccionario.txt: " + e.getMessage());
            return;
        }

        // Leer diccionario.txt y clasificar palabras
        try (BufferedReader br = new BufferedReader(new FileReader(diccionarioFuente.toFile()))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String palabra = linea.trim();
                if (!palabra.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                    if (palabrasPorLetra.containsKey(primeraLetra)) {
                        palabrasPorLetra.get(primeraLetra).add(palabra);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo diccionario.txt");
            e.printStackTrace();
            return;
        }

        // Crear archivos de cada letra y escribir palabras correspondientes
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
    }
}

