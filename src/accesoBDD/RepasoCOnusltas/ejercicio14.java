package accesoBDD.RepasoCOnusltas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ejercicio14 {
    public static void main(String[] args) {
        try(Connection conn= DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){

        }catch (SQLException E){
            System.out.println(E.getMessage());
        }
    }
}
