
package admin;

import Validation.RegValidation;
import dbconn.DbOperation;
import gettersetter.RegisterModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManageEmployee extends javax.swing.JFrame {

    Object[] row;
    DefaultTableModel dtm;
    
    public ManageEmployee() {
        initComponents();
        setLocation(280, 65);
        
        dtm = (DefaultTableModel)rSTableMetro1.getModel();
        update_jButton1.setEnabled(false);
        delete_jButton4.setEnabled(false);
        cancel_jButton2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_id_jTextField = new javax.swing.JTextField();
        cancel_jButton2 = new javax.swing.JButton();
        add_jButton3 = new javax.swing.JButton();
        emp_name_jTextField = new javax.swing.JTextField();
        emp_email_jTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        update_jButton1 = new javax.swing.JButton();
        delete_jButton4 = new javax.swing.JButton();
        emp_search_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emp_phone_jTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        emp_password_jPasswordField1 = new javax.swing.JPasswordField();
        emp_con_password_jPasswordField2 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Employee ID:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 119, 32));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 119, 32));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Confirm Pass");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        emp_id_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emp_id_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_id_jTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(emp_id_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 290, 40));

        cancel_jButton2.setBackground(new java.awt.Color(255, 51, 51));
        cancel_jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel_jButton2.setForeground(new java.awt.Color(255, 255, 255));
        cancel_jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        cancel_jButton2.setText("Cancel");
        cancel_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(cancel_jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 110, 40));

        add_jButton3.setBackground(new java.awt.Color(51, 51, 255));
        add_jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add_jButton3.setForeground(new java.awt.Color(255, 255, 255));
        add_jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        add_jButton3.setText("Save");
        add_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(add_jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 90, 40));

        emp_name_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(emp_name_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 290, 40));

        emp_email_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(emp_email_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 290, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Donor.png"))); // NOI18N
        jLabel7.setText("Employee");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1080, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 10));

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
                "Emp ID", "Name", "Email", "Phone"
            }
        ));
        rSTableMetro1.setAlignmentX(0.3F);
        rSTableMetro1.setAlignmentY(0.3F);
        rSTableMetro1.setAltoHead(30);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(0, 153, 153));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        rSTableMetro1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSTableMetro1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        rSTableMetro1.setRowHeight(25);
        rSTableMetro1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 620, 340));

        update_jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update details.png"))); // NOI18N
        update_jButton1.setText("Update");
        update_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(update_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 100, 40));

        delete_jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        delete_jButton4.setText("Delete");
        delete_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(delete_jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 100, 40));

        emp_search_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_search_jTextFieldActionPerformed(evt);
            }
        });
        emp_search_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emp_search_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(emp_search_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search1.png"))); // NOI18N
        jLabel3.setText("Search");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        emp_phone_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(emp_phone_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 290, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Phone");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButton2.setText("Female");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));
        jPanel2.add(emp_password_jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 290, 40));
        jPanel2.add(emp_con_password_jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 290, 40));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton1.setText("Male");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1billing background.png"))); // NOI18N
        jLabel11.setText("Search");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jButton2ActionPerformed
        emptyEmployeeValue();
        add_jButton3.setEnabled(true);
        update_jButton1.setEnabled(false);
        delete_jButton4.setEnabled(false);
    }//GEN-LAST:event_cancel_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void emp_search_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_search_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_search_jTextFieldActionPerformed

    private void emp_id_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_id_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_id_jTextFieldActionPerformed

    private void add_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jButton3ActionPerformed
        // TODO add your handling code here:
        String emp_id = emp_id_jTextField.getText();
        String emp_name = emp_name_jTextField.getText();
        String emp_email = emp_email_jTextField.getText();
        
        char[] emp_pass = emp_password_jPasswordField1.getPassword();
        String emp_password = String.valueOf(emp_pass);
        
        char[] emp_con_pass = emp_con_password_jPasswordField2.getPassword();
        String emp_con_password = String.valueOf(emp_con_pass);
        
        String emp_phone = emp_phone_jTextField.getText();
        String gender = "";
        if(jRadioButton1.isSelected()){
            gender = "M";
        }
        else if(jRadioButton2.isSelected()){
            gender="F";
        }
        
        RegValidation rv = new RegValidation();

        if(emp_name.equals("")||emp_email.equals("")||emp_password.equals("")||emp_con_password.equals("")||emp_phone.equals("")|gender.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "All Filed are Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.nameValidation(emp_name))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid name", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.emailValidation(emp_email))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Email", "Email Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.phoneValidation(emp_phone))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Phone", "Phone Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.passwordValidation(emp_password))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Password", "Password Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!emp_con_password.equals(emp_password))
        {
            JOptionPane.showMessageDialog(rootPane, "Confirm Password Not Match", "Password Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            RegisterModel rs = new RegisterModel();
            rs.setEmp_id(emp_id);
            rs.setEmp_name(emp_name);
            rs.setEmp_email(emp_email);
            rs.setEmp_pass(emp_password);
            rs.setEmp_con_pass(emp_con_password);
            rs.setEmp_phone(emp_phone);
            rs.setEmp_gender(gender);

            boolean register_model = DbOperation.registerEmployee(rs);

            if(register_model)
            {
                JOptionPane.showMessageDialog(rootPane, "Employee Register Successfully!");
                emptyEmployeeValue(); 

                new ManageEmployee().setVisible(true);
                setVisible(false);
            }
        }
        
    }//GEN-LAST:event_add_jButton3ActionPerformed
    
    public void emptyEmployeeValue()
    {
        emp_id_jTextField.setText("");
        emp_name_jTextField.setText("");
        emp_email_jTextField.setText("");
        emp_password_jPasswordField1.setText("");
        emp_con_password_jPasswordField2.setText("");
        emp_phone_jTextField.setText("");
        buttonGroup1.clearSelection();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            String emp_id, name, email, phone;
            ResultSet rs = DbOperation.showAllEmployee();
            if(rs!=null)
            {
                while(rs.next())
                {
                    emp_id = rs.getString("emp_id");
                    name = rs.getString("name");
                    email = rs.getString("email");
                    phone = rs.getString("phone");
                    
                    row = new Object[]{emp_id,name,email,phone};
                    dtm.addRow(row);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:
        update_jButton1.setEnabled(true);
        delete_jButton4.setEnabled(true);
        cancel_jButton2.setEnabled(true);
        emp_id_jTextField.setEditable(false);
        int row = rSTableMetro1.getSelectedRow();
        String selected_emp_id = (String)rSTableMetro1.getValueAt(row, 0);
        try
        {
            ResultSet rs = DbOperation.getSelectedEmployee(selected_emp_id);
            if(rs!=null)
            {
                while(rs.next())
                {
                    emp_id_jTextField.setText(rs.getString("emp_id"));
                    emp_name_jTextField.setText(rs.getString("name"));
                    emp_email_jTextField.setText(rs.getString("email"));
                    emp_password_jPasswordField1.setText(rs.getString("password"));
                    emp_phone_jTextField.setText(rs.getString("phone"));
                    if(rs.getString("gender").equals("M"))
                        jRadioButton1.setSelected(true);
                    else
                        jRadioButton2.setSelected(true);
                }
                add_jButton3.setEnabled(false);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void update_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_jButton1ActionPerformed
        // TODO add your handling code here:
        String emp_id = emp_id_jTextField.getText();
        String emp_name = emp_name_jTextField.getText();
        String emp_email = emp_email_jTextField.getText();
        
        char[] emp_pass = emp_password_jPasswordField1.getPassword();
        String emp_password = String.valueOf(emp_pass);
        
        char[] emp_con_pass = emp_con_password_jPasswordField2.getPassword();
        String emp_con_password = String.valueOf(emp_con_pass);
        
        String emp_phone = emp_phone_jTextField.getText();
        String gender = "";
        if(jRadioButton1.isSelected()){
            gender = "M";
        }
        else if(jRadioButton2.isSelected()){
            gender="F";
        }        
        
        RegisterModel rs = new RegisterModel();
        rs.setEmp_id(emp_id);
        rs.setEmp_name(emp_name);
        rs.setEmp_email(emp_email);
        rs.setEmp_pass(emp_password);
        rs.setEmp_con_pass(emp_con_password);
        rs.setEmp_phone(emp_phone);
        rs.setEmp_gender(gender);
        
        int i = DbOperation.updateEmpDetails(rs);
        if(i>0)
        {
            JOptionPane.showMessageDialog(rootPane, "Update Successfully");
            emptyEmployeeValue();
            new ManageEmployee().setVisible(true);
            setVisible(false);
        }
            
        else
            JOptionPane.showMessageDialog(rootPane, "Value didn't update due some error","error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_update_jButton1ActionPerformed

    private void delete_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButton4ActionPerformed
        // TODO add your handling code here:
        String emp_id = emp_id_jTextField.getText();
        int i = DbOperation.deleteEmpDetails(emp_id);
        if(i>0)
        {
            JOptionPane.showMessageDialog(rootPane, "Delete Successfully!");
            new ManageEmployee().setVisible(true);
            setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Value didn't deleted due some error","error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_delete_jButton4ActionPerformed

    private void emp_search_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_search_jTextFieldKeyReleased
        // TODO add your handling code here:
        String search_string1 = emp_search_jTextField.getText();
        search(search_string1);
    }//GEN-LAST:event_emp_search_jTextFieldKeyReleased
    
    public void search(String str)
    {
        dtm = (DefaultTableModel)rSTableMetro1.getModel();
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
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_jButton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_jButton2;
    private javax.swing.JButton delete_jButton4;
    private javax.swing.JPasswordField emp_con_password_jPasswordField2;
    private javax.swing.JTextField emp_email_jTextField;
    private javax.swing.JTextField emp_id_jTextField;
    private javax.swing.JTextField emp_name_jTextField;
    private javax.swing.JPasswordField emp_password_jPasswordField1;
    private javax.swing.JTextField emp_phone_jTextField;
    private javax.swing.JTextField emp_search_jTextField;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JButton update_jButton1;
    // End of variables declaration//GEN-END:variables
}
