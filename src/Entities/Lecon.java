package Entities;

import java.sql.Date;

public class Lecon {


    private int codeLecon;
    private Date date;
    private String heure;

    private String immatriculation;
    private boolean reglee;

    public Lecon( int codeLecon, Date date, String heure,  String immatriculation, boolean reglee) {

        this.codeLecon = codeLecon;
        this.date = date;
        this.heure = heure;

        this.immatriculation = immatriculation;
        this.reglee = reglee;
    }


    public int getCodeLecon() {
        return codeLecon;
    }

    public void setCodeLecon(int codeLecon) {
        this.codeLecon = codeLecon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public boolean isReglee() {
        return reglee;
    }

    public void setReglee(boolean reglee) {
        this.reglee = reglee;
    }
}
