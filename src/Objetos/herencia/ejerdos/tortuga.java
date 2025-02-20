package Objetos.herencia.ejerdos;

class tortuga extends Animal {
    private boolean nadar;
    private boolean caminar;

    public tortuga(String comer, String dormir, String hacerRuido, boolean caminar, boolean nadar) {
        super(comer, dormir, hacerRuido);
        this.caminar = caminar;
        this.nadar = nadar;
    }

    @Override
    public String toString() {
        return "tortuga{" +
                "nadar=" + nadar +
                ", caminar=" + caminar +
                '}';
    }
}
