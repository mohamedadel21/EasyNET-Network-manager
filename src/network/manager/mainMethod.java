
package network.manager;

import javax.swing.JFrame;
import javax.swing.UIManager;
/**
 *
 * @author Muhamed
 */
public class mainMethod {
    public static void main(String[] args) {
        try {
         //  UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
          UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel" );
             
                    master i=new master();
                    i.setVisible(true);
                    i.setDefaultCloseOperation(1);
                    i.setLocationRelativeTo(null);
                    i.setResizable(false);
                    i.setTitle("EasyNET Network/ADSL Manager");
                    
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
