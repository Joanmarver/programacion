package Objetos;

import java.util.Random;

public class Hero {
    private String name;
    private int level,maxHealth,health,experience,attack,defense;

    public Hero(int level, String name, int maxHealth, int health, int experience, int attack, int defense) {
        this.level = level;
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public int drinkPotion(){
        int pocioncura = 10;
        health = health+ pocioncura;
        return health;
    }
    public int rest(){
        int restovida= 50;
        health = health - restovida;
        return health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
    public int attack(Hero enemigo){

       int ataque = Math.max(attack - enemigo.defense,10);
       health = health-ataque;
       int xpattack= 10;
       experience = experience+xpattack;
       return experience;
    }
    public int levelUP(){
        int plushealthlvl=5;
        int plusattacklvl=1;
        int plusdefenselvl=1;
        int subirnivel=50;
        if (experience>=subirnivel){
            level++;
            experience-=subirnivel;
            health+=plushealthlvl;
            attack+=plusattacklvl;
            defense+=plusdefenselvl;
        }
    }
}
