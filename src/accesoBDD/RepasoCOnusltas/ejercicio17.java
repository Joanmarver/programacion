package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio17 {
    public static void main(String[] args) {
        String consulta= "SELECT Estudiante.nombre\n" +
                "FROM Estudiante\n" +
                "JOIN Estudiante_Asignatura ON Estudiante_Asignatura.id_estudiante = Estudiante.id_estudiante\n" +
                "JOIN Asignatura ON Asignatura.id_asignatura = Estudiante_Asignatura.id_asignatura\n" +
                "WHERE Asignatura.nombre = 'Encantamientos'\n" +
                "  AND Estudiante_Asignatura.calificacion > (\n" +
                "    SELECT AVG(C2.calificacion)\n" +
                "    FROM Estudiante_Asignatura C2\n" +
                "    JOIN Asignatura A2 ON C2.id_asignatura = A2.id_asignatura\n" +
                "    WHERE A2.nombre = 'Encantamientos'\n" +
                "  );\n";
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
