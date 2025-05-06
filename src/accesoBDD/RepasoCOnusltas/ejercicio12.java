package accesoBDD.RepasoCOnusltas;

import java.sql.*;

public class ejercicio12 {
    public static void main(String[] args) {
        String nombre="Nymphadora";
        String apellido ="Tonks";
        int id_casa= 4;
        int anyo_curso=7;
        Date fecha= Date.valueOf("1973-12-25");

        String insert= "INSERT INTO Estudiante (nombre,apellido,id_casa,anyo_curso, fecha_nacimiento) VALUES (?, ?, ?, ?, ?)";
        int idGenerado = -1;
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement p= bdd.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
           p.setString(1,nombre);
           p.setString(2,apellido);
           p.setInt(3,id_casa);
           p.setInt(4,anyo_curso);
           p.setDate(5,fecha);

           int filasAfectadas = p.executeUpdate();
            System.out.println("filas afectadas  al insertar " + filasAfectadas);
            ResultSet rs = p.getGeneratedKeys();
            if (rs.next()){
              idGenerado = rs.getInt(1);
            }
            rs.close();
            p.close();
            System.out.println("Estudiante generado con ID: " + idGenerado);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
