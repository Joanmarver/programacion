package Objetos;

import java.util.Random;

import static java.lang.Math.random;

public class Cuenta {
private int numerocuenta;
private int saldodisponible;

    public Cuenta(Personas persona) {
        Random random= new Random(20);
        this.numerocuenta = persona.getNumDNI() + random.nextInt();

    }

    public int getSaldodisponible() {
        return saldodisponible;
    }
    public int abonos(int abono){
        saldodisponible+= abono;
        return saldodisponible;
    }
    public int recibos(int pago){
        saldodisponible-=pago;
        return saldodisponible;

    }
}
