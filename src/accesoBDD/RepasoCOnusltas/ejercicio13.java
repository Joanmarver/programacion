package accesoBDD.RepasoCOnusltas;

import java.Main;
import java.sql.*;

public class ejercicio13 {
    public static void main(String[] args) {
        int idProfesor=0;
        try(Connection bdd= DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            String consultaID="SELECT Profesor.id_profesor FROM Profesor JOIN Casa ON Casa.id_jefe=Profesor.id_profesor WHERE Casa.nombre = 'Hufflepuff'";
            String update="UPDATE Casa SET id_jefe = ? WHERE nombre = 'Pomona Sprout'";
            PreparedStatement  ps = bdd.prepareStatement(consultaID);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
               idProfesor=rs.getInt("id_profesor");

            }
            PreparedStatement ps2= bdd.prepareStatement(update);
            ps2.setInt(1,idProfesor);
            int filas= ps2.executeUpdate();
            if (filas > 0){
                System.out.println("se actualizó el jefe de Pomona Sprout");
            }else{
                System.out.println("no se encontró la casa Pomona Sprout");
            }
    } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}}
