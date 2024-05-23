package admin;

import dbconn.DbOperation;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Sales extends javax.swing.JFrame {

    Object[] row;
    DefaultTableModel dtm;
    
    public Sales() {
        initComponents();
        setLocation(280, 65);
        
        dtm = (DefaultTableModel)rSTableMetro1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        search_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        today_jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        show_all_jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        amount_jLabel2 = new javax.swing.JLabel();
        total_amtt_jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Donor.png"))); // NOI18N
        jLabel7.setText("Sales Report");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1080, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1080, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Customer Name", "Customer Phone", "Date", "Time", "Employee Name", "Total Rs."
            }
        ));
        rSTableMetro1.setAlignmentX(0.3F);
        rSTableMetro1.setAlignmentY(0.3F);
        rSTableMetro1.setAltoHead(30);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(51, 51, 255));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        rSTableMetro1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Arial", 0, 16)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Arial", 1, 16)); // NOI18N
        rSTableMetro1.setGridColor(new java.awt.Color(255, 255, 102));
        rSTableMetro1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        rSTableMetro1.setRowHeight(25);
        rSTableMetro1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1060, 350));

        search_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_jTextFieldActionPerformed(evt);
            }
        });
        search_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(search_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 100, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 30, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1080, 10));

        rSMaterialButtonRectangle2.setText("rSMaterialButtonRectangle2");
        jPanel2.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(153, 153, 153));
        rSMaterialButtonRectangle3.setText("Refresh");
        rSMaterialButtonRectangle3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        rSMaterialButtonRectangle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 50));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 255, 0));
        rSMaterialButtonRectangle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Address.png"))); // NOI18N
        rSMaterialButtonRectangle1.setText("Get Data");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("From");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 60, 40));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 200, 40));

        today_jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        today_jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        today_jLabel9.setText("Today");
        today_jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        today_jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                today_jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                today_jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                today_jLabel9MouseExited(evt);
            }
        });
        jPanel2.add(today_jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 70, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("To");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 30, 40));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 190, 40));

        show_all_jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        show_all_jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        show_all_jLabel5.setText("Show All");
        show_all_jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_all_jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_all_jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                show_all_jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                show_all_jLabel5MouseExited(evt);
            }
        });
        jPanel2.add(show_all_jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 80, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Total Sales :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 130, 30));

        amount_jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        amount_jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        amount_jLabel2.setText("0/-");
        jPanel2.add(amount_jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 620, 200, 30));

        total_amtt_jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1billing background.png"))); // NOI18N
        jPanel2.add(total_amtt_jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void search_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_jTextFieldActionPerformed
      
    }//GEN-LAST:event_search_jTextFieldActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void search_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_jTextFieldKeyReleased
        String search_string1 = search_jTextField.getText();
        search(search_string1);
    }//GEN-LAST:event_search_jTextFieldKeyReleased

    public void showData(String d1, String d2)
    {
        double total_amt = 0;
        boolean flag = false;
        if(d1.equals("")||d2.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please Choose date");
        else
        {            
            try
            {
                ResultSet rs = DbOperation.getBillDataUsingDate(d1, d2);
                if(rs!=null)
                {
                    while(rs.next())
                    {
                        int bill_no = rs.getInt("bill_no");
                        String cust_name = rs.getString("cust_name");
                        String cust_phone = rs.getString("cust_phone");
                        String date = rs.getString("date");
                        String time = rs.getString("time");
                        String employee_name = rs.getString("employee_name");
                        String amount = rs.getString("total_amount");
                        
                        total_amt = total_amt+Double.parseDouble(amount);

                        Object[] row = new Object[]{bill_no,cust_name,cust_phone,date,time,employee_name,amount};
                        dtm.addRow(row);
                        flag = true;
                    }
                    total_amt = Math.round(total_amt*100)/100.0;
                    amount_jLabel2.setText("Rs."+String.valueOf(total_amt)+"/-");
                }
                if(flag==false)
                {
                    JOptionPane.showMessageDialog(rootPane, "Sales Not Found", "Not Found", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        
    }
    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        
        //rSTableMetro1.setModel(new DefaultTableModel(null, new Object[]{"Bill No","Customer Name","Customer Phone","Date","Time","Employee Name","Total Rs."}));             
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
        String d1 = dateFormat.format(jDateChooser1.getDate());
        String d2 = dateFormat.format(jDateChooser2.getDate());
        showData(d1,d2);
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle3ActionPerformed
        //        rSTableMetro1.setModel(new DefaultTableModel(null, new String[]{"Bill No","Customer Name","Customer Phone","Date","Time","Employee Name","Total Rs."}));
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSMaterialButtonRectangle3ActionPerformed

    private void show_all_jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_all_jLabel5MouseClicked
        double total_amt= 0.0;
        try
        {
            ResultSet rs = DbOperation.showCustomer_shop_details();

            if(rs!=null)
            {
                while(rs.next())
                {
                        int bill_no = rs.getInt("bill_no");
                        String cust_name = rs.getString("cust_name");
                        String cust_phone = rs.getString("cust_phone");
                        String date = rs.getString("date");
                        String time = rs.getString("time");
                        String employee_name = rs.getString("employee_name");
                        String amount = rs.getString("total_amount");
                        
                        total_amt = total_amt+Double.parseDouble(amount);

                        Object[] row = new Object[]{bill_no,cust_name,cust_phone,date,time,employee_name,amount};
                        dtm.addRow(row);
                    }
                }
                total_amt = Math.round(total_amt*100)/100.0;
                amount_jLabel2.setText("Rs."+String.valueOf(total_amt)+"/-");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
    }//GEN-LAST:event_show_all_jLabel5MouseClicked

    private void show_all_jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_all_jLabel5MouseEntered
        show_all_jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_show_all_jLabel5MouseEntered

    private void show_all_jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_all_jLabel5MouseExited
        show_all_jLabel5.setForeground(Color.blue);
    }//GEN-LAST:event_show_all_jLabel5MouseExited

    private void today_jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_today_jLabel9MouseEntered
        today_jLabel9.setForeground(Color.red);
    }//GEN-LAST:event_today_jLabel9MouseEntered

    private void today_jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_today_jLabel9MouseExited
        today_jLabel9.setForeground(Color.blue);
    }//GEN-LAST:event_today_jLabel9MouseExited

    private void today_jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_today_jLabel9MouseClicked
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
        String c_date = sdf1.format(d);
        showData(c_date, c_date);
    }//GEN-LAST:event_today_jLabel9MouseClicked
    
    public void search(String str)
    {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtm);
        rSTableMetro1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount_jLabel2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JTextField search_jTextField;
    private javax.swing.JLabel show_all_jLabel5;
    private javax.swing.JLabel today_jLabel9;
    private javax.swing.JLabel total_amtt_jLabel6;
    // End of variables declaration//GEN-END:variables
}
