package excepciones.ejerseis;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ejerseis {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime el nombre del gato ");
        String name= scanner.nextLine();
        System.out.println("dime la edad del gato ");
        int age = scanner.nextInt();

        try{
            Gato gato=new Gato(name,age);
        }catch (Exception e){
            System.out.println("error al crear gato:" +  e.getMessage());

        }

    }
}
