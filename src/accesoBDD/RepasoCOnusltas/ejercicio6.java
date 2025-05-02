package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio6 {
    public static void main(String[] args) {
        String consulta= "SELECT DISTINCT anyo_curso FROM Estudiante;";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(consulta);
            ResultSet res=p.executeQuery();
            while (res.next()){
                String anyo_curso=res.getString("anyo_curso");

                System.out.println(anyo_curso);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
