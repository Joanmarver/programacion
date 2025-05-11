package accesoBDD.basepilotos;

import java.util.Date;

public class Piloto {
    private String forename;
    private String surname;
    private java.sql.Date dob;
    private String ingnationality;
    private String URL;

    public Piloto(String forename, String surname, java.sql.Date dob, String ingnationality, String URL) {


        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.ingnationality = ingnationality;
        this.URL = URL;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(java.sql.Date dob) {
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
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", ingnationality='" + ingnationality + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
