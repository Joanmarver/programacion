package Objetos.herencia.ejerdos;

class ballena extends Animal {
    private String inhalacion;
    private int peso;

    public ballena(String comer, String dormir, String hacerRuido, String inhalacion, int peso) {
        super(comer, dormir, hacerRuido);
        this.inhalacion = inhalacion;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ballena{" +
                "inhalacion='" + inhalacion + '\'' +
                ", peso=" + peso +
                '}';
    }
}
