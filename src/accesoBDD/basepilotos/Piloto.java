package accesoBDD.basepilotos;

import java.time.LocalDate;
import java.util.Date;

public class Piloto {
    private String forename;
    private String surname;
    private LocalDate dob;
    private String ingnationality;
    private String URL;
    private int driverid;
    private String code;


    public Piloto(String forename, String surname, LocalDate dob, String ingnationality, String URL, String code) {
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.ingnationality = ingnationality;
        this.URL = URL;
        this.code = code;
    }

    public Piloto(String forename, String surname, LocalDate dob, String ingnationality, String URL, int driverid, String code) {
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.ingnationality = ingnationality;
        this.URL = URL;
        this.driverid = driverid;
        this.code = code;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public int getDriverid() {
        return driverid;
    }

    public String getCode() {
        return code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getIngnationality() {
        return ingnationality;
    }

    public void setIngnationality(String ingnationality) {
        this.ingnationality = ingnationality;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                ", driver id ='"+ driverid + '\''+
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", ingnationality='" + ingnationality + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
