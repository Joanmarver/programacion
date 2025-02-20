package Objetos.herencia.ejerdos;

class Perro extends Animal{
    private  String raza;
    private String pasear;

    public Perro(String comer, String dormir, String hacerRuido, String raza, String pasear) {
        super(comer, dormir, hacerRuido);
        this.raza = raza;
        this.pasear = pasear;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", pasear='" + pasear + '\'' +
                '}';
    }
}
