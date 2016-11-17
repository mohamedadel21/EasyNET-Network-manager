package network.manager;

import static adsl.manager.main.t;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static network.manager.main.t;
/**
 *
 * @author Muhamed
 */
public class master extends javax.swing.JFrame {
    ImageIcon i1=new ImageIcon(getClass().getResource("99_003.png"));
    ImageIcon i2=new ImageIcon(getClass().getResource("78.png"));
    ImageIcon i5=new ImageIcon(getClass().getResource("57_002.png"));
    public master() {
       initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
       menu();
       icon();
    }

    public void icon(){
    ImageIcon a=new ImageIcon(getClass().getResource("12 - Copy.png"));
    jButton1.setRolloverIcon(a);
    ImageIcon ab=new ImageIcon(getClass().getResource("45_003 - Copy.png"));
    jButton2.setRolloverIcon(ab);
    } 
    public void menu(){
    JButton New =new JButton("New");
    JButton exit =new JButton("Exit");
    JButton know =new JButton("Open");
    ImageIcon ii1=new ImageIcon(getClass().getResource("99_003 - Copy.png"));
    ImageIcon ii2=new ImageIcon(getClass().getResource("78 - Copy.png"));
    ImageIcon ii5=new ImageIcon(getClass().getResource("57_002 - Copy.png"));
    New.setIcon(i1);
    exit.setIcon(i2);
    know.setIcon(i5);
    New.setRolloverIcon(ii1);
    exit.setRolloverIcon(ii2);
    know.setRolloverIcon(ii5);
    
    jMenu1.add(New);
    jMenu1.add(exit);
    jMenu2.add(know);
    New.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    master m=new master();
        m.setVisible(true);
        m.setDefaultCloseOperation(1);
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        
    }
} );
    exit.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
       
    }
} );
know.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        about1 m=new about1();
    }
} );
    }
    private static Connection conn=null;
        private static PreparedStatement stat=null;
        private static String url;
        private static String password ;
        private static String username;
        ResultSet result;
  
         public static void t(String msg){
        JOptionPane jo=new JOptionPane();
        jo.showMessageDialog(null,msg,"EasyNET Network",1);
        }
        public  void check(){
    
         username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
        select t=new select();
        t.setDefaultCloseOperation(1);

        t.setTitle("Check");
        Calendar cal4=Calendar.getInstance();
        String  dat =(cal4.get(Calendar.DATE))+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+cal4.get(Calendar.YEAR);
           ResultSetMetaData rs=result.getMetaData();
        for (int i = 1; i <= 14; i++) {
        t.model.addColumn(rs.getColumnName(i));
            }
       
       while (result.next()){
           
          if(result.getString("end").equals(dat))
            
           
           
           t.model.addRow(new Object[]{result.getString("name"),
                                 result.getString("phone"),
                                 result.getString("user_name"),
                                 result.getString("password"),
                                 result.getString("address"),
                                 result.getString("amount"),
                                 result.getString("speed"),
                                 result.getString("mac"),
                                 result.getString("website"),
                                 result.getString("limitation"),
                                 result.getString("begin"),
                                 result.getString("end"),
                                 result.getInt("price"),
                                 result.getString("notes")

     });
              
      }
       
       } catch (SQLException e) {
          t(e.getMessage());
       } catch (ClassNotFoundException n) {
          t(n.getMessage());
        }
        catch(NumberFormatException f){
            t(f.getMessage());
        }
       catch(NullPointerException l){
           t(l.getMessage());
       }
       finally{
        try {
            conn.close();
           stat.close();
        } catch (SQLException e) {
             System.err.println(e.getMessage());
        } }
         

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jPanel1 = new back();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar6.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("jMenu13");

        jMenu14.setText("File");
        jMenuBar7.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar7.add(jMenu15);

        jMenu16.setText("File");
        jMenuBar8.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar8.add(jMenu17);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jButton1.setForeground(new java.awt.Color(0, 102, 89));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/12.png"))); // NOI18N
        jButton1.setText("Network Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 102, 98));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/45_003.png"))); // NOI18N
        jButton2.setText("ADSL Manager");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 126, 118));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/8.png"))); // NOI18N
        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton7)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        network.manager.main  m=new network.manager.main();
        m.setVisible(true);
    m.setDefaultCloseOperation(1);
    m.setResizable(false);
    m.setLocationRelativeTo(null);
    m.setTitle("EasyNET Network Manager");
    check();
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void check2(){
    
         username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
        adsl.manager.select t=new adsl.manager.select();
        t.setDefaultCloseOperation(1);
        t.setTitle("Check");
        Calendar cal4=Calendar.getInstance();
        String  dat =(cal4.get(Calendar.DATE))+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+cal4.get(Calendar.YEAR);
           ResultSetMetaData rs=result.getMetaData();
        for (int i = 1; i <= 14; i++) {
        t.model.addColumn(rs.getColumnName(i));
            }
       
       while (result.next()){
           
          if(result.getString("end").equals(dat))
            
           
           
           t.model.addRow(new Object[]{result.getString("name"),
                                 result.getString("phone"),
                                 result.getString("user_name"),
                                 result.getString("password"),
                                 result.getString("address"),
                                 result.getString("offer_type"),
                                 result.getString("amount"),
                                 result.getString("speed"),
                                 result.getString("company_name"),
                                 result.getString("limitation"),
                                 result.getString("begin"),
                                 result.getString("end"),
                                 result.getInt("price"),
                                 result.getString("notes")

     });
              
      }
       
       } catch (SQLException e) {
          t(e.getMessage());
       } catch (ClassNotFoundException n) {
          t(n.getMessage());
        }
        catch(NumberFormatException f){
            t(f.getMessage());
        }
       catch(NullPointerException l){
           t(l.getMessage());
       }
       finally{
        try {
            conn.close();
           stat.close();
        } catch (SQLException e) {
             System.err.println(e.getMessage());
        } }
         
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    adsl.manager.main f=new adsl.manager.main();
    f.setVisible(true);
    f.setDefaultCloseOperation(1);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setTitle("EasyNET ADSL Manager");
    check2();
    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
