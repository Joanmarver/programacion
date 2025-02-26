import java.util.HashSet;
import java.util.Set;

public class pruebas {
    public static void main(String[] args) {
        Set<String>ejemplo=new HashSet<>();
        ejemplo.add("hola");
        if (ejemplo.size()<4){
            System.out.println("perfect");
        }else {
            System.out.println("lololol");
        }
        
    }
}
