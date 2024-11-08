package ProgramacinEstructura;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class juego {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);


        int velocidad1,velocidad2,ataque1,ataque2,defensa1,defensa2,vida1,vida2;
        boolean confirmar,inicio;
        confirmar = true;
        inicio = true;
        Timer timer = new Timer();
        while (inicio) {
        System.out.println("Hola, bienvenidos a FIGHT SIMULATOR4");
        System.out.println("Explicación basica de las reglas :" + "\n" + "Tendremos los siguientes atributos:" );
        System.out.println("-  Velocidad"+"\n"+"-  Ataque"+"\n"+"-  Defensa"+"\n" + "-  Puntos de vida");
        System.out.println("La suma de los atributos de un jugador no podrá ser superior a 500");
        System.out.println("ada uno de los atributos debe tener un valor entre 1 y 200 ");
        System.out.println("En cada uno de los turnos el jugador con mayor velocidad hace un primer\n" +
                "ataque, a continuación el segundo jugador (si su vida no ha llegado a cero)\n" +
                "realiza su ataque.");
        System.out.println("Cada ataque quita puntos de vida al contrincante");
        System.out.println("Cuando uno de los dos jugadores vé reducida su vida a cero pierde la\n" +
                "partida, por tanto gana el otro jugador"+"\n");
        System.out.println("Si lo habeis entendo pulsa '1' si no pulsa '2'");
        int conf = userprint.nextInt();
        if (conf == 1) {
            for (int i=0; i < 100; i++){
                System.out.println();
            }
            TimerTask mant = new TimerTask() {
                public void run() {
                    System.out.println("No os preocupeis, Os pongo otra vez las normas");
                }

            };
            timer.schedule(mant,0);


        }
        else if (conf == 2) {
            TimerTask mant = new TimerTask() {
                public void run() {
                    System.out.println("No os preocupeis, te pongo otra vez las normas");
                }

            };
            timer.schedule(mant,0);

            for (int i=0; i < 50; i++){
                System.out.println();
            }
            continue;
        } else {
            System.out.println("ERROR");
            continue;
        };
        }


    }
}
