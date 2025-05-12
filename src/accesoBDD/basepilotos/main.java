package accesoBDD.basepilotos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Connection conn=null;
        Scanner scanner= new Scanner(System.in);
        boolean inicio=true;
        while(inicio){
        System.out.println("1. CreatePilot" +
                "\n 2. ReadPilot" +
                "\n 3. ReadPilots" +
                "\n 4. UpdatePilot" +
                "\n 5. DeletePilot" +
                "\n 6. ShowPilotClassification" +
                "\n 7. SHowBuildersClassification" +
                "\n 8. Salir ");
        int respuesta = scanner.nextInt();
        switch (respuesta){
            case 1: {
                Piloto piloto= pilotocrear(scanner);
                conn = BDDconectoion.conection();
                PilotsCRUD.CReatePilot(conn,piloto);
                break;
            }
            case 2: {
                System.out.println("id driver : ");
                int driverid= scanner.nextInt();
                conn= BDDconectoion.conection();
                Piloto piloto= PilotsCRUD.ReadPilot(conn,driverid);
                System.out.println(piloto.toString());
                break;
            }
            case 3: {
                conn=BDDconectoion.conection();
                ArrayList<Piloto> array = PilotsCRUD.ReadPilots(conn);
                for (Piloto piloto: array){
                    System.out.println(piloto.toString());
                }
                break;

            }
            case 4:{
                Piloto piloto = pilotocrear(scanner);
                conn=BDDconectoion.conection();
                PilotsCRUD.Updatepilot(conn,piloto);
                break;
            }
            case 5:{
                System.out.println("driver_id");
                int driverid= scanner.nextInt();
                Piloto piloto = pilotocrear(scanner);
                conn=BDDconectoion.conection();
                PilotsCRUD.Deletepilot(conn,driverid);
                break;
            }
            case 6:{

                conn=BDDconectoion.conection();
                PilotsCRUD.ShowPilotClassification(conn);
                break;
            }
            case 7 :{
                conn =BDDconectoion.conection();
                PilotsCRUD.ShowBuildersClassification(conn);
                break;
            }
        }
        }

    }
    public static Piloto pilotocrear(Scanner scanner){
        System.out.println("forename : ");
        scanner.nextLine();
        String forename= scanner.nextLine();
        System.out.println("surname : ");
        String surname = scanner.nextLine();
        System.out.println("fecha : (YEAR-MM-DY");
        String fecha = scanner.nextLine();
        LocalDate fechaguay= LocalDate.parse(fecha);
        System.out.println("url : ");
        String url= scanner.nextLine();
        System.out.println("nationality : ");
        String nation= scanner.nextLine();
        System.out.println("CODE : ");
        String code=scanner.nextLine();

        Piloto piloto = new Piloto(forename,surname,fechaguay,nation,url,code);
        return piloto;

    }
}
