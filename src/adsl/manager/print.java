

package adsl.manager;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhamed
 */
public class print extends JFrame{

    JFrame jf=new JFrame();
    JPanel p=new JPanel();
    JTable txt=new JTable();
    JScrollPane sp=new JScrollPane();
    JButton print=new JButton("Print");
    JButton close=new JButton("Close");
     DefaultTableModel model=(DefaultTableModel)txt.getModel();

    public print() throws HeadlessException {
        build();
    }

    private void build() {
jf.setVisible(true);
jf.setResizable(false);
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(1);
jf.setTitle("Print");
jf.setSize(450,350);
jf.getContentPane().add(p);
p.setLayout(null);
p.add(sp);
p.setBackground(Color.white);
sp.getViewport().add(txt);
sp.setBounds(5,5,435,210);
p.add(close);
p.add(print);
print.setBounds(100,250,100,40);
close.setBounds(220,250,100,40);
txt.setForeground(Color.DARK_GRAY);
txt.setFont(new Font("Oblique", 3, 12));
 txt.setRowHeight(30);
  jf.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));

    close.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
   jf.setVisible(false);
    }
    });
    }
    
   
    
}
