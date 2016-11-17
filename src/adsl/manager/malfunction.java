
package adsl.manager;

import static adsl.manager.main.t;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import static network.manager.Insert.t;
import static network.manager.delete.t;
import static network.manager.main.t;
import static network.manager.search.t;
import static network.manager.update.t;

/**
 *
 * @author MOHAMMED
 */
public class malfunction extends javax.swing.JFrame {
private static Connection conn=null;
        private static PreparedStatement stat=null;
        private static String url;
        private static String password ;
        private static String username;
        private static String sqlInsert;
          private  String [] no ={"No","Yes"};

        ResultSet result;
        public static void t(String msg){
        JOptionPane jo=new JOptionPane();
        jo.showMessageDialog(null,msg,"EasyNET ADSL",1);
        }
    
    private static void insert(String eName,String ephone,String eUser,String epassword,String eAmount
            ,String espeed,String eMac,String ewebsite) {
    username="root";
    password="root";
    url="jdbc:mysql://localhost:3306";
    sqlInsert="INSERT INTO test.easy4(client_name,user_name,technical_name,malfunction_type,date,time,resolved,why_didnot_resolved) VALUES (?,?,?,?,?,?,?,?)";   
    
       try {
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection(url,username,password);
       stat=conn.prepareStatement( sqlInsert);
       
       stat.setString(1, eName);
       stat.setString(2, ephone);
       stat.setString(3, eUser);
       stat.setString(4, epassword);
       stat.setString(5, eAmount);
       stat.setString(6, espeed);
       stat.setString(7, eMac);
       stat.setString(8, ewebsite);
      

       stat.executeUpdate();
                          t("تم الادخال بنجاح");

       
       } catch (SQLException ex) {
          t(ex.getMessage());
       } catch (ClassNotFoundException ex) {
          t(ex.getMessage());
        }
       catch(NumberFormatException c){
           t(c.getMessage());
       }
       catch(NullPointerException cc){
           t(cc.getMessage());
       }
       catch(Error e){
           t(e.getMessage());
       }
      catch(Exception f){
          t(f.getMessage());
      }
       finally{
        try {
            conn.close();
           stat.close();
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
       }      
    }
    
    public malfunction() {
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
     icon();
    }

     public void icon(){
    ImageIcon iii1=new ImageIcon(getClass().getResource("6 - Copy.png"));
    ImageIcon iii2=new ImageIcon(getClass().getResource("00 - Copy.png"));
    ImageIcon iii3=new ImageIcon(getClass().getResource("71 - Copy.png"));
    ImageIcon iii4=new ImageIcon(getClass().getResource("2_003 - Copy.png"));
    ImageIcon iii5=new ImageIcon(getClass().getResource("2_002 - Copy.png"));
    ImageIcon iii6=new ImageIcon(getClass().getResource("24_003 - Copy.png"));
    ImageIcon iii7=new ImageIcon(getClass().getResource("87_002 - Copy.png"));
    ImageIcon iii10=new ImageIcon(getClass().getResource("40_004 - Copy.png"));
    ImageIcon iii8=new ImageIcon(getClass().getResource("32_004 - Copy.png"));

    jButton1.setRolloverIcon(iii1);
    jButton2.setRolloverIcon(iii2);
    jButton3.setRolloverIcon(iii3);
    jButton4.setRolloverIcon(iii4);
    jButton5.setRolloverIcon(iii5);
    jButton6.setRolloverIcon(iii6);
    jButton7.setRolloverIcon(iii7);
    jButton10.setRolloverIcon(iii10);
    jButton8.setRolloverIcon(iii8);
    jButton11.setRolloverIcon(iii10);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new back();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox(no);
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Malfunctions");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(159, 54, 98));

        jLabel1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 146, 0));
        jLabel1.setText("اسم العميل");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 146, 0));

        jLabel2.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 131, 15));
        jLabel2.setText("الفنى المستلم");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 131, 15));

        jLabel3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 131, 15));
        jLabel3.setText("نوع العطل");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 131, 15));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 131, 15));
        jLabel4.setText("التاريخ");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 131, 15));

        jLabel5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 131, 15));
        jLabel5.setText("الوقت");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 131, 15));

        jLabel6.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 131, 15));
        jLabel6.setText("حُل العطل");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 131, 15));

        jLabel7.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 131, 15));
        jLabel7.setText("لم تحل لهذا السبب");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 131, 15));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel8.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 146, 0));
        jLabel8.setText("اسم المستخدم");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 146, 0));

        jButton1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 131, 15));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/6.png"))); // NOI18N
        jButton1.setText("ادخال بيانات العطل  ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 131, 15));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/66.png"))); // NOI18N
        jButton2.setText("بحث باسم المستخدم");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 131, 15));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/71.png"))); // NOI18N
        jButton3.setText("حذف بيانات");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 131, 15));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/2_003.png"))); // NOI18N
        jButton4.setText("تاريخ الآن");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 146, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/2_002.png"))); // NOI18N
        jButton5.setText("الوقت الآن");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 131, 15));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/24_003.png"))); // NOI18N
        jButton6.setText("تحديت البيانات");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 131, 15));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/87_002.png"))); // NOI18N
        jButton7.setText("حذف جميع البيانات ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(0, 131, 15));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/32_004.png"))); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 131, 15));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/8.png"))); // NOI18N
        jButton9.setText("Go Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 131, 15));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/40_004.png"))); // NOI18N
        jButton10.setText("جميع البيانات/طباعة");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 131, 15));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/40_004.png"))); // NOI18N
        jButton11.setText("طباعة بالتاريخ ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        Calendar cal=Calendar.getInstance();
        jTextField3.setText(cal.get(Calendar.DAY_OF_MONTH)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.YEAR));
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Calendar cal=Calendar.getInstance();
      jTextField4.setText(cal.get(Calendar.HOUR_OF_DAY)+" : "+cal.get(Calendar.MINUTE)+" : "+cal.get(Calendar.SECOND));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      final form f=new form();
      f.lb.setText("هل تريد ادخال بيانات جديدة ؟");
      f.no.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
         f.f.setVisible(false);
          }
      });
      
      f.yes.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
         
               try{
                    f.f.setVisible(false);
           
        String  name= jTextField1.getText();
        String  user= jTextField5.getText();
        String  name2= jTextField2.getText();
        String  type= jTextArea1.getText();
        String  date= jTextField3.getText();
        String  time= jTextField4.getText();

        String  no= jComboBox1.getSelectedItem().toString();
        String  resolve= jTextArea1.getText();

        
        insert(name, user, name2, type, date, time,no, resolve);

               }
               
            catch(NumberFormatException g){
                t(g.getMessage());
            }
            catch(NullPointerException l){
                t("احد الخانات خالية");
            }
            catch(Exception g){
                t(g.getMessage());
            }
         catch(Error sh){
                t(sh.getMessage());
            }
   
          }
      });
             }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
