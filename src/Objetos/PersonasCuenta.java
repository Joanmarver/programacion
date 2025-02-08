package Objetos;

import java.util.Arrays;
import java.util.Locale;

public class PersonasCuenta {
    private  String  letraDNI;
    private int numDNI;
    Cuenta[] cuentascorrientes = new Cuenta[3];

    public PersonasCuenta(int numDNI, String letraDNI) {
        this.numDNI = numDNI;
        this.letraDNI = letraDNI.toUpperCase();
    }

    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }



    public String getletraDNI() {
        return letraDNI;
    }

    public Cuenta[] getCuentascorrientes() {
        return cuentascorrientes;
    }

    public void setDNI(String DNI) {
        this.letraDNI = DNI;
    }

    public void setCuentascorrientes(Cuenta[] cuentascorrientes) {
        this.cuentascorrientes = cuentascorrientes;

    }

    public boolean limiteCuentas() {
        int cuentasOcupadas = 0;
        boolean cuentaalcanzada;

        // Contar cuántas cuentas están ocupadas (no son null)
        for (Cuenta cuenta : cuentascorrientes) {
            if (cuenta != null) {
                cuentasOcupadas++;
            }
        }

        if (cuentasOcupadas >= cuentascorrientes.length) {
            System.out.println(" Error: Límite de cuentas alcanzado.");
            cuentaalcanzada=false;
        }
        System.out.println("numero de cuentas: "+cuentasOcupadas);
        cuentaalcanzada =true;
        return cuentaalcanzada;
    }

    public void añadircuenta(Cuenta[] cuentascorrientes, PersonasCuenta persona){
        boolean cambiocuenta = limiteCuentas();
        boolean cuentaagregada= false;
        if (cambiocuenta){
            Cuenta cuenta = new Cuenta(persona);
            for (int i =0; i<cuentascorrientes.length && !cuentaagregada;i++){
                if (cuentascorrientes[i]==null){
                  cuentascorrientes[i]=cuenta;
                  cuentaagregada=true;
                }
            }
        }
    }
    public boolean moroso(Cuenta[] cuentascorrientes , PersonasCuenta persona){
        boolean moroso= false;
        for (Cuenta cuenta: cuentascorrientes){
            if (cuenta!=null){
                if(cuenta.getSaldodisponible()<0){
                    moroso= true;
                }
            }
        }
        return moroso;
    }
    public void Mostrardatos (PersonasCuenta persona){
        System.out.println("datos de la persona:");
        System.out.println("DNI : "+ numDNI+letraDNI);

        for (Cuenta cuenta: cuentascorrientes){
            if (cuenta!=null){
                System.out.println("numero de cuenta: " + cuenta.getNumerocuenta());
                System.out.println("saldo disponible: " + cuenta.getSaldodisponible());
            }
        }
    }


}
