package Objetos.herencia.ejerdos;

public class Animal {
     private String comer;
     private String dormir;
     private String hacerRuido;

    public Animal(String comer, String dormir, String hacerRuido) {
        this.comer = comer;
        this.dormir = dormir;
        this.hacerRuido = hacerRuido;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getDormir() {
        return dormir;
    }

    public void setDormir(String dormir) {
        this.dormir = dormir;
    }

    public String getHacerRuido() {
        return hacerRuido;
    }

    public void setHacerRuido(String hacerRuido) {
        this.hacerRuido = hacerRuido;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "comer='" + comer + '\'' +
                ", dormir='" + dormir + '\'' +
                ", hacerRuido='" + hacerRuido + '\'' +
                '}';
    }
}

