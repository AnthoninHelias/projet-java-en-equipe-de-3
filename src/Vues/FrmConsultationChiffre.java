package Vues;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlers.CtrlUser;
import Entities.*;

public class FrmConsultationChiffre extends JFrame{
    private JButton btnRetour;
    private JPanel pnlRoot;

    private JLabel lblLecons;
    private JTextField txtLecons;


    private JLabel lblTitle;
    private JComboBox cboTypePermis;
    private JTextField txtPrix;

    private JLabel lblPrix;
    private JButton btnGraphique;
    private CtrlUser ctrlUser;

    public FrmConsultationChiffre(Users unUser) {
        this.setTitle("Moniteur stats");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ctrlUser = new CtrlUser();
        for(Licence licence: ctrlUser.GetLicencePossede(unUser.getCodeUser())){
            cboTypePermis.addItem(licence.getLibelle());
        }
        btnRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmMoniteur frm = new FrmMoniteur(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
        cboTypePermis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrlUser.GetCodeByLibelle(String.valueOf(cboTypePermis.getSelectedItem()));
                int TotalLecon = ctrlUser.GetLeconsNonFaites(unUser.getCodeUser(),ctrlUser.GetCodeByLibelle(String.valueOf(cboTypePermis.getSelectedItem()))) + ctrlUser.GetLeconsFaites(unUser.getCodeUser(),ctrlUser.GetCodeByLibelle(String.valueOf(cboTypePermis.getSelectedItem())));

                txtLecons.setText(String.valueOf(TotalLecon));


                double prixpaye = ctrlUser.GetPrixLibelle(cboTypePermis.getSelectedItem().toString()) * Integer.valueOf(txtLecons.getText());
                double d = (double) Math.round(prixpaye * 100) / 100;
                txtPrix.setText(String.valueOf(d));

            }
        });
        btnGraphique.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmGraphiqueMoniteur frm = new FrmGraphiqueMoniteur(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
    }
}
