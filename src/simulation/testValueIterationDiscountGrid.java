package simulation;

import javax.swing.SwingUtilities;

import vueGridworld.VueGridworldValue;
import agent.planningagent.ValueIterationAgent;
import environnement.gridworld.GridworldEnvironnement;
import environnement.gridworld.GridworldMDP;

public class testValueIterationDiscountGrid {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try
        {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }
        catch(ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException e)
        {
            java.util.logging.Logger.getLogger(testValueIterationDiscountGrid.class.getName()).log(java.util.logging.Level.SEVERE, e.getMessage(), e);
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                GridworldMDP gmdp = GridworldMDP.getDiscountGrid();
                GridworldEnvironnement g = new GridworldEnvironnement(gmdp);

                ValueIterationAgent a = new ValueIterationAgent(gmdp);
                VueGridworldValue vue = new VueGridworldValue(g, a);

                vue.setVisible(true);
            }
        });

    }
}
