/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.*;
import se.chalmers.ait.dat215.lab2.Recipe;

/**
 *
 * @author Shif
 */
public class RecipePanel extends javax.swing.JPanel {
    
    private final Recipe recipe;
    private final ImageIcon imageIcon;

    /**
     * Creates new form RecipePanelTest
     */
    public RecipePanel(Recipe recipe) {
        this.recipe = recipe;
        imageIcon = recipe.getImage(50,50);
        JLabel iconLabel = new JLabel("", imageIcon, JLabel.CENTER);
        iconLabel.setIcon(imageIcon);
        this.add(iconLabel,BorderLayout.WEST);
        initComponents();
        setLayout(new FlowLayout());
        recipeName.setText(recipe.getName());
        this.validate();
    }
    
    public RecipePanel() {
        recipe = null;
        imageIcon = null;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 0, this.getWidth()-3, this.getHeight()-3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewRecipeButton = new javax.swing.JButton();
        recipeName = new javax.swing.JLabel();

        viewRecipeButton.setText("Se recept");
        viewRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecipeButtonActionPerformed(evt);
            }
        });

        recipeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recipeName.setText("<recipeName>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(recipeName)
                    .addComponent(viewRecipeButton))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(recipeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewRecipeButton)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecipeButtonActionPerformed
        pcs.firePropertyChange(recipe.getName(), false, recipe);
    }//GEN-LAST:event_viewRecipeButtonActionPerformed

    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, 0, 0);
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel recipeName;
    private javax.swing.JButton viewRecipeButton;
    // End of variables declaration//GEN-END:variables

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    public void addObserver(PropertyChangeListener observer) { 
        this.pcs.addPropertyChangeListener(observer);
    }
    
}
