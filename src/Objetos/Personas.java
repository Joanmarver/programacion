package Objetos;

public class Personas {
    private  String  letraDNI;
    private int numDNI;
    Cuenta[] cuentascorrientes = new Cuenta[2];

    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }



    public String getDNI() {
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
        if (cuentascorrientes.length>3){
            System.out.println("error , limite de cuentas alcanzado");
        }else {
            cambiocuenta=true;
        }
        return cambiocuenta;

    }
    public void añadircuenta(Cuenta[] cuentascorrientes, Personas persona){
        boolean cambiocuenta = limitecuentas(cuentascorrientes);
        if (cambiocuenta){
            Cuenta cuenta = new Cuenta(persona);
            for (int i =0; i<cuentascorrientes.length;i++){
                if (cuentascorrientes[i]==null){
                  cuentascorrientes[i]=cuenta;
                  i+=cuentascorrientes.length+1;
                }
            }
        }
    }
    public boolean moroso(Cuenta[] cuentascorrientes , Personas persona){
        boolean moroso= false;
        for (Cuenta cuenta: cuentascorrientes){
            if(cuenta.getSaldodisponible()<0){
                moroso= true;
            }
        }
        return moroso;
    }

}
