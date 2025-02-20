package Objetos.herencia.ejerdos;

public class main {
    public static void main(String[] args) {
        Animal perro= new Perro("ñam-ñam","grr","guauguau","salchicha","esta siendo paseado");
        Animal gato= new Gato("ñam-ñam","grrr","miau","maltés","se ha atragantado con una mata de pelo");
        Animal tortuga=new tortuga("ñam","grr","ah",true,true);
        Animal ballena=new ballena("ñam-ñam","grr","shhh","ffff",2000);
        Animal Leon=new leon("ñam-ñam","grr","GRRRRRRR","el leon esta cazando");
        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(tortuga.toString());
        System.out.println(ballena.toString());
        System.out.println(Leon.toString());
    }
}
