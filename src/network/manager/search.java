

package network.manager;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MOHAMMED
 */
public class search extends javax.swing.JFrame {

    private String [] amount ={"5 GB","6 GB","7 GB","8 GB","9 GB","10 GB","15 GB","16 GB","17 GB","18 GB","19 GB","20 GB","25 GB","30 GB","35 GB","40 GB",
        "45 GB","50 GB","55 GB","60 GB","65 GB","70 GB","75 GB","80 GB","85 GB","90 GB","95 GB","100 GB"
     ,"105 GB","110 GB","115 GB","120 GB","125 GB","130 GB","135 GB","140 GB","145 GB","150 GB","155 GB","160 GB"
     ,"165 GB","170 GB","175 GB","185 GB","190 GB","195 GB","200 GB","250 GB","300 GB","350 GB","400 GB","450 GB","500 GB"}; 
    
    private  String [] speed={"512 KB","1 MB","2 MB","3 MB","4 MB","5 MB","6 MB","7 MB","8 MB","9 MB","10 MB","11 MB","12 MB","13 MB","14 MB","15 MB"
    ,"16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35"
    ,"36","37","38","39","40"};
    private String [] mac={"No","Yes"};
    private String [] website={"No","Yes"};
    private String [] limt={"","Limited","Ulimited"};