jTextArea1.setText("");
jTextArea2.setText("");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setVisible(false);
        main i=new main();
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 final form g=new form();
      g.lb.setText("هل تريد البحث باسم المستخدم ؟");
      g.no.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
         g.f.setVisible(false);
          }
      });
      
      g.yes.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
          
         username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy4 where user_name='"+jTextField5.getText()+"'";
          String sqlselect="select * from test.easy4";

        try {
             String str=jTextField5.getText();
             int len=str.length();
        g.f.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET ADSL Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=rs.getColumnCount(); i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
      if(((result.getString("user_name")+"                   ").substring(0,len)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(1,len+1)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(2,len+2)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(3,len+3)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(4,len+4)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(5,len+5)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(6,len+6)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(7,len+7)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(8,len+8)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(9,len+9)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(10,len+10)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(11,len+11)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(12,len+12)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(13,len+13)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(14,len+14)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(15,len+15)).equals(str)||
         ((result.getString("user_name")+"                   ").substring(16,len+16)).equals(str)

      ){
         
       s.model.addRow(new Object[]{result.getString("client_name"),
                                 result.getString("user_name"),
                                 result.getString("technical_name"),
                                 result.getString("malfunction_type"),
                                 result.getString("date"),
                                 result.getString("time"),
                                 result.getString("resolved"),
                                 result.getString("why_didnot_resolved")
                                 
     });
       
      jTextArea1.setText(result.getString("malfunction_type"));
      jTextArea2.setText(result.getString("why_didnot_resolved"));
      jTextField5.setText(result.getString("user_name"));
      jTextField2.setText(result.getString("technical_name"));
      jTextField1.setText(result.getString("client_name"));
      jTextField4.setText(result.getString("time"));
      jTextField3.setText(result.getString("date"));
      jComboBox1.setSelectedItem("resolved");     
     
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
final form c=new form();
      c.lb.setText("هل تريد الحذف ؟");
      c.no.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
         c.f.setVisible(false);
          }
      });
      
      c.yes.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlDelet="DELETE FROM test.easy4 WHERE user_name='"+jTextField5.getText()+"'";
        try {
                     c.f.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlDelet);
        stat.executeUpdate();
        t("تم حذف "+jTextField5.getText()+"بنجاح");
       
       } catch (SQLException eeee) {
          t(eeee.getMessage());
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
       } catch (SQLException eee) {
             t(eee.getMessage());
        } 
        }
    }
});    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        
        String sqlUpdat="UPDATE  test.easy4 SET client_name='"+jTextField1.getText()+"' ,technical_name='"+jTextField2.getText()+"' , "
                + "  time='"+jTextField4.getText()+"', resolved='"+jComboBox1.getSelectedItem()+"' ,"
                + " date='"+jTextField3.getText()+"' ,"
                + " malfunction_type='"+jTextArea1.getText()+"', why_didnot_resolved='"+jTextArea2.getText()+"' WHERE user_name='"+jTextField5.getText()+"'";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlUpdat);
        stat.executeUpdate();
        t("تم التحديث بنجاح");
       
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
        } 
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy4";
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET Network Manager >> ALL Malfunctions DATA");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=rs.getColumnCount(); i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
           
     s.model.addRow(new Object[]{result.getString("client_name"),
                                 result.getString("user_name"),
                                 result.getString("technical_name"),
                                 result.getString("malfunction_type"),
                                 result.getString("date"),
                                 result.getString("time"),
                                 result.getString("resolved"),
                                 result.getString("why_didnot_resolved"),
                                 
     });
       }
       try {
              MessageFormat footer = new MessageFormat("Page - {0,number,integer}");
              MessageFormat header = new MessageFormat("Report Page");

              boolean  comp = s.table2.print(JTable.PrintMode.NORMAL,header,footer);
               if (comp) {
                       t("Done Printing...");
                       
                  }
                   else
                       t("ok...");
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

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

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
        String sqlDelete="DELETE FROM test.easy4";
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
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
          String sqlselect="select * from test.easy4";

        try {
             String str=txt.getText();
             int len=str.length();
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
        select s=new select();
        s.setTitle("EasyNET ADSL Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=rs.getColumnCount(); i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
     if(result.getString("date").equals(str)){
                  
     s.model.addRow(new Object[]{result.getString("client_name"),
                                 result.getString("user_name"),
                                 result.getString("technical_name"),
                                 result.getString("malfunction_type"),
                                 result.getString("date"),
                                 result.getString("time"),
                                 result.getString("resolved"),
                                 result.getString("why_didnot_resolved"),
                                 
     });
      }
            
     
       }
        try {
             MessageFormat footer = new MessageFormat("Page - {0,number,integer}");
              MessageFormat header = new MessageFormat("Report Page");

              boolean  comp = s.table2.print(JTable.PrintMode.NORMAL,header,footer);
               if (comp) {
                       t("Done Printing...");
                       
                  }
                   else
                       t("ok...");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
