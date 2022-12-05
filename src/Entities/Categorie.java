package Entities;

public class Categorie {
    private int CodeCategorie;
    private String Libelle;
    private double Prix;

    public Categorie(int CodeCategorie,String Libelle,double Prix){
        this.setCodeCategorie(CodeCategorie);
        this.setLibelle(Libelle);
        this.setPrix(Prix);
    }

    public int getCodeCategorie() {return CodeCategorie;}

    public void setCodeCategorie(int codeCategorie) {CodeCategorie = codeCategorie;}

    public String getLibelle() {return Libelle;}

    public void setLibelle(String libelle) {Libelle = libelle;}

    public double getPrix() {return Prix;}

    public void setPrix(double prix) {Prix = prix;}
}
