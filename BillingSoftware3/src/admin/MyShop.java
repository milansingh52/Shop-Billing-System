
package admin;

import Validation.RegValidation;
import dbconn.DbOperation;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MyShop extends javax.swing.JFrame {

    File file;
    public MyShop() {
        initComponents();
        setLocation(280, 65);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name_jTextField1 = new javax.swing.JTextField();
        logo_jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        establish_date_jTextField8 = new javax.swing.JTextField();
        vat_pan_no_jTextField9 = new javax.swing.JTextField();
        reg_no_jTextField10 = new javax.swing.JTextField();
        address_jTextField11 = new javax.swing.JTextField();
        contact_no_jTextField11 = new javax.swing.JTextField();
        email_jTextField13 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        vat_jTextField14 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        bill_start_from_jTextField15 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Shop Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Establish Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 119, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("VAT / PAN No");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Reg.Number");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Contact No");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(" Email");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        name_jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        name_jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(name_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 390, 40));

        logo_jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_upload_img.png"))); // NOI18N
        jPanel2.add(logo_jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 120, 110));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 390, 40));

        establish_date_jTextField8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        establish_date_jTextField8.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(establish_date_jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 390, 40));

        vat_pan_no_jTextField9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vat_pan_no_jTextField9.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(vat_pan_no_jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 390, 40));

        reg_no_jTextField10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        reg_no_jTextField10.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(reg_no_jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 390, 40));

        address_jTextField11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        address_jTextField11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(address_jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 390, 40));

        contact_no_jTextField11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        contact_no_jTextField11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(contact_no_jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 390, 40));

        email_jTextField13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        email_jTextField13.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(email_jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 390, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Shop Information");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1080, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("VAT  %");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        vat_jTextField14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vat_jTextField14.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(vat_jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 70, 40));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Choose Logo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 130, 40));

        bill_start_from_jTextField15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bill_start_from_jTextField15.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(bill_start_from_jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 80, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Bill No Start From ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1billing background.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               
        JFileChooser filechooser = new JFileChooser();
        int i = filechooser.showOpenDialog(rootPane);
        if(i==0)
        {
            file = filechooser.getSelectedFile();
            String img_path = file.getAbsolutePath();
            BufferedImage img = null;
            Image dimg = null;
            try
            {
                img = ImageIO.read(new File(img_path));
                dimg = img.getScaledInstance(logo_jLabel9.getWidth(), logo_jLabel9.getHeight(), Image.SCALE_SMOOTH);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            logo_jLabel9.setIcon(new ImageIcon(dimg));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        String name = name_jTextField1.getText();
        String establish_date = establish_date_jTextField8.getText();
        String vat_pan_no = vat_pan_no_jTextField9.getText();
        String reg_no = reg_no_jTextField10.getText();
        String vat = vat_jTextField14.getText();
        String address = address_jTextField11.getText();
        String contact_no = contact_no_jTextField11.getText();
        String email = email_jTextField13.getText();
        String bill_start_from = bill_start_from_jTextField15.getText();
        
        RegValidation rv = new RegValidation();
        
        if(name==""||establish_date==""||vat_pan_no==""||address==""||contact_no==""||email==""||bill_start_from=="")
        {
            JOptionPane.showMessageDialog(rootPane, "All Filed are Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.nameValidation(name))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid name", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.emailValidation(email))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Email", "Email Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.phoneValidation(contact_no))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Phone", "Phone Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                FileInputStream fis = new FileInputStream(file);
                boolean status = DbOperation.updateShopDetails(fis, name, establish_date, vat_pan_no, reg_no, vat, address,contact_no, email, bill_start_from);
                if(status)
                {
                    JOptionPane.showMessageDialog(rootPane, "Update Successfylly!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Value didn't update due soem error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            ResultSet rs = DbOperation.getShopDetails();
            while(rs.next())
            {
                name_jTextField1.setText(rs.getString("name"));
                establish_date_jTextField8.setText(rs.getString("establish_date"));
                vat_pan_no_jTextField9.setText(rs.getString("vat_pan_no"));
                reg_no_jTextField10.setText(rs.getString("reg_no"));
                vat_jTextField14.setText(rs.getString("vat"));
                address_jTextField11.setText(rs.getString("address"));
                contact_no_jTextField11.setText(rs.getString("contact_no"));
                email_jTextField13.setText(rs.getString("email"));
                bill_start_from_jTextField15.setText(rs.getString("bill_start_no"));
                
                InputStream is = rs.getBinaryStream("logo");
                if(is!=null)
                {
                    BufferedImage imgbuf = ImageIO.read(is);                
                    Image dimg = null;
                    try
                    {
                        dimg = imgbuf.getScaledInstance(logo_jLabel9.getWidth(), logo_jLabel9.getHeight(), Image.SCALE_SMOOTH);
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane, e);
                    }
                    logo_jLabel9.setIcon(new ImageIcon(dimg));
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_jTextField11;
    private javax.swing.JTextField bill_start_from_jTextField15;
    private javax.swing.JTextField contact_no_jTextField11;
    private javax.swing.JTextField email_jTextField13;
    private javax.swing.JTextField establish_date_jTextField8;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo_jLabel9;
    private javax.swing.JTextField name_jTextField1;
    private javax.swing.JTextField reg_no_jTextField10;
    private javax.swing.JTextField vat_jTextField14;
    private javax.swing.JTextField vat_pan_no_jTextField9;
    // End of variables declaration//GEN-END:variables
}
