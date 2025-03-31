package ficheros.serializacionejer.ejerfour;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {
        Persona persona= new Persona("ana",19);
        String filenombre= "persona.dat";
        try(ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(filenombre))){
            object.writeObject(persona);
            System.out.println("serialializado correctamente");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
