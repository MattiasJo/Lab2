/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recipesearch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class RecipeSearch implements PropertyChangeListener {

    private RecipeView rv = new RecipeView();
    private RecipeSearchView rsv = new RecipeSearchView();
    
    public RecipeSearch() {
        rv.addObserver(this);
        rsv.addObserver(this);
        rsv.setVisible(true);

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting RecipeSearch");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new RecipeSearch();
                
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                //This code will run before shutdown
                System.out.println("Closing RecipeSearch");
            }
        }));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("recipe")){
            rsv.setVisible(false);
            rv.setVisible(true);
        }
        else if(evt.getPropertyName().equals("back")) {
            rv.setVisible(false);
            rsv.setVisible(true);
        }
    }
}