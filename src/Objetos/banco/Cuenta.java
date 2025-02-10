package Objetos.banco;

import java.util.Random;

public class Cuenta {
private int numerocuenta;
private int saldodisponible;

    public Cuenta(PersonasCuenta persona) {
        Random random= new Random();
        this.numerocuenta = persona.getNumDNI() + random.nextInt(0,1000);
        this.saldodisponible=0;
    }


    public Cuenta(PersonasCuenta persona, int saldo) {
        this.saldodisponible = saldo;
        Random random= new Random();
        this.numerocuenta = persona.getNumDNI() + random.nextInt();

    }

    public int getNumerocuenta() {
        return numerocuenta;
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
    public void nomina(PersonasCuenta persona){
        saldodisponible+=1000;
        System.out.println("saldo disponible actual: " + saldodisponible);

    }
}
