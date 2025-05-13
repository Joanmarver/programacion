package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejecicio11 {
    public static void main(String[] args) {
        String consulta= "SELECT Estudiante.nombre FROM Estudiante JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura " +
                "WHERE Asignatura.nombre = 'Vuelo' AND Estudiante_asignatura.calificacion >= 8;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String nombre=res.getString("nombre");
                System.out.println(nombre );
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
