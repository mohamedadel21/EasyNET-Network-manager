
package adsl.manager;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mohamed Adel
 */

public class sumition extends JFrame{
   JPanel pn;
    JLabel icon;
    Icon ab=new ImageIcon(getClass().getResource("sum.jpg"));
    JButton close=new JButton("Close");
    JButton get=new JButton("مجموع الكل");
    JLabel ss=new JLabel();
    JLabel month=new JLabel("رقم الشهر");
    JTextField mon=new JTextField();
    JButton getMonth=new JButton("اجمالى شهر");

    public sumition(){
    set();
    }

    private void set() {
        this.setVisible(true);
        this.setDefaultCloseOperation(1);
        this.setResizable(false);
        this.setSize(450,450);
        this.setLocationRelativeTo(null);
        this.setTitle("Sumition");
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));

        pn=new JPanel();
        this.add(pn);
        icon=new JLabel();
        icon.setBounds(0, 0, this.getWidth(),this.getHeight());
        icon.setIcon(ab);
        pn.add(icon);
        icon.add(get);
        icon.add(close);
        icon.add(mon);
        icon.add(getMonth);
        icon.add(month);
        icon.add(ss);
        ss.setFont(new Font("Oblique", 2, 30));
        ss.setBounds(this.getWidth()/2-50, 130, 200, 35);
                month.setFont(new Font("Oblique", 2, 14));

        month.setBounds(340, 320, 100, 30);
        mon.setBounds(220, 320, 100, 30);
        getMonth.setBounds(100, 320, 100, 30);
        close.setBounds(220, 365, 100, 30);
        get.setBounds(100, 365, 100, 30);
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }
   
}
