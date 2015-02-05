/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Shif
 */
public class TestClass implements PropertyChangeListener {
    
    private RecipePanelTest rpt;
    
    public TestClass() {
        rpt = new RecipePanelTest();
        rpt.addObserver(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("propertyChange in TestClass");
    }
    
}
