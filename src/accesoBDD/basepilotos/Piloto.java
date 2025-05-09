package accesoBDD.basepilotos;

import java.util.Date;

public class Piloto {
    private int driverid;
    private String code;
    private String forename;
    private String surname;
    private Date dob;
    private String ingnationality;
    private String URL;

    public Piloto(int driverid, String code, String forename, String surname, Date dob, String ingnationality, String URL) {
        this.driverid = driverid;
        this.code = code;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.ingnationality = ingnationality;
        this.URL = URL;
    }
}
