package ficheros.ejercicios.ejerfour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        List <String>Name_nametwo= new ArrayList<>();
        int cont =0;
        Scanner scanner= new Scanner(System.in);
        Path nombres= Paths.get("resources/Documentos/usa_nombres.txt");
        Path apellidos=Paths.get("resources/Documentos/usa_apellidos.txt");
        System.out.println("Vamos a generar nombres aleatorios");
        System.out.println("dime el numero de nombres");
        int numName= scanner.nextInt();
        System.out.println("dime el archivo donde quieras añadir los nombres. si ese archivo no existe, se creará");
        scanner.nextLine();
        Path archivo = Paths.get(scanner.nextLine());
        try{
            List<String> names= Files.readAllLines(nombres);
            List<String> nametwo = Files.readAllLines(apellidos);
            while (cont < numName){
                int ale = random.nextInt(names.size());
                int ale2 = random.nextInt(nametwo.size());
                Name_nametwo.add(names.get(ale)+ " " + nametwo.get(ale2));
                cont++;
            }
            if (!Files.exists(archivo)){
                Files.createFile(archivo);
            }
            Files.write(archivo,Name_nametwo, StandardOpenOption.APPEND);
            String content= Files.readString(archivo);
            System.out.println(content);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error");
        }
}}
