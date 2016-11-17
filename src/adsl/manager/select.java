package adsl.manager;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOHAMMED
 */

public class select extends JFrame{
    JFrame f;
    JPanel pn;
    JTable table2=new JTable();
    JButton ok=new JButton("Close");
    public DefaultTableModel model=(DefaultTableModel)table2.getModel();
    public select() {
        f=new JFrame();
        pn=new JPanel();
        f.setVisible(true);
        f.setResizable(true);
        f.setLocation(0,0);
        f.setTitle("EasyNET ADSL Manager");
        f.setDefaultCloseOperation(1);
        f.setSize(1500,750);
        f.add(pn);
        pn.setLayout(null);
        pn.setBackground(new Color(200, 244, 244));
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
        table2.setRowHeight(25);
        JScrollPane sp=new JScrollPane(table2);
        pn.add(sp);
        sp.setBounds(0, 0, f.getWidth()-30,f.getHeight()-100);
        pn.add(ok);
        ok.setBounds(f.getWidth()/2-60,f.getHeight()-90, 100, 35);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           f.setVisible(false);
            }
        });
    }
   
}
