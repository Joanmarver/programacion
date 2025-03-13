package ficheros.ejercicios.ejertwo;

import java.util.ArrayList;
import java.util.List;

public class alumno {
    private String nombre;
    private String apellido;
    List<String>notas= new ArrayList<>();

    public alumno(String nombre, String apellido, List<String> notas) {
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

    public List<String> getNotas() {
        return notas;
    }

    public void setNotas(List<String> notas) {
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

    public int media(){
        int media=0;
        int notatotal=0;
        for (String nota: this.notas) {
            notatotal+= Integer.parseInt(nota);

        }
        return notatotal/this.notas.size();

    }
}
