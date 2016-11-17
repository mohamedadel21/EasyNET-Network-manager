
package adsl.manager;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed Adel
 */
public class back extends JPanel{
      ImageIcon img ;
    public void paintComponent(Graphics b){
    img=new ImageIcon(getClass().getResource("back2.jpg"));
        img.paintIcon(this, b, 0, 0);
    }
}
