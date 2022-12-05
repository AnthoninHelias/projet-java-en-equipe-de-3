package Entities;

public class Licence {
    private String codeLicence;
    private String dateObtention;
    private String CodeUser;
    private String CodeCategorie;
    private String Libelle;

    public Licence(String CodeUser,String Libelle,String CodeCategorie,String codeLicence, String dateObtention) {
        this.setLibelle(Libelle);
        this.setCodeLicence(codeLicence);
        this.setDateObtention(dateObtention);
        this.setCodeUser(CodeUser);
        this.setCodeCategorie(CodeCategorie);
    }


    public String getCodeLicence() {
        return codeLicence;
    }

    public void setCodeLicence(String codeLicence) {
        this.codeLicence = codeLicence;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }

    public String getCodeUser() {
        return CodeUser;
    }

    public void setCodeUser(String codeUser) {
        CodeUser = codeUser;
    }

    public String getCodeCategorie() {
        return CodeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        CodeCategorie = codeCategorie;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }
}
