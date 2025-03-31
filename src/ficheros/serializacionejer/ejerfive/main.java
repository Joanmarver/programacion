package ficheros.serializacionejer.ejerfive;

import ficheros.serializacionejer.ejerfour.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main {
    public static void main(String[] args) {
        String filename= "persona.dat";
        try(ObjectInputStream ObjectIS= new ObjectInputStream(new FileInputStream(filename))){
            Persona datospersona= (Persona) ObjectIS.readObject();
            System.out.println("deserializado correctamente :" + datospersona);
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
