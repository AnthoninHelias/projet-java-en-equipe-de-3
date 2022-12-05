package Vues;

import Entities.Users;
import Entities.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FrmMoniteur extends JFrame {
    private JPanel pnlRoot;
    private JButton btnChiffre;
    private JButton btnModifierUser;
    private JButton btnPlanning;
    private JButton btnLicence;
    private JButton btnDeconnexion;

    public FrmMoniteur(Users unUser) {
        this.setTitle("Moniteur Acceuil");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);





        btnLicence.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAjoutLicence frm = new FrmAjoutLicence(unUser);
                frm.setVisible(true);
                dispose();

            }
        });
        btnChiffre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmConsultationChiffre frm = new FrmConsultationChiffre(unUser);
                frm.setVisible(true);
                dispose();

            }
        });
        btnPlanning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmPlanning frm = new FrmPlanning(unUser);
                frm.setVisible(true);
                dispose();

            }
        });
        btnModifierUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                FrmUsersUpdate frm = new FrmUsersUpdate(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
        btnDeconnexion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmConnexion frm = null;
                try {
                    frm = new FrmConnexion();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                frm.setVisible(true);
                dispose();
            }
        });
    }
}
