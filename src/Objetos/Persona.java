package Objetos;

public class Persona {
    private final String letraDNI;
    public final int numDNI;
    private String apellidos;
    private int edad;
    private String nombre;


    public  final int Adultage=18;
    public final int retiredAge=65;



    public Persona(String letraDNI, int numDNI, String apellidos, int edad, String nombre) {
        if (!dnicorrecto(letraDNI,numDNI)){
            System.out.println("error en el dni");
        }

       this.letraDNI = letraDNI;
        this.numDNI = numDNI;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nombre=nombre;

    }

    public String getLetraDNI() {
        return letraDNI;
    }

    public int getNumDNI() {
        return numDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //mostrar informacion
    public void print(){
        System.out.println("Información de la Persona:");
        System.out.println("DNI: " + numDNI+letraDNI);
        System.out.println("Nombre: " + apellidos);
        System.out.println("Apellidos: "+ nombre);
        System.out.println("Edad: " + edad);
    }
    // METODO MAYOR DE EDAD
    public void isAdult(){
        if (edad >= Adultage){
            System.out.println("La persona llamada " + nombre + " es mayor de edad");
        }else {
            System.out.println("la persona llamada " + nombre + " es menor de edad ");
        }
    }
    // METODO JUBILADO
    public void isRetired(){
        if (edad >= retiredAge){
            System.out.println("La persona llamada " + nombre + " esta jubilado");
        }else {
            System.out.println("la persona llamada " + nombre + " no esta jubilado ");
        }
    }
    // METODO DIFERENCIA DE EDAD
    public int ageDifference(Persona personados){
        int diferenciaedad =  edad -  personados.edad;
        return diferenciaedad;
    }
    public boolean dnicorrecto(String letraDNI, int numDNI){


        boolean dnicorrecto=true;
        if (numDNI <00000001 && numDNI > 99999999){
            System.out.println("dni incorrecto");
            dnicorrecto=true;
        }else{

            String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letracorrecta = letrasDNI.charAt(numDNI%23);
            char letrauser= letraDNI.charAt(0);
            if (letracorrecta!=letrauser){
                dnicorrecto=false;
            }

        }
        return dnicorrecto;
    }



}
