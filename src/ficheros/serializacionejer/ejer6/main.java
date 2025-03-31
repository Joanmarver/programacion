package ficheros.serializacionejer.ejer6;

import ficheros.serializacionejer.ejerfour.Persona;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String name="personas.dat";
        List<Persona> arrayList= new ArrayList<>();
        arrayList.add(new Persona("joan",20));
        arrayList.add(new Persona("juanito",25));
        arrayList.add(new Persona("cabedo", 35));
        try(ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(name))){
            object.writeObject(arrayList);
            System.out.println("serialializado correctamente");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
