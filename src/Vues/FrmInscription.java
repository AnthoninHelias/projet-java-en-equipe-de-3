package Vues;

import Controlers.CtrlUser;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class FrmInscription extends JFrame {

    private JPanel pnlRoot;
    private JLabel lblNom;
    private JTextField txtNom;
    private JLabel lblPrenom;
    private JTextField txtPrenom;
    private JLabel lblSexe;
    private JComboBox cboSexe;
    private JLabel lblDate;
    private JTextField txtDate;
    private JTextField txtEmail;
    private JLabel lblEmail;
    private JLabel lblMotDePasse;
    private JPasswordField pwdMdp;
    private JLabel lblNum;
    private JTextField txtNum;
    private JLabel lblVille;
    private JTextField txtVille;
    private JLabel lblAdresse;
    private JTextField txtAdresse;
    private JLabel lblTitle;
    private JLabel lblCodePostal;
    private JTextField txtCodePostal;
    private JButton btnValider;
    private JButton btnRetour;
    private JTextField txtMdp;

    private CtrlUser ctrlUser;

    public FrmInscription() {
        this.setTitle("Inscription");
        this.setContentPane(pnlRoot);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ctrlUser = new CtrlUser();
        btnRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAcceuil frm = null;
                try {
                    frm = new FrmAcceuil();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                frm.setVisible(true);
                dispose();
            }
        });
        btnValider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (txtNom.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ nom est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                } else if (txtPrenom.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ prénom est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtMdp.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ mot de passe est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtAdresse.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ adresse est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtCodePostal.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ code postal est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtVille.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ ville est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtNum.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ numéro de téléphone est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else if (txtDate.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Le champ date de naissance est vide", "Attention !", JOptionPane.WARNING_MESSAGE);
                }else {
                    ctrlUser.AjoutUser(txtNom.getText(),txtPrenom.getText(),txtEmail.getText(),txtMdp.getText(),cboSexe.getSelectedItem().toString(),txtDate.getText(),txtAdresse.getText(),txtCodePostal.getText(),txtVille.getText(),txtNum.getText());
                    JOptionPane.showMessageDialog(null, "Votre compte a bien été créer", "Super !", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
