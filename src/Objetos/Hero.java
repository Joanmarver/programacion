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

    public int getLevel() {
        return level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Hero() {
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
    public void attack(Hero enemigo){

       int ataque = Math.max(1,enemigo.attack-defense);
        System.out.println("ATAQUE DE "+ ataque + " DAÑO");
       health = health-ataque;
       int xpattack= 10;
       experience = experience+xpattack;
       levelUP();

    }
    public int levelUP(){
        int plushealthlvl=5;
        int plusattacklvl=1;
        int plusdefenselvl=1;
        int subirnivel=50;
        if (experience>=subirnivel){
            System.out.println("has subido de nivel");
            level++;
            experience-=subirnivel;
            health+=plushealthlvl;
            attack+=plusattacklvl;
            defense+=plusdefenselvl;
        }
        return level;
    }
}
