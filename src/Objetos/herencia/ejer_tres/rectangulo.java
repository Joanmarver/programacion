package Objetos.herencia.ejer_tres;

public class rectangulo extends Figura2D {
    private int base;
    private int altura;

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base*this.altura;
    }
    public double perimetro(){
        return base*2+this.altura*2;
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
