package Controlers;

import Entities.Users;
import Entities.Vehicule;
import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CtrlVehicule {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    public CtrlVehicule() {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Vehicule> GetAllVehicule(){
        ArrayList<Vehicule> lesVehicules = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("SELECT Immatriculation,Marque,Modele,Annee,vehicule.CodeCategorie\n" +
                    "FROM vehicule");
            rs = ps.executeQuery();
            while ((rs.next())){
                Vehicule vehicule = new Vehicule(rs.getString("CodeCategorie"),rs.getString("Annee"),rs.getString("Immatriculation"),rs.getString("Marque"),rs.getString("Modele"));
                lesVehicules.add(vehicule);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lesVehicules;
    }
}
