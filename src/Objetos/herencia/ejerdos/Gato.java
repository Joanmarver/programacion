package Objetos.herencia.ejerdos;

class Gato extends Animal {
    private String tipo;
    private String matadepelo;

    public Gato(String comer, String dormir, String hacerRuido, String tipo, String matadepelo) {
        super(comer, dormir, hacerRuido);
        this.tipo = tipo;
        this.matadepelo = matadepelo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "tipo='" + tipo + '\'' +
                ", matadepelo='" + matadepelo + '\'' +
                '}';
    }

}
