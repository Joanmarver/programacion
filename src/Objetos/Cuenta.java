package Objetos;

import java.util.Random;

public class Cuenta {
private int numerocuenta;
private int saldodisponible;

    public Cuenta(PersonasCuenta persona) {
        Random random= new Random(20);
        this.numerocuenta = persona.getNumDNI() + random.nextInt();
        this.saldodisponible=0;
    }


    public Cuenta(PersonasCuenta persona, int saldo) {
        this.saldodisponible = saldo;

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
