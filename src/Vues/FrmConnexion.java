package Vues;

import Controlers.CtrlUser;
import Entities.Users;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class FrmConnexion extends JFrame{
    private JPanel pnlRoot;
    private JButton btnConnexion;
    private JButton btnRetour;
    private JTextField txtIdentifiant;
    private JPasswordField pwdMotDePasse;
    private JLabel lblIdentifiant;
    private JLabel lblMotDePasse;
    private CtrlUser ctrlUser;
    public FrmConnexion() throws SQLException, ClassNotFoundException  {
        this.setTitle("Connexion");
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

        btnConnexion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (txtIdentifiant.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Veuillez rentrez un Identifier", "Votre choix", JOptionPane.WARNING_MESSAGE);
                } else if (pwdMotDePasse.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, "Veuillez selectionner un mot de passe", "Votre choix", JOptionPane.WARNING_MESSAGE);
                } else{
                    Users unUser = ctrlUser.GetUnUser(txtIdentifiant.getText(), pwdMotDePasse.getText());
                    if(unUser==null){
                        JOptionPane.showMessageDialog(null, "Indentifient Incorrect", "Votre choix", JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(unUser.getStatut().compareTo("eleve")==0){
                            FrmEleve frm = new FrmEleve(unUser);
                            frm.setVisible(true);
                            dispose();
                        }else if(unUser.getStatut().compareTo("moniteur")==0){
                            FrmMoniteur frm = new FrmMoniteur(unUser);
                            frm.setVisible(true);
                            dispose();
                        }

                    }

                }





            }
        });
    }
}
