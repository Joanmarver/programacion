package Objetos;

import java.util.Random;
import java.util.Scanner;

public class juegorol {
    public static void main(String[] args) {
        Random random = new Random();
        Hero caballero = new Hero(1,"caballero",200,200,0,100,100);
        int numhorda= random.nextInt(1,3);
        Hero[] horda = new Hero[numhorda];
        Generarhorda(horda);
        pelea(horda,caballero);


    }
    public static void MostrarPersonajes(Hero caballero, Hero[] horda){
        System.out.println("NUESTRO HEROE:");
        System.out.print(caballero+ "\n");
        System.out.println("LOS ENEMIGOS:");

        for (int i=0; i<horda.length;i++){
            System.out.println(horda[i]);
        }

    }
    public static void Generarhorda(Hero[] horda){
        Random random = new Random();
        int ataque= random.nextInt(1,150);
        int defensa= random.nextInt(1,150);
        String nombre="enemigo";
        int experiencia = 0;
        int lvl = 1;
        int vida = random.nextInt(1,100);
        int maximovida=150;

        for (int i =0; i< horda.length;i++){
            Hero enemigo= new Hero();
            enemigo.setAttack(ataque);
            enemigo.setDefense(defensa);
            enemigo.setHealth(vida);
            enemigo.setLevel(lvl);
            enemigo.setMaxHealth(maximovida);
            enemigo.setName(nombre);
            horda[i]= enemigo;

        }
    }

    public static void pelea(Hero[] horda, Hero caballero){
        //variables
        int minvida=0;
        int numhordas =0;
        boolean enemigosmuertos=true;
        Scanner scaner= new Scanner(System.in);
        Random random = new Random();
        //random para que ataque aleatoriamente a un enemigo de a horda
        int numerohorda= random.nextInt(horda.length);
        System.out.println("Para atacar pulsa enter");
        scaner.nextLine();
        //si el caballero muere, se termina
        while (caballero.getHealth() > 0) {
            MostrarPersonajes(caballero,horda);
            //saber si hay un enemigo
        if (horda[numerohorda]!=null) {
            horda[numerohorda].attack(caballero);

                //comprobación de el enemigo vivo
                if (horda[numerohorda].getHealth() <= minvida) {
                    System.out.println("el enemigo ha sido derrotado");
                    horda[numerohorda] = null;
                    for (int i =0;i<horda.length;i++){
                        if (horda[i]!=null){
                            enemigosmuertos=false;
                        }
                    }
                    // una vez muerto , creamos otro random. el bucle es para que si o si , no sea nulo
                    if (enemigosmuertos){
                        System.out.println("la horda ha sido derrotada, se aproxima otra. Pulsa enter");
                        scaner.nextLine();
                        Generarhorda(horda);
                        numhordas++;
                    }
                    while (horda[numerohorda]==null){
                        numerohorda = random.nextInt(horda.length);
                    }
                } else {
                    System.out.println("Vida restante del enemigo " + horda[numerohorda].getHealth());
                }
                //el caballero puede no darle al enemigo
            }else{
                System.out.println("el caballero no dió a ningun enemigo");
            }
            //turno de los enemigos
            System.out.println("turno del los enemigos");
            caballero.attack(horda[numerohorda]);
            if (caballero.getHealth() <= minvida) {
                System.out.println("el caballero  ha sido derrotado");
                horda[numerohorda] = null;
            } else {
                System.out.println("Vida restante del caballero " + caballero.getHealth());
            }
            MostrarPersonajes(caballero, horda);


        }






    }
}

