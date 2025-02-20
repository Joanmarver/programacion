package Objetos.herencia.ejerdos;

class leon extends Animal {
    private String caza;
    private boolean jefemanada;

    public leon(String comer, String dormir, String hacerRuido, String caza) {
        super(comer, dormir, hacerRuido);
        this.caza = caza;
    }

    @Override
    public String toString() {
        return "leon{" +
                "caza='" + caza + '\'' +
                ", jefemanada=" + jefemanada +
                '}';
    }
}
