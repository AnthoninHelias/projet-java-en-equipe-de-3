package Entities;

public class Users {
    private String codeUser;
    private String nom;
    private String prenom;
    private String sexe;
    private String dateDeNaissance;
    private String adresse1;
    private String codePostal;
    private String ville;
    private String telephone;
    private String email;
    private String motDePasse;
    private String statut;

    public Users(String codeUser,String nom,String prenom,String email,String motDePasse,String statut,String sexe,String dateDeNaissance,String adresse1,String codePostal,String ville,String telephone) {
        this.codeUser= codeUser;
        this.setStatut(statut);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setSexe(sexe);
        this.setDateDeNaissance(dateDeNaissance);
        this.setAdresse1(adresse1);
        this.setCodePostal(codePostal);
        this.setVille(ville);
        this.setTelephone(telephone);
        this.setEmail(email);
        this.setMotDePasse(motDePasse);
    }


    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