        private static Connection conn=null;
        private static PreparedStatement stat=null;
        private static String url;
        private static String password ;
        private static String username;
        private static String sqlInsert;
        ResultSet result;
        public static void t(String msg){
        JOptionPane jo=new JOptionPane();
        jo.showMessageDialog(null,msg,"EasyNET Network",1);
        }
    
   
    public search() {
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
       icon();
    }
public  void icon(){
   ImageIcon iii1=new ImageIcon(getClass().getResource("00 - Copy.png"));
   ImageIcon iii2=new ImageIcon(getClass().getResource("71 - Copy.png"));
  
    ImageIcon iii4=new ImageIcon(getClass().getResource("32_004 - Copy.png"));
    jButton1.setRolloverIcon(iii1);
    jButton3.setRolloverIcon(iii1);
    jButton4.setRolloverIcon(iii1);
    jButton5.setRolloverIcon(iii4);

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
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox(amount);
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox(speed);
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox(mac);
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox(website);
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox(limt);
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 133, 128));
        jLabel1.setText("اسم العميل ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 133, 128));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 133, 128));
        jLabel2.setText("التليفون");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 133, 128));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 133, 128));
        jLabel3.setText("اسم المستخدم");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 133, 128));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 133, 128));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 133, 128));
        jLabel4.setText("كلمة السر");

        jLabel5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 133, 128));
        jLabel5.setText("الباقة");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 133, 128));

        jLabel6.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 133, 128));
        jLabel6.setText("السرعة");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 133, 128));

        jLabel7.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 133, 128));
        jLabel7.setText("الماك");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 133, 128));

        jLabel8.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 133, 128));
        jLabel8.setText("موقع التحميلات");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 133, 128));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 133, 128));
        jLabel9.setText("نوع الباقة");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 133, 128));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 133, 128));
        jLabel10.setText("تاريخ البدء");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 133, 128));

        jLabel11.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 133, 128));
        jLabel11.setText("تاريخ الانتهاء");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 133, 128));

        jLabel12.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 133, 128));
        jLabel12.setText("السعر");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 133, 128));

        jLabel13.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 133, 128));
        jLabel13.setText("الملاحظات");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 133, 128));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 133, 128));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/66.png"))); // NOI18N
        jButton1.setText("بحث باسم العميل ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 133, 128));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/8.png"))); // NOI18N
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 133, 128));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/66.png"))); // NOI18N
        jButton3.setText("بحث برقم التليفون ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 133, 128));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/66.png"))); // NOI18N
        jButton4.setText("بحث باسم المستخدم ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 133, 128));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/network/manager/32_004.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 123, 131));
        jLabel14.setText("العنوان");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 139, 139));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(469, 469, 469)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addGap(290, 290, 290)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
         main i=new main();        
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      final form g=new form();
      g.lb.setText("هل تريد البحث باسم العميل ؟");
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
        String sqlSelect="select * from test.easy where name='"+jTextField1.getText()+"'";
          String sqlselect="select * from test.easy";

        try {
             String str=jTextField1.getText();
             int len=str.length();
        g.f.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET Network Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
      if(((result.getString("name")+"                   ").substring(0,len)).equals(str)||
         ((result.getString("name")+"                   ").substring(1,len+1)).equals(str)||
         ((result.getString("name")+"                   ").substring(2,len+2)).equals(str)||
         ((result.getString("name")+"                   ").substring(3,len+3)).equals(str)||
         ((result.getString("name")+"                   ").substring(4,len+4)).equals(str)||
         ((result.getString("name")+"                   ").substring(5,len+5)).equals(str)||
         ((result.getString("name")+"                   ").substring(6,len+6)).equals(str)||
         ((result.getString("name")+"                   ").substring(7,len+7)).equals(str)||
         ((result.getString("name")+"                   ").substring(8,len+8)).equals(str)||
         ((result.getString("name")+"                   ").substring(9,len+9)).equals(str)||
         ((result.getString("name")+"                   ").substring(10,len+10)).equals(str)||
         ((result.getString("name")+"                   ").substring(11,len+11)).equals(str)||
         ((result.getString("name")+"                   ").substring(12,len+12)).equals(str)||
         ((result.getString("name")+"                   ").substring(13,len+13)).equals(str)||
         ((result.getString("name")+"                   ").substring(14,len+14)).equals(str)||
         ((result.getString("name")+"                   ").substring(15,len+15)).equals(str)||
         ((result.getString("name")+"                   ").substring(16,len+16)).equals(str)

      ){
          
       s.model.addRow(new Object[]{result.getString("name"),
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
            
      jTextArea1.setText(result.getString("notes"));
      jTextField1.setText(result.getString("name"));
      jTextField2.setText(result.getString("phone"));
      jTextField3.setText(result.getString("user_name"));
      jTextField4.setText(result.getString("password"));
      jTextField5.setText(result.getString("begin"));
      jTextField6.setText(result.getString("end"));
      jTextField7.setText(result.getInt("price")+"");
      jTextField8.setText(result.getString("address"));
      jComboBox1.setSelectedItem(result.getString("amount"));
      jComboBox2.setSelectedItem(result.getString("speed"));
      jComboBox3.setSelectedItem(result.getString("mac"));
      jComboBox4.setSelectedItem(result.getString("website"));
      jComboBox5.setSelectedItem(result.getString("limitation"));
      
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 final form g=new form();
      g.lb.setText("هل تريد البحث برقم التليفون ؟");
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
        String sqlSelect="select * from test.easy where phone='"+jTextField2.getText()+"'";
          String sqlselect="select * from test.easy";

        try {
             String str=jTextField2.getText();
             int len=str.length();
        g.f.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET Network Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
       while (result.next()){
    
           
      if(((result.getString("phone")+"                   ").substring(0,len)).equals(str)||
         ((result.getString("phone")+"                   ").substring(1,len+1)).equals(str)||
         ((result.getString("phone")+"                   ").substring(2,len+2)).equals(str)||
         ((result.getString("phone")+"                   ").substring(3,len+3)).equals(str)||
         ((result.getString("phone")+"                   ").substring(4,len+4)).equals(str)||
         ((result.getString("phone")+"                   ").substring(5,len+5)).equals(str)||
         ((result.getString("phone")+"                   ").substring(6,len+6)).equals(str)||
         ((result.getString("phone")+"                   ").substring(7,len+7)).equals(str)||
         ((result.getString("phone")+"                   ").substring(8,len+8)).equals(str)||
         ((result.getString("phone")+"                   ").substring(9,len+9)).equals(str)||
         ((result.getString("phone")+"                   ").substring(10,len+10)).equals(str)||
         ((result.getString("phone")+"                   ").substring(11,len+11)).equals(str)||
         ((result.getString("phone")+"                   ").substring(12,len+12)).equals(str)||
         ((result.getString("phone")+"                   ").substring(13,len+13)).equals(str)||
         ((result.getString("phone")+"                   ").substring(14,len+14)).equals(str)||
         ((result.getString("phone")+"                   ").substring(15,len+15)).equals(str)||
         ((result.getString("phone")+"                   ").substring(16,len+16)).equals(str)

      ){
          
       s.model.addRow(new Object[]{result.getString("name"),
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
            
      jTextArea1.setText(result.getString("notes"));
      jTextField1.setText(result.getString("name"));
      jTextField2.setText(result.getString("phone"));
      jTextField3.setText(result.getString("user_name"));
      jTextField4.setText(result.getString("password"));
      jTextField5.setText(result.getString("begin"));
      jTextField6.setText(result.getString("end"));
      jTextField8.setText(result.getString("address"));
      jTextField7.setText(result.getInt("price")+"");
      jComboBox1.setSelectedItem(result.getString("amount"));
      jComboBox2.setSelectedItem(result.getString("speed"));
      jComboBox3.setSelectedItem(result.getString("mac"));
      jComboBox4.setSelectedItem(result.getString("website"));
      jComboBox5.setSelectedItem(result.getString("limitation"));
      
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
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
        String sqlSelect="select * from test.easy where user_name='"+jTextField3.getText()+"'";
          String sqlselect="select * from test.easy";

        try {
             String str=jTextField3.getText();
             int len=str.length();
        g.f.setVisible(false);
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(url,username,password);
        stat=conn.prepareStatement(sqlSelect);
        stat=conn.prepareStatement(sqlselect);

        result=stat.executeQuery();
       select s=new select();
               s.setTitle("EasyNET Network Manager");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=14; i++) {
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
          
       s.model.addRow(new Object[]{result.getString("name"),
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
            
      jTextArea1.setText(result.getString("notes"));
      jTextField1.setText(result.getString("name"));
      jTextField2.setText(result.getString("phone"));
      jTextField3.setText(result.getString("user_name"));
      jTextField4.setText(result.getString("password"));
      jTextField5.setText(result.getString("begin"));
      jTextField6.setText(result.getString("end"));
      jTextField8.setText(result.getString("address"));
      jTextField7.setText(result.getInt("price")+"");
      jComboBox1.setSelectedItem(result.getString("amount"));
      jComboBox2.setSelectedItem(result.getString("speed"));
      jComboBox3.setSelectedItem(result.getString("mac"));
      jComboBox4.setSelectedItem(result.getString("website"));
      jComboBox5.setSelectedItem(result.getString("limitation"));
      
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField8.setText("");
        jTextField7.setText("");    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
