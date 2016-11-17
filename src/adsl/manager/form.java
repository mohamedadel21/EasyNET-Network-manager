

package adsl.manager;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MOHAMMED
 */
public  class form extends JFrame{

    JFrame f=new JFrame();
    JPanel pn=new JPanel();
    JButton no= new JButton("No");
    JButton yes= new JButton("yes");
    JLabel lb=new JLabel();
    public form() {
       f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));

      f.setVisible(true);
      f.setResizable(false);
      f.setDefaultCloseOperation(1);
      f.setTitle("EasyNET ADSL Manager");
      f.setLocationRelativeTo(null);
      f.setSize(400,180);
      f.getContentPane().add(pn);
      pn.setLayout(null);
      pn.setBackground(Color.WHITE);
      pn.add(lb);
      pn.add(no);
      pn.add(yes);
            lb.setBounds(130, 30, 200, 30);

      yes.setBounds(80, 80, 100, 40);
      no.setBounds(220, 80, 100, 40);
      
        
    }
    
  
}
