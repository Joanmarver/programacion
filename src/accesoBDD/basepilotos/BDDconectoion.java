package accesoBDD.basepilotos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDconectoion {
    public static  Connection conection() {
        Connection bdd= null;
        String url = "jdbc:postgresql://piloto.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/pilotos";
        String user = "postgres";
        String password = "12345678";
        try {bdd= DriverManager.getConnection(url,user,password);

        } catch (SQLException e) {
            System.out.println("error al acceder a la base de datos" );
           e.printStackTrace();
        }
        return bdd;
    }
}
