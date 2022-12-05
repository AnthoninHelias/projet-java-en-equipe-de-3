package Entities;

public class Vehicule {
    private String CodeCategorie;
    private String Annee;
    private String Imatriculation;
    private String Marque;
    private String Model;

    public Vehicule(String CodeCategorie, String Annee,String Immatriculation,String Marque,String Model) {
        this.setCodeCategorie(CodeCategorie);
        this.Annee = Annee;
        this.Imatriculation = Imatriculation;
        this.Marque = Marque;
        this.Model = Model;

    }



    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String annee) {
        Annee = annee;
    }

    public String getImatriculation() {
        return Imatriculation;
    }

    public void setImatriculation(String imatriculation) {
        Imatriculation = imatriculation;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCodeCategorie() {
        return CodeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        CodeCategorie = codeCategorie;
    }
}
