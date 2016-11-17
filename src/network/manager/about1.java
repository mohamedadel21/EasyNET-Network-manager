
package network.manager;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mohamed Adel
 */

public class about1 extends JFrame{
   
    JPanel pn;
    JLabel icon;
    Icon ab=new ImageIcon(getClass().getResource("bb2.png"));
    JButton close=new JButton("Close");
    
    public about1(){
    set();
    }

    private void set() {
        
        this.setVisible(true);
        this.setDefaultCloseOperation(1);
        this.setResizable(false);
        this.setSize(704,435);
        this.setLocationRelativeTo(null);
        this.setTitle("Program Informations");
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));

        pn=new JPanel();
        this.add(pn);
        icon=new JLabel();
        icon.setBounds(0, 0, this.getWidth(),this.getHeight());
        icon.setIcon(ab);
        pn.add(icon);
        icon.add(close);
        close.setBounds(this.getWidth()/2-50, 365, 100, 25);
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }
}
