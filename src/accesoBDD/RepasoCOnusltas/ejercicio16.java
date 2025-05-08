package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio16 {
    public static void main(String[] args) {
        String consulta= "SELECT \n" +
                "    Estudiante.nombre, \n" +
                "    Mascota.nombre AS mascota, \n" +
                "    Asignatura.nombre AS asignatura\n" +
                "FROM Estudiante \n" +
                "LEFT JOIN Mascota \n" +
                "    ON Estudiante.id_estudiante = Mascota.id_estudiante \n" +
                "JOIN Estudiante_Asignatura \n" +
                "    ON Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante \n" +
                "JOIN Asignatura \n" +
                "    ON Asignatura.id_asignatura = Estudiante_Asignatura.id_asignatura;\n;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String nombre=res.getString("nombre");
                String mobremas=res.getString("mascota");
                String asignatura=res.getString("asignatura");
                System.out.println(nombre + " " + mobremas + " " + asignatura);


            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
