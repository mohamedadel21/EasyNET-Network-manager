
package adsl.manager;

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
import javax.swing.JOptionPane;

/**
 *
 * @author Muhamed
 */
public class balance extends javax.swing.JFrame {

    public balance() {
        initComponents();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("easy.png")));
    icon();
    }

     public void icon(){
    ImageIcon iii4=new ImageIcon(getClass().getResource("6 - Copy.png"));
    ImageIcon iii5=new ImageIcon(getClass().getResource("00 - Copy.png"));
    ImageIcon iii6=new ImageIcon(getClass().getResource("71 - Copy.png"));
    ImageIcon iii7=new ImageIcon(getClass().getResource("24_003 - Copy.png"));
    ImageIcon iii8=new ImageIcon(getClass().getResource("87_002 - Copy.png"));
    ImageIcon iii10=new ImageIcon(getClass().getResource("40_004 - Copy.png"));
    ImageIcon iii9=new ImageIcon(getClass().getResource("32_004 - Copy.png"));
    ImageIcon iii1=new ImageIcon(getClass().getResource("44 - Copy.png"));
    ImageIcon iii12=new ImageIcon(getClass().getResource("2_003 - Copy.png"));
    ImageIcon iii13=new ImageIcon(getClass().getResource("2_002 - Copy.png"));

    jButton4.setRolloverIcon(iii4);
    jButton5.setRolloverIcon(iii5);
    jButton6.setRolloverIcon(iii6);
    jButton7.setRolloverIcon(iii7);
    jButton8.setRolloverIcon(iii8);
    jButton10.setRolloverIcon(iii10);
    jButton9.setRolloverIcon(iii9);
    jButton1.setRolloverIcon(iii1);
    jButton12.setRolloverIcon(iii12);
    jButton13.setRolloverIcon(iii13);

    } 
