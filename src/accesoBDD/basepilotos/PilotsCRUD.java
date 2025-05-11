package accesoBDD.basepilotos;

import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PilotsCRUD {
    public void CReatePilot(Connection bdd, Piloto piloto){
        int idgen=0;
        java.util.Date fechaUtil = piloto.getDob();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());


        try {
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
    public Piloto ReadPilot(Connection bdd, int id_piloto){
        try{
            String conuslta= "SELECT forename, surname, dob , nationality, url FROM drivers WHERE driverid =?;";
            PreparedStatement ps= bdd.prepareStatement(conuslta);
            ps.setInt(1,id_piloto);
            ResultSet rs= ps.executeQuery();
            String forename= rs.getString("forename");
            String surname= rs.getString("surname");
            Date dob= rs.getDate("dob");
            String nationality= rs.getString("nationality");
            String url=rs.getString("url");
            Piloto piloto= new Piloto(forename,surname,dob,nationality,url);
            return piloto;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Piloto> ReadPilots(Connection bdd, int id_piloto){
        ArrayList<Piloto>pilotos= new ArrayList<>();
        try{
            String conuslta= "SELECT forename, surname, dob , nationality, url FROM drivers;";
            PreparedStatement ps= bdd.prepareStatement(conuslta);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
            String forename= rs.getString("forename");
            String surname= rs.getString("surname");
            Date dob= rs.getDate("dob");
            String nationality= rs.getString("nationality");
            String url=rs.getString("url");
            Piloto piloto= new Piloto(forename,surname,dob,nationality,url);
            pilotos.add(piloto);
            }
            return pilotos;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
