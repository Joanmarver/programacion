package excepciones.ejerseis;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String name, int age) throws Exception{
            setNombre(name);
            setEdad(age);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) throws Exception{
        if (name.length()<3){
            throw new Exception("nombre demasiado corto");

        }else {
           this.nombre=name;
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) throws Exception{
        if (age <0 ){
            throw  new Exception("la edad no puede ser negativa");
        }else {
            this.edad = age;
        }

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
