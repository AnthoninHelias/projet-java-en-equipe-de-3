package Vues;

import Controlers.CtrlUser;
import Entities.Categorie;
import Entities.Users;
import Entities.Vehicule;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class FrmEleveCours extends JFrame{
    private JTextField txtPrix;
    private JComboBox cboChoixCategories;
    private JPanel pnlDate;
    private JLabel lblPrix;
    private JLabel lblChoixCategories;
    private JLabel lblDate;
    private JComboBox cboChoixMoniteur;
    private JLabel lblChoixMoniteur;
    private JButton btnValider;
    private JButton btnRetour;
    private JDateChooser cldDate;
    private JButton btnDeconnexion;
    private JLabel lblTitle;
    private JPanel pnlRoot;

    private JLabel lblHeure;
    private JComboBox cboPermis;
    private JComboBox cboHeure;
    private JButton btnChoix;
    private CtrlUser ctrlUser;

    public FrmEleveCours(Users unUser) {
        this.setTitle("Eleve Cours");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ctrlUser = new CtrlUser();
        //JCalendar Date
        cldDate = new JDateChooser();
        cldDate.setDateFormatString("dd/MM/yyyy");
        pnlDate.add(cldDate);

        //Définir les propriétés des JSpinner



        for(Categorie categorie: ctrlUser.GetLicenceNonPossede(unUser.getCodeUser())){
            cboPermis.addItem(categorie.getLibelle());
        }


        btnRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmEleve frm = new FrmEleve(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
        cboPermis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrix.setText(String.valueOf(ctrlUser.GetPrixLibelle(cboPermis.getSelectedItem().toString())));
            }
        });
        btnChoix.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cboChoixCategories.removeAllItems();
                cboChoixMoniteur.removeAllItems();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateLecon = sdf.format(cldDate.getDate());
                for(Users moniteur: ctrlUser.GetMoniteurDisponible(String.valueOf(ctrlUser.GetCodeByLibelle(String.valueOf(cboPermis.getSelectedItem()))),dateLecon,cboHeure.getSelectedItem().toString())){
                    cboChoixMoniteur.addItem(moniteur.getPrenom());
                }
                for(Vehicule vehicule: ctrlUser.GetVehiculeDisponible(String.valueOf(ctrlUser.GetCodeByLibelle(String.valueOf(cboPermis.getSelectedItem()))),dateLecon,cboHeure.getSelectedItem().toString())){
                    cboChoixCategories.addItem(vehicule.getModel());
                }
              


            }
        });
        btnValider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateLecon = sdf.format(cldDate.getDate());
                ctrlUser.AjoutLecon(ctrlUser.GetImmatriculationByModele(cboChoixCategories.getSelectedItem().toString()),dateLecon,cboHeure.getSelectedItem().toString());

                ctrlUser.AjoutParticipe(unUser.getCodeUser(), ctrlUser.GetDerniereLecon() );
                ctrlUser.AjoutParticipe(ctrlUser.GetCodeByPrenom(cboChoixMoniteur.getSelectedItem().toString()),ctrlUser.GetDerniereLecon());
                JOptionPane.showMessageDialog(null, "Votre lecon a bien été prise", "Votre choix", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
