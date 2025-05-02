package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        String consulta= "SELECT nombre FROM Estudiante ORDER BY fecha_nacimiento LIMIT 5;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String nombre=res.getString("nombre");

                System.out.println(nombre);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
