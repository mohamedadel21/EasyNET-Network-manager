package adsl.manager;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import network.manager.master;
import static network.manager.search.t;
/**
 *
 * @author MOHAMMED
 */
public class main extends javax.swing.JFrame {

    
        private static Connection conn=null;
        private static PreparedStatement stat=null;
        private static String url;
        private static String password ;
        private static String username;
        ResultSet result;
        JButton New =new JButton("New");
        JButton exit =new JButton("Exit");
        JButton sum =new JButton("الاجمالى");
        JButton know =new JButton("Open");
        JButton save2=new JButton("Print A Month");
        JButton save =new JButton("Print All Data");
        JButton search =new JButton("بحث بتاريخ الدفع");
    ImageIcon i1=new ImageIcon(getClass().getResource("99_003.png"));
    ImageIcon i2=new ImageIcon(getClass().getResource("78.png"));
    ImageIcon i3=new ImageIcon(getClass().getResource("44.png"));
    ImageIcon i4=new ImageIcon(getClass().getResource("00.png"));
    ImageIcon i5=new ImageIcon(getClass().getResource("57_002.png"));
    ImageIcon i6=new ImageIcon(getClass().getResource("42_004.png"));

        public static void t(String msg){
        JOptionPane jo=new JOptionPane();
        jo.showMessageDialog(null,msg,"EasyNET ADSL",1);
        }
    public main() {
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
 action();
    }
public void action(){
    sum.setIcon(i3);
    New.setIcon(i1);
    exit.setIcon(i2);
    search.setIcon(i4);
    know.setIcon(i5);
    save.setIcon(i6);
    save2.setIcon(i6);

    ImageIcon ii1=new ImageIcon(getClass().getResource("99_003 - Copy.png"));
    ImageIcon ii2=new ImageIcon(getClass().getResource("78 - Copy.png"));
    ImageIcon ii3=new ImageIcon(getClass().getResource("44 - Copy.png"));
    ImageIcon ii4=new ImageIcon(getClass().getResource("00 - Copy.png"));
    ImageIcon ii5=new ImageIcon(getClass().getResource("57_002 - Copy.png"));
    ImageIcon ii6=new ImageIcon(getClass().getResource("42_004 - Copy.png"));
    
    sum.setRolloverIcon(ii3);
    New.setRolloverIcon(ii1);
    exit.setRolloverIcon(ii2);
    search.setRolloverIcon(ii4);
    know.setRolloverIcon(ii5);
    save.setRolloverIcon(ii6);
    save2.setRolloverIcon(ii6);
    ImageIcon iii1=new ImageIcon(getClass().getResource("00 - Copy.png"));
    ImageIcon iii2=new ImageIcon(getClass().getResource("6 - Copy.png"));
    ImageIcon iii3=new ImageIcon(getClass().getResource("24_003 - Copy.png"));
    ImageIcon iii4=new ImageIcon(getClass().getResource("71 - Copy.png"));
    ImageIcon iii5=new ImageIcon(getClass().getResource("40_004 - Copy.png"));
    ImageIcon iii6=new ImageIcon(getClass().getResource("49_004 - Copy.png"));
    ImageIcon iii8=new ImageIcon(getClass().getResource("65_003 - Copy.png"));
    ImageIcon iii9=new ImageIcon(getClass().getResource("87_002 - Copy.png"));
    ImageIcon iii10=new ImageIcon(getClass().getResource("23_003 - Copy.png"));
    ImageIcon iii11=new ImageIcon(getClass().getResource("52_004 - Copy - Copy.png"));

    jButton1.setRolloverIcon(iii1);
    jButton2.setRolloverIcon(iii2);
    jButton3.setRolloverIcon(iii3);
    jButton4.setRolloverIcon(iii4);
    jButton5.setRolloverIcon(iii5);
    jButton6.setRolloverIcon(iii6);
    jButton8.setRolloverIcon(iii8);
    jButton9.setRolloverIcon(iii9);
    jButton10.setRolloverIcon(iii10);
    jButton11.setRolloverIcon(iii6);
    jButton12.setRolloverIcon(iii11);

jMenu1.add(New);
jMenu1.add(exit);
jMenu3.add(sum);
jMenu3.add(search);

jMenu2.add(know);
jMenu4.add(save);
jMenu4.add(save2);
search.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent ae) {
    final JFrame f=new JFrame();
    JPanel pn=new JPanel();
    JButton no= new JButton("No");
    JButton yes= new JButton("yes");
        final JTextField txt=new JTextField();
    JLabel lb=new JLabel("رقم الشهر");
        
      f.setVisible(true);
      f.setResizable(false);
      f.setDefaultCloseOperation(1);
      f.setTitle("EasyNET ADSL Manager");
      f.setLocationRelativeTo(null);
      f.setSize(450,180);
      f.getContentPane().add(pn);
      f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
      pn.setLayout(null);
      pn.setBackground(Color.WHITE);
      pn.add(lb);
      pn.add(no);
      pn.add(yes);
      pn.add(txt);

      txt.setBounds(140, 30, 110, 30);

      lb.setBounds(270, 30, 280, 30);

      yes.setBounds(100, 80, 100, 40);
      no.setBounds(240, 80, 100, 40);
        
      no.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
    f.setVisible(false);
     }
 });
      yes.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
       username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3 where begin='"+txt.getText()+"'";
          String sqlselect="select * from test.easy3";

        try {
             String str=txt.getText();
             int len=str.length();
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
        select s=new select();
        s.setTitle("EasyNET ADSL Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
     if( ((result.getString("begin")+"          ").substring(0,len+2)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(1,len+3)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(2,len+4)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(3,len+5)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(4,len+6)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(5,len+7)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(6,len+8)).equals("-"+str.trim()+"-")
           
             ){
          
     s.model.addRow(new Object[]{result.getString("name"),
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
            
     
       }
       
       } catch (SQLException r) {
          t(r.getMessage());
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
        } catch (SQLException rr) {
             t(rr.getMessage());
        } }
                  
     }
 });
        }
});


