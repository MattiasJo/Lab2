/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.lab2.*;

/**
 *
 * @author Shif
 */
public class RecipeView extends javax.swing.JFrame {

    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private List<Ingredient> ingredientList;

    /**
     * Creates new form RecipeView
     */
    public RecipeView(Recipe recipe) {
        initComponents();
        recipeNameLabel.setText(recipe.getName());
        ingredientList = recipe.getIngredients();
        String ingredientString="";
        timeLabel.setText(Integer.toString(recipe.getTime()) + " min\n\n");
        for (Ingredient ing : ingredientList) {
            ingredientString += ing.getName() + "\t" + ing.getAmount() + " " + ing.getUnit() + "\n";
        }
        ingredientsTextArea.setText(ingredientString);
        difficultyLabel.setText(recipe.getDifficulty());
        priceLabel.setText(Integer.toString(recipe.getPrice()) + " kr");
        howToTextArea.setText(recipe.getDescription());
        nbrOfServings.setText(Integer.toString(recipe.getServings()));
        howToPanel.setLayout(new BorderLayout());
        //JLabel iconLabel = new JLabel("", recipe.getImage(), JLabel.CENTER);
        recipeImageLabel.setIcon(recipe.getImage(recipeImageLabel.getHeight(), recipeImageLabel.getWidth()));
        //howToPanel.add(iconLabel, BorderLayout.CENTER);
        setTitle("RecipeSearch - " + recipe.getName());
    }
    
    public RecipeView() {
        initComponents();
    }
    
    public void addObserver(PropertyChangeListener observer) { 
        this.pcs.addPropertyChangeListener(observer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backward = new javax.swing.JButton();
        recipePanel = new javax.swing.JSplitPane();
        ingredientsPanel = new javax.swing.JScrollPane();
        ingredientsTextArea = new javax.swing.JTextArea();
        howToPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        howToTextArea = new javax.swing.JTextArea();
        recipeImageLabel = new javax.swing.JLabel();
        recipeNameLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nbrOfServings = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(754, 500));
        setMinimumSize(new java.awt.Dimension(754, 500));
        setPreferredSize(new java.awt.Dimension(754, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        backward.setText("<");
        backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backward, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backward)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ingredientsPanel.setMaximumSize(new java.awt.Dimension(164, 84));
        ingredientsPanel.setMinimumSize(new java.awt.Dimension(164, 84));
        ingredientsPanel.setPreferredSize(new java.awt.Dimension(164, 84));
        ingredientsPanel.setWheelScrollingEnabled(false);

        ingredientsTextArea.setBackground(new java.awt.Color(204, 204, 204));
        ingredientsTextArea.setColumns(12);
        ingredientsTextArea.setRows(5);
        ingredientsTextArea.setFocusable(false);
        ingredientsTextArea.setMaximumSize(new java.awt.Dimension(164, 84));
        ingredientsPanel.setViewportView(ingredientsTextArea);

        recipePanel.setLeftComponent(ingredientsPanel);

        howToPanel.setMaximumSize(new java.awt.Dimension(537, 407));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(164, 94));

        howToTextArea.setBackground(new java.awt.Color(204, 204, 204));
        howToTextArea.setColumns(20);
        howToTextArea.setLineWrap(true);
        howToTextArea.setRows(5);
        howToTextArea.setFocusable(false);
        howToTextArea.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setViewportView(howToTextArea);

        recipeImageLabel.setBackground(new java.awt.Color(204, 204, 204));

        recipeNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        recipeNameLabel.setText("<receptnamn>");

        timeLabel.setText("<time>");

        jLabel2.setText("Antal portioner:");

        nbrOfServings.setText("<nbrOfServings>");

        priceLabel.setText("<price>");

        difficultyLabel.setText("<difficulty>");

        jLabel3.setText("Svårighetsgrad:");

        jLabel4.setText("Pris:");

        jLabel5.setText("Tid:");

        javax.swing.GroupLayout howToPanelLayout = new javax.swing.GroupLayout(howToPanel);
        howToPanel.setLayout(howToPanelLayout);
        howToPanelLayout.setHorizontalGroup(
            howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(howToPanelLayout.createSequentialGroup()
                        .addComponent(recipeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recipeNameLabel)
                            .addGroup(howToPanelLayout.createSequentialGroup()
                                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(difficultyLabel)
                                    .addComponent(nbrOfServings))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        howToPanelLayout.setVerticalGroup(
            howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToPanelLayout.createSequentialGroup()
                .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(howToPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(recipeNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nbrOfServings, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(howToPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeLabel)
                            .addComponent(jLabel5)
                            .addComponent(difficultyLabel)
                            .addComponent(jLabel3)))
                    .addGroup(howToPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(recipeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );

        recipePanel.setRightComponent(howToPanel);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(recipePanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipePanel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardActionPerformed
        pcs.firePropertyChange("back", true, false);
    }//GEN-LAST:event_backwardActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backward;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JPanel howToPanel;
    private javax.swing.JTextArea howToTextArea;
    private javax.swing.JScrollPane ingredientsPanel;
    private javax.swing.JTextArea ingredientsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nbrOfServings;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel recipeImageLabel;
    private javax.swing.JLabel recipeNameLabel;
    private javax.swing.JSplitPane recipePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
