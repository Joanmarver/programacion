package ficheros.funkos.funkosnormal;

import java.io.Serializable;
import java.time.LocalDate;

public class Funko implements Serializable {
    private String codigo;
    private String modelo;
    private double precio;
    private LocalDate anio;
    private String nombre;



    public Funko( String codigo,String nombre,String modelo, double precio, LocalDate anio) {
        this.nombre=nombre;
        this.modelo = modelo;
        this.codigo=codigo;
        this.precio = precio;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return codigo + "," +
                nombre + "," +
                modelo + "," +
                precio + "," +
                anio + ",";
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}