save2.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent ae) {
 final JFrame f=new JFrame();
    JPanel pn=new JPanel();
    JButton no= new JButton("No");
    JButton yes= new JButton("yes");
        final JTextField txt=new JTextField();
    JLabel lb=new JLabel("رقم الشهر");
        
      f.setVisible(true);
      f.setResizable(false);
      f.setDefaultCloseOperation(1);
      f.setTitle("EasyNET ADSL Manager");
      f.setLocationRelativeTo(null);
      f.setSize(450,180);
      f.getContentPane().add(pn);
      f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
      pn.setLayout(null);
      pn.setBackground(Color.WHITE);
      pn.add(lb);
      pn.add(no);
      pn.add(yes);
      pn.add(txt);

      txt.setBounds(140, 30, 110, 30);

      lb.setBounds(270, 30, 280, 30);

      yes.setBounds(100, 80, 100, 40);
      no.setBounds(240, 80, 100, 40);
        
      no.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
    f.setVisible(false);
     }
 });
      yes.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
       username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3 where begin='"+txt.getText()+"'";
          String sqlselect="select * from test.easy3";

        try {
             String str=txt.getText();
             int len=str.length();
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
        select s=new select();
        s.setTitle("EasyNET ADSL Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
     if( ((result.getString("begin")+"          ").substring(0,len+2)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(1,len+3)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(2,len+4)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(3,len+5)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(4,len+6)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(5,len+7)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(6,len+8)).equals("-"+str.trim()+"-")
           
             ){
          
     s.model.addRow(new Object[]{result.getString("name"),
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
            
     
       }
        try {
             MessageFormat footer = new MessageFormat("Page - {0,number,integer}");
              MessageFormat header = new MessageFormat("EasyNET");

              boolean  comp = s.table2.print(JTable.PrintMode.NORMAL,header,footer);
               if (comp) {
                       t("Done Printing...");
                       
                  }
                   else
                       t("Canceled...");
            } catch (PrinterException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       } catch (SQLException r) {
          t(r.getMessage());
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
        } catch (SQLException rr) {
             t(rr.getMessage());
        } }
                  
     }
 });
        }
});



