package Objetos;

import java.util.Locale;

public class PersonasCuenta {
    private  String  letraDNI;
    private int numDNI;
    Cuenta[] cuentascorrientes = new Cuenta[3];

    public PersonasCuenta(int numDNI, String letraDNI) {
        this.numDNI = numDNI;
        this.letraDNI = letraDNI.toUpperCase(Locale.ROOT);
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
    public boolean limitecuentas(Cuenta[] cuentascorrientes){
        boolean cambiocuenta=false;
        if (cuentascorrientes.length>=3){
            System.out.println("error , limite de cuentas alcanzado");
        }else {
            cambiocuenta=true;
        }
        return cambiocuenta;

    }
    public void añadircuenta(Cuenta[] cuentascorrientes, PersonasCuenta persona){
        boolean cambiocuenta = limitecuentas(cuentascorrientes);
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

}
