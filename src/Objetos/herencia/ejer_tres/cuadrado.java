package Objetos.herencia.ejer_tres;

public class cuadrado extends Figura2D {
    private int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {

        return this.lado*this.lado;
    }

    @Override
    public double perimetro() {
        return this.lado *4;
    }

    @Override
    public String toString() {
        return "cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
