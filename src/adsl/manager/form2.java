

package adsl.manager;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MOHAMMED
 */
public class form2 extends JFrame{

    JFrame f=new JFrame();
    JPanel pn=new JPanel();
    JButton no= new JButton("No");
    JButton yes= new JButton("yes");
    JPasswordField txt=new JPasswordField();
    JLabel lb=new JLabel("كلمة السر");
    public form2() {
      f. setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
 
      f.setVisible(true);
      f.setResizable(false);
      f.setDefaultCloseOperation(1);
      f.setTitle("EasyNET ADSL Manager");
      f.setLocationRelativeTo(null);
      f.setSize(450,180);
      f.getContentPane().add(pn);
      pn.setLayout(null);
      pn.setBackground(Color.WHITE);
      pn.add(lb);
      pn.add(no);
      pn.add(yes);
      pn.add(txt);
        lb.setFont(new Font("Oblique", 2, 12));

      txt.setBounds(120, 30, 130, 30);

      lb.setBounds(270, 30, 280, 30);

      yes.setBounds(100, 80, 100, 40);
      no.setBounds(240, 80, 100, 40);
        
    }
       public static void main(String[] args) {
        new form2();      

    }
  
}
