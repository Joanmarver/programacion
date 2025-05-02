package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String consulta= "SELECT Estudiante.nombre, Estudiante.apellido\n" +
                "FROM Estudiante\n" +
                "INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa\n" +
                "WHERE anyo_curso = 5 AND (Casa.nombre = 'Gryffindor' OR Casa.nombre = 'Slytherin');";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String nombre=res.getString("nombre");
                String apellido=res.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
