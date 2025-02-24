package Objetos.herencia.ejer_tres;

public class circulo extends Figura2D {
    private  int radio;

    public circulo(int radio) {
        this.radio = radio;
    }

    public double area(){
        return 2*3.14*this.radio;
    }
    public double perimetro(){
        return 2*3.14*this.radio;
    }

    @Override
    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                '}';
    }
}
