package ficheros.funkos;

import java.io.Serializable;

public class Funko implements Serializable {
    private String codigo;
    private String modelo;
    private double precio;
    private String anio;
    private String nombre;



    public Funko( String codigo,String nombre,String modelo, double precio, String anio) {
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", anio='" + anio + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}


