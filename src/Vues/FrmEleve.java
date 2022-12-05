package Vues;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import Entities.*;
public class FrmEleve extends JFrame {
    private JPanel pnlRoot;
    private JButton btnLecon;
    private JButton btnCour;
    private JButton btnModifierUser;
    private JButton btnPlanning;

    private JButton btnDeconnexion;


    public FrmEleve(Users unUser) {
        this.setTitle("Eleve Acceuil");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
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
        btnCour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmEleveCours frm = new FrmEleveCours(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
        btnPlanning.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmPlanning frm = new FrmPlanning(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
        btnLecon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmEleveStats frm = new FrmEleveStats(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
    }
}