private static Connection conn=null;

   private static PreparedStatement stat=null;
        private static String url;
        private static String password ;
        private static String username;
        private static String sqlInsert;

        ResultSet result;
        public static void t(String msg){
        JOptionPane jo=new JOptionPane();
        jo.showMessageDialog(null,msg,"EasyNET ADSL",1);
        }
    
    private static void insert(int eName,int ephone,int eUser,String epassword,String eAmount) {
    username="root";
    password="root";
    url="jdbc:mysql://localhost:3306";
    sqlInsert="INSERT INTO test.easy6(current_balance,paid_balance,total_balance,date,time) VALUES (?,?,?,?,?)";   
       try {
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection(url,username,password);
       stat=conn.prepareStatement( sqlInsert);
       
       stat.setInt(1, eName);
       stat.setInt(2, ephone);
       stat.setInt(3, eUser);
       stat.setString(4, epassword);
       stat.setString(5, eAmount);
       
      

       stat.executeUpdate();
                          t("تم الادخال بنجاح");

       
       } catch (SQLException ex) {
          t(ex.getMessage());
       } catch (ClassNotFoundException ex) {
          t(ex.getMessage());
        }
       catch(NumberFormatException c){
           t("تاكد من خانة الرصيد الحالى او الرصيد الاجمالى او اجمالى الرصيد رقما ");
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new back();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 121, 18));
        jLabel1.setText("الرصيد الحالى");

        jLabel2.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 121, 18));
        jLabel2.setText("الرصيد المدفوع");

        jLabel3.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 121, 18));
        jLabel3.setText("اجمالى الرصيد");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 121, 18));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 121, 18));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 121, 18));

        jButton1.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 121, 18));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/44.png"))); // NOI18N
        jButton1.setText("جمع");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 121, 18));
        jLabel4.setText("التاريخ");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 121, 18));

        jLabel5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 121, 18));
        jLabel5.setText("الوقت");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 121, 18));

        jButton4.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 121, 18));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/6.png"))); // NOI18N
        jButton4.setText("ادخال بيانات االرصيد  ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 121, 18));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/66.png"))); // NOI18N
        jButton5.setText("بحث بالاجمالى");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 121, 18));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/71.png"))); // NOI18N
        jButton6.setText("حذف بيانات");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 121, 18));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/24_003.png"))); // NOI18N
        jButton7.setText("تحديت بالوقت");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 121, 18));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/87_002.png"))); // NOI18N
        jButton8.setText("حذف جميع البيانات ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 121, 18));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/40_004.png"))); // NOI18N
        jButton10.setText("جميع البيانات");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 121, 18));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/32_004.png"))); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Vollkorn Bold Italic", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 121, 18));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/8.png"))); // NOI18N
        jButton11.setText("Go Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 121, 18));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/2_003.png"))); // NOI18N
        jButton12.setText("تاريخ الآن");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Hacen Vanilla", 0, 13)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 121, 18));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adsl/manager/2_002.png"))); // NOI18N
        jButton13.setText("الوقت الآن");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(23, 23, 23))
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
                    int num1=Integer.parseInt(jTextField1.getText());
                    int num2=Integer.parseInt(jTextField2.getText());
                    int num3=Integer.parseInt(jTextField3.getText());
                    String  date= jTextField4.getText();
                    String  time= jTextField5.getText();

                 
                    insert(num1, num2, num3, date,time);

                }

                catch(NumberFormatException g){
           t("تاكد من خانة الرصيد الحالى او الرصيد الاجمالى او اجمالى الرصيد رقما ");
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        final form g=new form();
        g.lb.setText("هل تريد البحث بالاجمالى  ؟");
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
                String sqlSelect="select * from test.easy6 where total_balance='"+jTextField3.getText()+"'";
                String sqlselect="select * from test.easy6";

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
                    s.setTitle("EasyNET ADSL Manager");

                    ResultSetMetaData rs=result.getMetaData();
                    for (int i = 1; i <=rs.getColumnCount(); i++) {
                        s.model.addColumn(rs.getColumnName(i));
                    }
                    while (result.next()){

                        if(((result.getString("total_balance")+"                   ").substring(0,len)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(1,len+1)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(2,len+2)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(3,len+3)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(4,len+4)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(5,len+5)).equals(str)||
                            ((result.getString("total_balance")+"                   ").substring(6,len+6)).equals(str)
                            

                        ){

                            s.model.addRow(new Object[]{result.getInt(1),
                                                        result.getInt(2),
                                                        result.getInt(3),
                                                        result.getString(4),
                                                        result.getString(5)
                                                        
                            });

                          
                            jTextField1.setText(result.getInt(1)+"");
                            jTextField2.setText(result.getInt(2)+"");
                            jTextField3.setText(result.getInt(3)+"");
                            jTextField4.setText(result.getString(4));
                            jTextField5.setText(result.getString(5));

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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
                String sqlDelet="DELETE FROM test.easy6 WHERE total_balance='"+jTextField3.getText()+"'";
                try {
                    c.f.setVisible(false);
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection(url,username,password);
                    stat=conn.prepareStatement(sqlDelet);
                    stat.executeUpdate();
                    t("تم حذف "+jTextField3.getText()+"بنجاح");

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
        });
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";

        String sqlUpdat="UPDATE  test.easy6 SET current_balance='"+jTextField1.getText()+"' ,total_balance='"+jTextField3.getText()+"' ,paid_balance='"+jTextField2.getText()+"' , "
        
        + " date='"+jTextField4.getText()+"' "
        + "   WHERE time='"+jTextField5.getText()+"'";
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

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
                    String sqlDelete="DELETE FROM test.easy6";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn=DriverManager.getConnection(url,username,password);
                        stat=conn.prepareStatement(sqlDelete);
                        stat.executeUpdate();
                        h.f.setVisible(false);
                        t("تم حذف جميع بيانات الرصيد  بنجاح");

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

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        username="root";
        password="root";
        url="jdbc:mysql://localhost:3306";
        String sqlSelect="select * from test.easy6";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,username,password);
            stat=conn.prepareStatement(sqlSelect);
            result=stat.executeQuery();
            select s=new select();
            s.setTitle("EasyNET ADSL Manager >> ALL Balance Data");

            ResultSetMetaData rs=result.getMetaData();
            for (int i = 1; i <=rs.getColumnCount(); i++) {
                s.model.addColumn(rs.getColumnName(i));
            }
            while (result.next()){

               
                            s.model.addRow(new Object[]{result.getInt(1),
                                                        result.getInt(2),
                                                        result.getInt(3),
                                                        result.getString(4),
                                                        result.getString(5)
                                                        
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
                t(e.getMessage());
            } }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setVisible(false);
        main i=new main();
        i.setVisible(true);
        i.setDefaultCloseOperation(1);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        Calendar cal=Calendar.getInstance();
        jTextField4.setText(cal.get(Calendar.DAY_OF_MONTH)+" / "+(cal.get(Calendar.MONTH)+1)+" / "+cal.get(Calendar.YEAR));

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Calendar cal=Calendar.getInstance();
        jTextField5.setText(cal.get(Calendar.HOUR_OF_DAY)+" : "+cal.get(Calendar.MINUTE)+" : "+cal.get(Calendar.SECOND));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int num1=Integer.parseInt(jTextField1.getText());
 int num2=Integer.parseInt(jTextField2.getText());
int sum=num1+num2;
jTextField3.setText(sum+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
