package accesoBDD.Ejercicios;

import java.sql.*;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        boolean inicio = true;
        Scanner scanner= new Scanner(System.in);
        while (inicio) {
            System.out.println(" 1.Consulta de Estudiantes por casa" +
                    "\n 2.Obtener la mascota de un estudiante especifico" +
                    "\n 3.Numero de estudiantes por casa" +
                    "\n 4.Insertar una nueva asignatura" +
                    "\n 5.Modificar el aula de una asignatura" +
                    "\n 6.Eliminar una Asignatura" +
                    "\n 7.Salir");
            int respuesta = scanner.nextInt();
            switch (respuesta) {
                case 1: {
                    estudiante_casa(scanner);
                    break;
                }
                case 2: {
                    mascota_estudiante(scanner);
                    break;
                }
                case 3: {
                    num_estudiante(scanner);
                    break;
                }
                case 4: {
                    insert_asignatura(scanner);
                    break;
                }
                case 5: {
                    modificarAulaAsignatura(scanner);
                    break;
                }
                case 6: {
                    eliminarAsignatura(scanner);
                    break;
                }
                case 7:{
                    inicio=false;
                    break;
                }
                default:
                    System.out.println("error");
            }
        }
    }
    public static void estudiante_casa(Scanner scanner){
        System.out.println("dime el nombre de la casa");
        scanner.nextLine();
        String casa = scanner.nextLine();
        String consulta= "SELECT Estudiante.nombre, Estudiante.apellido FROM Estudiante " +
                "JOIN Casa ON Casa.id_casa= Estudiante.id_casa WHERE Casa.nombre = ?";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement ps= bdd.prepareStatement(consulta);
            ps.setString(1,casa);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                String nombre= rs.getString("nombre");
                String apellido= rs.getString("apellido");
                System.out.println(nombre+ " " + apellido);
            }
            ps.close();
            rs.close();
            System.out.println("datos mostrados correctamente");
        } catch (SQLException E) {
            System.err.println("error al hacer la conuslta" + E.getMessage());;
        }
    }
    public static void mascota_estudiante(Scanner scanner){
        System.out.println("dime el nombre ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("dime tu apellido");
        String apellido= scanner.nextLine();
        String consulta= " SELECT Mascota.nombre FROM Mascota " +
                "JOIN Estudiante ON Estudiante.id_estudiante= Mascota.id_estudiante " +
                "WHERE Estudiante.nombre=? AND Estudiante.apellido=?";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
           PreparedStatement ps= bdd.prepareStatement(consulta);
           ps.setString(1,nombre);
           ps.setString(2,apellido);
           ResultSet rs= ps.executeQuery();
           while (rs.next()){
               String nombremas= rs.getString("nombre");
               System.out.println(nombremas);
           }
           rs.close();
           ps.close();
            System.out.println("consulta correcta");
        } catch (SQLException e) {
            System.err.println("error en la consulta" + e.getMessage());
        }
    }
    public static void num_estudiante(Scanner scanner){


       String consulta_num_estudiantes = " SELECT Casa.nombre AS nombre_casa , COUNT(Estudiante.nombre) AS num_estudiante FROM Estudiante JOIN Casa ON Casa.id_casa = Estudiante.id_casa GROUP BY nombre_casa";
       try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){

           try (PreparedStatement ps = bdd.prepareStatement(consulta_num_estudiantes)){
               ResultSet rs = ps.executeQuery();
               while (rs.next()){
                   String nombre_casa= rs.getString("nombre_casa");
                   int num_estudiante= rs.getInt("num_estudiante");
                   System.out.println(nombre_casa + " " + num_estudiante);

               }
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
           System.out.println("consulta correcta");

       } catch (SQLException e) {
           System.out.println("error en la consulta " + e.getMessage());
       }

    }
    public static void insert_asignatura (Scanner scanner){
        boolean obl= true;
        int idgenerado=-1;
        System.out.println("dime el nombre");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("dime el aula");
        String aula = scanner.nextLine();
        System.out.println("¿Es obligatoria?" +
                "\n 1. SI " +
                "\n 2. No");
        int respuesta = scanner.nextInt();
        if (respuesta == 2){
            obl= false;
        }
        String insert = "INSERT INTO Asignatura (nombre,aula,obligatoria)" +
                "VALUES (?,?,?)";
        try(Connection bdd = DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            PreparedStatement ps= bdd.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,nombre);
            ps.setString(2,aula);
            ps.setBoolean(3,obl);

            int filas = ps.executeUpdate();
            System.out.println("filas afectadas al insertar: " +  filas);
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()){
                idgenerado= rs.getInt(1);
            }
            rs.close();
            ps.close();
            System.out.println("asignatura nueva con id : "+ idgenerado);
            System.out.println("Asignatura insertada con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.err.println("error al insertar la asignatura");
        }
    }
    public static void modificarAulaAsignatura(Scanner scanner){
        System.out.println("dime el id de la asignatura");
        int id_asig = scanner.nextInt();
        System.out.println("dime la nueva aula");
        scanner.nextLine();
        String aula_nueva =scanner.nextLine();
        try(Connection bdd =  DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            String modificacion= "UPDATE Asignatura SET aula=? WHERE id_asignatura=?;";
            PreparedStatement ps= bdd.prepareStatement(modificacion);
            ps.setString(1,aula_nueva);
            ps.setInt(2,id_asig);
            int fila = ps.executeUpdate();
            System.out.println("filas afectadas :" + fila);
            ps.close();
        }catch (SQLException e){
            System.out.println("error al modificar el aula " +  e.getMessage());
        }



    }
    public static void eliminarAsignatura (Scanner scanner){
        System.out.println("dime el id de la asignatura");
        int id_asig= scanner.nextInt();
        try(Connection bdd =  DriverManager.getConnection("jdbc:postgresql://ad-postgres.cljzaoejhj87.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678")){
            String eliminacion = "DELETE FROM Asignatura WHERE id_asignatura=?;";
            PreparedStatement ps= bdd.prepareStatement(eliminacion);
            ps.setInt(1,id_asig);
            ps.executeUpdate();
            ps.close();
            System.out.println("Asigntura eliminada correctamente");
        } catch (SQLException e ) {
            System.out.println("error al eliminar la asignatura "+ e.getMessage());
        }
    }
}
