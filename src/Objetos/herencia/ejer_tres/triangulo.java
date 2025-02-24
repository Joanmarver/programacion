package Objetos.herencia.ejer_tres;

public class triangulo extends Figura2D {
    private int base;
    private int altura;

    public triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base*this.altura/2;
    }
    public double perimetro(){
        return this.base*3;
    }

    @Override
    public String toString() {
        return "triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
