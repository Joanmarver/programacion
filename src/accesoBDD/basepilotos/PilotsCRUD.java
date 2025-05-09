package accesoBDD.basepilotos;

import java.sql.*;
import java.util.ResourceBundle;

public class PilotsCRUD {
    public void CReatePilot(Piloto piloto){
        int idgen=0;
        java.util.Date fechaUtil = piloto.getDob();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        try(Connection bdd= DriverManager.getConnection("jdbc:postgresql://piloto.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
        String consulta = "INSERT INTO DRIVERS (forename, surname, dob, nationality, url)" +
                "VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps= bdd.prepareStatement(consulta);
            ps.setString(1, piloto.getForename());
            ps.setString(2, piloto.getSurname());
            ps.setDate(3,fechaSQL);
            ps.setString(4, piloto.getIngnationality());
            ps.setString(5, piloto.getURL());
            int filasafectadas = ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()){
                idgen=rs.getInt(1);

            }
            System.out.println("id del nuevo piloto : " + idgen);
            rs.close();
            ps.close();
        }catch (SQLException e){
            System.out.println("error al insertar un nuevo piloto " + e.getMessage());
        }

    }
}
