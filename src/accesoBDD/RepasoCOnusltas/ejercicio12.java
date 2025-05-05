package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio12 {
    public static void main(String[] args) {
        String nombre="Nymphadora";
        String apellido ="Tonks";
        String id_casa= "4";
        String anyo_curso="7";
        String fecha="'1973-11-25'";
        String insert= "INSERT INTO Estudiante (nombre,apellido,id_casa,anyo_curso, fecha_nacimiento) VALUES (?, ?, ?, ?, ?)";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
           p.setString(1,nombre);
           p.setString(2,apellido);
           p.setString(3,id_casa);
           p.setString(4,anyo_curso);
           p.setString(5,fecha);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
