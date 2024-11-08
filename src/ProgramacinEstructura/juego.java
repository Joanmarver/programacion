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
            Timer timer = new Timer();
            TimerTask mant2 = new TimerTask() {
                public void run () {
                    System.out.println("PUES EMPEZAMOS");
                }
            };
            timer.schedule(mant2, 0, 658764675);
            for (int i=0; i < 50; i++){
                System.out.println();
            }
        }
        else if (conf == 2) {
            Timer timer = new Timer();
            TimerTask mant = new TimerTask() {
                public void run() {
                    System.out.println("No os preocupeis, te pongo otra vez las normas");
                }

            };
            timer.schedule(mant,5000000);

            for (int i=0; i < 50; i++){
                System.out.println();
            }
            continue;
        }
        }


    }
}
