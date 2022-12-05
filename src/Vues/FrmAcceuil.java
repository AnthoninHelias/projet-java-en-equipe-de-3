package Vues;

import Tools.ConnexionBDD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FrmAcceuil extends JFrame{
    private JPanel pnlRoot;
    private JButton btnConnexion;
    private JButton btnInscription;
    private JLabel lblImage;

    public FrmAcceuil() throws SQLException, ClassNotFoundException {

        this.setTitle("Acceuil");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ConnexionBDD cnx = new ConnexionBDD();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Images/voiture.png")).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT));

        lblImage.setIcon(imageIcon);
        btnConnexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        btnInscription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmInscription frm = new FrmInscription();
                frm.setVisible(true);
                dispose();
            }
        });

    }
}
