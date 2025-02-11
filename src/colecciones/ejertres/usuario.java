package colecciones.ejertres;

public class usuario {
    private int edad;
    private String name;
    private String dni;

    public usuario(int edad, String name, String dni) {
        this.edad = edad;
        this.name = name;
        this.dni = dni.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "edad=" + edad +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
