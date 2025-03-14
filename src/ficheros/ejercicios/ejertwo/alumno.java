package ficheros.ejercicios.ejertwo;

import java.util.ArrayList;
import java.util.List;

public class alumno {
    private String nombre;
    private String apellido;
    List<Double>notas= new ArrayList<>();

    public alumno(String nombre, String apellido, List<Double> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + notas +
                '}';
    }

    public double media(){
        double media=0;
        double notatotal=0;
        for (double nota: this.notas) {
        notatotal +=nota;

        }
        return notatotal/this.notas.size();

    }
}