save.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent ae) {
        username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
        
    
            select s=new select();
            s.setTitle("EasyNET ADSL Manager >> ALL DATA");
            s.setVisible(false);
            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
   
              while (result.next()){
             
                  
                   s.model.addRow(new Object[]{result.getString("name"),
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
        
   
        try {
             MessageFormat footer = new MessageFormat("Page - {0,number,integer}");
              MessageFormat header = new MessageFormat("EasyNET");

              boolean  comp = s.table2.print(JTable.PrintMode.NORMAL,header,footer);
               if (comp) {
                       t("Done Printing...");
                       
                  }
                   else
                       t("Canceled...");
            } catch (PrinterException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
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
});


New.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(final ActionEvent e) {
    main m=new main();
        m.setVisible(true);
        m.setDefaultCloseOperation(1);
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        
    }
} );
exit.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(final ActionEvent e) {
        setVisible(false);
    }
} );

know.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(final ActionEvent e) {
        about m=new about();
    }
} );

        
sum.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(final ActionEvent e) {
        all();
    final sumition s=new sumition();
    s.getMonth.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                final form2 ff=new form2();
        ff.no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           ff.f.setVisible(false);
            }
        });
       ff.yes.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                                String strr= ff.txt.getText();

                    if(strr.equals("easy")){
           ff.f.setVisible(false);     
        username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3 where begin='"+s.mon.getText()+"'";
          String sqlselect="select * from test.easy3";

        try {
             String str=s.mon.getText();
             int len=str.length();
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
      int sum=0;
       while (result.next()){
    
           
     if( ((result.getString("begin")+"          ").substring(0,len+2)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(1,len+3)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(2,len+4)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(3,len+5)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(4,len+6)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(5,len+7)).equals("-"+str.trim()+"-")||
         ((result.getString("begin")+"          ").substring(6,len+8)).equals("-"+str.trim()+"-")
           
             ){
          sum+=result.getInt("price");
          s.ss.setText(sum+"   L.E");
      }
            
     
       }
       
       } catch (SQLException r) {
          t(r.getMessage());
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
        } catch (SQLException rr) {
             t(rr.getMessage());
        } }
                    }
                    }
                });
            }
        });
    s.get.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        final form2 ff=new form2();
        ff.no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           ff.f.setVisible(false);
            }
        });
        
        ff.yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
        String str= ff.txt.getText();
        if(str.equals("easy")){
           ff.f.setVisible(false);
         username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();    
          int sum=0; 
       while (result.next()){
    
           sum+=result.getInt("price");
           s.ss.setText(sum+"  L.E");
       }
       
       } catch (SQLException eg) {
          t(eg.getMessage());
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
        } catch (SQLException ef) {
             t(ef.getMessage());
        } }
        }
       
       
            }
        });
        
    }
});

    }
} );



}
public  void all(){
     username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET ADSL Manager >> ALL DATA");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=3; i+=2) {
                s.model.addColumn(rs.getColumnName(i));
            }
                            s.model.addColumn(rs.getColumnName(12));

       while (result.next()){
           
     s.model.addRow(new Object[]{result.getString("name"),
                                 result.getString("user_name"),                               
                                 result.getInt("price"),
                                 
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new back();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(145, 47, 98));

        jButton1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 121, 73));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/66.png"))); // NOI18N
        jButton1.setText("بحث");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 121, 73));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/6.png"))); // NOI18N
        jButton2.setText("ادخال بيانات جديدة");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 121, 73));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/24_003.png"))); // NOI18N
        jButton3.setText("تحديث بيانات");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 121, 73));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/71.png"))); // NOI18N
        jButton4.setText("حذف عميل");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 121, 73));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/40_004.png"))); // NOI18N
        jButton5.setText("جميع البيانات ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 121, 73));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/49_004.png"))); // NOI18N
        jButton6.setText("فحص انتهاء الخدمة");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 121, 73));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/8.png"))); // NOI18N
        jButton7.setText("Go Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 121, 73));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/65_003.png"))); // NOI18N
        jButton8.setText("الأعطال");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 121, 73));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/87_002.png"))); // NOI18N
        jButton9.setText("حذف جميع البيانات");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 133, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/23_003.png"))); // NOI18N
        jButton10.setText("شحن رصيد الخطوط");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 121, 73));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/7_003.png"))); // NOI18N
        jButton11.setText("جميع التسديدات ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 126, 126));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/52_004 - Copy.png"))); // NOI18N
        jButton12.setText("تسديد/طباعة");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jMenu1.setForeground(new java.awt.Color(0, 46, 15));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu4.setForeground(new java.awt.Color(0, 46, 15));
        jMenu4.setText("Print");
        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(0, 46, 15));
        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(0, 46, 15));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Insert i=new Insert();
        i.setTitle("Insert");
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        delete d=new delete();
        d.setVisible(true);
        d.setDefaultCloseOperation(1);
        d.setLocationRelativeTo(null);
        d.setResizable(false); 
                d.setTitle("Delete Data");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        update u=new update();
        u.setVisible(true);
        u.setDefaultCloseOperation(1);
        u.setLocationRelativeTo(null);
        u.setResizable(false);
        u.setTitle("Update Data");
        this.setVisible(false);

     }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET ADSL Manager >> ALL DATA");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
           
     s.model.addRow(new Object[]{result.getString("name"),
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
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        master i=new master();        
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    search s=new search();
        s.setVisible(true);
        s.setDefaultCloseOperation(1);
        s.setLocationRelativeTo(null);
        s.setResizable(false);
        s.setTitle("Search");
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        final form1 h=new form1();
        h.no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           h.f.setVisible(false);
            }
        });
       
             h.yes.enable(false);
   
         h.yes.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        String st=h.txt.getText();
        if(st.equals("easy")){
        h.yes.enable();
        username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlDelete="DELETE FROM test.easy3";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlDelete);
        stat.executeUpdate();
        h.f.setVisible(false);
        t("تم حذف جميع بيانات العملاء بنجاح");
       
       } catch (SQLException rr) {
          t(rr.getMessage());
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
        } catch (SQLException ddd) {
             t(ddd.getMessage());
        } 
        }
        }
            else
        t("خطأ");

            }
        });
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

         username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3";
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
         
            }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        malfunction m=new malfunction();
        m.setVisible(true);
        m.setTitle("Malfunctions");
        m.setDefaultCloseOperation(1);
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        balance m=new balance();
        m.setVisible(true);
        m.setDefaultCloseOperation(1);
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setTitle("Balance");
       this.setVisible(false);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    final JFrame f=new JFrame();
    JPanel pn=new JPanel();
    JButton no= new JButton("No");
    JButton yes= new JButton("yes");
        final JTextField txt=new JTextField();
    JLabel lb=new JLabel("تاريخ اليوم");
        
      f.setVisible(true);
      f.setResizable(false);
      f.setDefaultCloseOperation(1);
      f.setTitle("EasyNET ADSL Manager");
      f.setLocationRelativeTo(null);
      f.setSize(450,180);
      f.getContentPane().add(pn);
      f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
      pn.setLayout(null);
      pn.setBackground(Color.WHITE);
      pn.add(lb);
      pn.add(no);
      pn.add(yes);
      pn.add(txt);

      txt.setBounds(140, 30, 110, 30);

      lb.setBounds(270, 30, 280, 30);

      yes.setBounds(100, 80, 100, 40);
      no.setBounds(240, 80, 100, 40);
        
      no.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
    f.setVisible(false);
     }
 });
      yes.addActionListener(new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent ae) {
       username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy3 where begin='"+txt.getText()+"'";
          String sqlselect="select * from test.easy3";

        try {
             String str=txt.getText();
             int len=str.length();
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
        select s=new select();
        s.setTitle("EasyNET ADSL Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
     if(result.getString("begin").equals(str)){
          
     s.model.addRow(new Object[]{result.getString("name"),
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
            
     
       }
        try {
             MessageFormat footer = new MessageFormat("Page - {0,number,integer}");
              MessageFormat header = new MessageFormat("EasyNET");

              boolean  comp = s.table2.print(JTable.PrintMode.NORMAL,header,footer);
               if (comp) {
                       t("Done Printing...");
                       
                  }
                   else
                       t("Canceled...");
            } catch (PrinterException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       } catch (SQLException r) {
          t(r.getMessage());
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
        } catch (SQLException rr) {
             t(rr.getMessage());
        } }
                  
     }
 });
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pay i=new pay();
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
