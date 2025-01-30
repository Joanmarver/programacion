package Objetos;

import javax.xml.namespace.QName;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class juegorol {
    public static void main(String[] args) {
        Random random = new Random();
        Hero caballero = new Hero(1,"caballero",200,200,0,100,100);
        int numhorda= random.nextInt(1,3);
        Hero[] horda = new Hero[numhorda];
        Generarhorda(horda);
        MostrarPersonajes(caballero,horda);

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
        int ataque= random.nextInt(1,100);
        int defensa= random.nextInt(1,100);
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
        Scanner scaner= new Scanner(System.in);
        Random random = new Random(3);
        int numerohorda= random.nextInt(1,3);
        System.out.println("Para atacar pulsa enter");
        scaner.nextLine();
        scaner.nextLine();
        horda[numerohorda].attack(caballero);



    }
}

