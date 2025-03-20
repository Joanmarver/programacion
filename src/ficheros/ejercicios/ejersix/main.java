package ficheros.ejercicios.ejersix;




import java.io.*;
import java.util.Scanner;

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            String numero = scanner.nextLine();
            scanner.close();

            File archivoPi = new File("resources/Documentos/pi-million.txt");

            if (!archivoPi.exists()) {
                System.out.println("El archivo pi-million.txt no existe.");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(archivoPi))) {
                StringBuilder piDecimales = new StringBuilder();
                String linea;
                while ((linea = br.readLine()) != null) {
                    piDecimales.append(linea.trim());
                }


                boolean encontrado = false;
                for (int i = 0; i <= piDecimales.length() - numero.length(); i++) {
                    int j;
                    for (j = 0; j < numero.length(); j++) {
                        if (piDecimales.charAt(i + j) != numero.charAt(j)) {

                        }
                    }
                    if (j == numero.length()) {
                        encontrado = true;

                    }
                }

                if (encontrado) {
                    System.out.println("El número " + numero + " aparece en los primeros un millón de decimales de pi.");
                } else {
                    System.out.println("El número " + numero + " NO aparece en los primeros un millón de decimales de pi.");
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo pi-million.txt");
                e.printStackTrace();
            }
        }
    }

