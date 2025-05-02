package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio4 {
    public static void main(String[] args) {
        String consulta= "SELECT Casa.nombre , COUNT(Estudiante.nombre) AS estudiantes FROM Estudiante INNER JOIN Casa ON casa.id_casa=Estudiante.id_casa GROUP BY casa.nombre;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String nombre=res.getString("nombre");
                String apellido=res.getString("estudiantes");
                System.out.println(nombre + " " + apellido);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
