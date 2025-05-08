package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio15 {
    public static void main(String[] args) {
        String consulta= "SELECT Estudiante.nombre, Estudiante.apellido , Casa.nombre FROM Estudiante JOIN Casa ON Casa.id_casa= Estudiante.id_casa;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            System.out.println(" nombre " + " apellido " + "Nombre_casa");
            while (res.next()){
                String nombre=res.getString("nombre");
                String apellido=res.getString("apellido");
                String nombrecs=res.getString("nombre");
                System.out.println(nombre + " " + apellido + " " + nombrecs );
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
