package accesoBDD.basepilotos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PilotsCRUD {
    public static void CReatePilot(Connection bdd, Piloto piloto){
        int idgen=0;



        try {
            String consulta = "INSERT INTO DRIVERS (forename, surname, dob, nationality, url, code)" +
                    "VALUES (?, ?, ?, ?, ?,?);";
            PreparedStatement ps= bdd.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, piloto.getForename());
            ps.setString(2, piloto.getSurname());
            ps.setDate(3,Date.valueOf(piloto.getDob()));
            ps.setString(4, piloto.getIngnationality());
            ps.setString(5, piloto.getURL());
            ps.setString(6, piloto.getCode());
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
    public static Piloto ReadPilot(Connection bdd, int id_piloto) {
        try {
            String consulta = "SELECT driverid, forename, surname, dob, nationality, url, code FROM drivers WHERE driverid = ?;";
            PreparedStatement ps = bdd.prepareStatement(consulta);
            ps.setInt(1, id_piloto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int driverid = rs.getInt("driverid");
                String forename = rs.getString("forename");
                String surname = rs.getString("surname");
                LocalDate dob = rs.getDate("dob").toLocalDate();
                String nationality = rs.getString("nationality");
                String url = rs.getString("url");
                String code = rs.getString("code");

                return new Piloto(forename, surname, dob, nationality, url, driverid, code);
            } else {
                System.out.println("No se encontró el piloto con ID: " + id_piloto);
                return null;
            }

        } catch (Exception e) {
            throw new RuntimeException("Error al leer el piloto con ID: " + id_piloto, e);
        }
    }

    public static ArrayList<Piloto> ReadPilots(Connection bdd){
        ArrayList<Piloto>pilotos= new ArrayList<>();
        try{
            String conuslta= "SELECT driverid, forename, surname, dob , nationality, url,code FROM drivers;";
            PreparedStatement ps= bdd.prepareStatement(conuslta);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                int driverid= rs.getInt("driverid");
            String forename= rs.getString("forename");
            String surname= rs.getString("surname");
            LocalDate dob= rs.getDate("dob").toLocalDate();
            String nationality= rs.getString("nationality");
            String url=rs.getString("url");
            String code=rs.getString("code");
                Piloto piloto= new Piloto(forename,surname,dob,nationality,url,driverid,code);
            pilotos.add(piloto);
            }
            return pilotos;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void ShowPilotClassification (Connection conn ){
        try{
            String consulta = "SELECT drivers.forename, SUM(results.points) AS points " +
                    "FROM drivers " +
                    "JOIN results ON results.driverid = drivers.driverid " +
                    "GROUP BY drivers.driverid, drivers.forename " +
                    "ORDER BY points DESC;";
            ;
            PreparedStatement ps= conn.prepareStatement(consulta);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                String nombre= rs.getString("forename");
                int puntos= rs.getInt("points");
                System.out.println(nombre + " " + puntos);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void ShowBuildersClassification (Connection conn ){
        try{
            String consulta= "SELECT constructors.name , SUM(results.points) AS points FROM constructors " +
                    "JOIN drivers ON drivers.constructorid=constructors.constructorid " +
                    "JOIN results ON results.driverid=drivers.driverid GROUP BY constructors.constructorid , constructors.name ORDER BY points DESC;";
            PreparedStatement ps= conn.prepareStatement(consulta);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                String equipo= rs.getString("name");
                int puntos= rs.getInt("points");
                System.out.println( equipo + " "+ puntos);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void Updatepilot(Connection conn,Piloto piloto){
        Scanner scanner= new Scanner(System.in);
        System.out.println("driver id_");
        int driver_id = scanner.nextInt();
        piloto.setDriverid(driver_id);
         try{
             String consulta="UPDATE drivers SET forename=?, surname=?, dob=?, nationality=?, url=?, code=? WHERE driverid=?;";
             PreparedStatement ps= conn.prepareStatement(consulta);
             ps.setString(1, piloto.getForename());
             ps.setString(2, piloto.getSurname());
             ps.setDate(3,Date.valueOf(piloto.getDob()));
             ps.setString(4, piloto.getIngnationality());
             ps.setString(5,piloto.getURL());
             ps.setInt(7,piloto.getDriverid());
             ps.setString(6, piloto.getCode());
             ps.executeUpdate();
             System.out.println("datos actualizados");



         } catch (SQLException e) {
             System.out.println("fallo en hacer el update " + e.getMessage());;
         }
    }
    public static void Deletepilot(Connection conn,int driver_id){
        try{
            String consulta= "DELETE FROM drivers WHERE driveid=?;";
            PreparedStatement ps= conn.prepareStatement(consulta);
            ps.setInt(1, driver_id);
            ps.executeUpdate();
            System.out.println("driver eliminado correctamente");
        }catch (SQLException e){

        }
    }
}
