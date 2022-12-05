
package Vues;

import Controlers.CtrlUser;
import Entities.Users;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public class FrmGraphiqueEleve extends JFrame{
    private JPanel pnlGraph;
    private CtrlUser ctrlUser;
    private JButton btnRetour;
    public FrmGraphiqueEleve(Users unUser){
        this.setTitle("Eleve Stats");
        this.setContentPane(pnlGraph);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ctrlUser = new CtrlUser();

        DefaultPieDataset donnees = new DefaultPieDataset();

        //for (Map.Entry valeur : ctrlUser.GetLeconsFaites().entrySet())
        //{
            //donnees.setValue(valeur.getKey().toString(), Integer.parseInt(valeur.getValue().toString()));
        //}

        JFreeChart chart1 = ChartFactory.createPieChart(
                "Nombre de lecon faite et a faire",
                donnees,
                true, // légende
                true, // info bulle
                true // url
        );
        ChartFrame frame = new ChartFrame("Graphique n°2", chart1);
        frame.pack();
        frame.setVisible(true);
        btnRetour.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmConsultationChiffre frm = new FrmConsultationChiffre(unUser);
                frm.setVisible(true);
                dispose();
            }
        });
    }
}
