package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio18 {
    public static void main(String[] args) {
        String consulta= "SELECT C.nombre\n" +
                "FROM Casa C\n" +
                "JOIN Estudiante E ON E.id_casa = C.id_casa\n" +
                "JOIN Estudiante_Asignatura EA ON EA.id_estudiante = E.id_estudiante\n" +
                "GROUP BY C.nombre\n" +
                "HAVING AVG(EA.calificacion) > 7;\n;";
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
