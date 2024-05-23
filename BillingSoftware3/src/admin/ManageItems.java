package admin;

import employee.*;
import admin.*;
import dbconn.DbOperation;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManageItems extends javax.swing.JFrame {

    Object[] row;
    DefaultTableModel dtm;
    
    public ManageItems() {
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
        item_search_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        item_id_jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        item_name_jTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        item_unit_jComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        item_buying_price_jTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        item_selling_price_jTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        item_quantity_jTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        item_expiry_date_jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        item_description_jTextField = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product_1.png"))); // NOI18N
        jLabel7.setText("Item Details");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1080, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                "Item ID", "Name", "Ex Date", "Qty", "Price"
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 610, 420));

        item_search_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_search_jTextFieldActionPerformed(evt);
            }
        });
        item_search_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                item_search_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(item_search_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search1.png"))); // NOI18N
        jLabel3.setText("Search");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 80, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Item ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 119, 32));

        item_id_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item_id_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_id_jTextFieldActionPerformed(evt);
            }
        });
        item_id_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                item_id_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(item_id_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 286, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Item Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 119, 32));

        item_name_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item_name_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                item_name_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(item_name_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 286, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Unit");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 119, 32));

        item_unit_jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pcs", "kilo", "tonne", "pkt", "box", "gm" }));
        jPanel2.add(item_unit_jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 290, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Buying Price:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        item_buying_price_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(item_buying_price_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 286, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Selling Price:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        item_selling_price_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(item_selling_price_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 286, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Quantity:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        item_quantity_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(item_quantity_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 286, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Expiry Date:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        item_expiry_date_jDateChooser.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(item_expiry_date_jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 290, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Description:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        item_description_jTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(item_description_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 290, 70));

        add_btn.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        jPanel2.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 100, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 120, 40));

        jButton4.setBackground(new java.awt.Color(255, 153, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update details.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 100, 40));

        jButton5.setBackground(new java.awt.Color(153, 255, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 100, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1billing background.png"))); // NOI18N
        jLabel11.setText("Search");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    // add button method
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        
        boolean iname_valid = item_name_jTextField.getText().matches("^[a-zA-Z0-9_\\s]{3,30}$");
        boolean bprice_valid = item_buying_price_jTextField.getText().matches("-?\\d+(\\.\\d+)?");
        boolean sprice_valid = item_selling_price_jTextField.getText().matches("-?\\d+(\\.\\d+)?");
        boolean qty_valid = item_quantity_jTextField.getText().matches("-?\\d+(\\.\\d+)?");

        if(item_id_jTextField.getText().equals("")||item_name_jTextField.getText().equals("")||item_buying_price_jTextField.getText().equals("")||item_selling_price_jTextField.getText().equals("")||item_quantity_jTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "All Filed are Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!iname_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item name", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!bprice_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item buying price", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!sprice_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item Selling price", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!qty_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item Quantity!", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        { 
            //get data from textfield
            String item_id = item_id_jTextField.getText();
            String item_name = item_name_jTextField.getText();
            String item_unit = (String)item_unit_jComboBox.getSelectedItem();
            int item_buying_price = Integer.parseInt(item_buying_price_jTextField.getText());
            int item_selling_price = Integer.parseInt(item_selling_price_jTextField.getText());
            int item_quentity = Integer.parseInt(item_quantity_jTextField.getText());
            String item_expiry_date = ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).getText();
            String item_description = item_description_jTextField.getText();

            boolean status = DbOperation.insertItem(item_id, item_name, item_unit, item_buying_price, item_selling_price,item_quentity, item_expiry_date, item_description);
            if(status)
            {
                JOptionPane.showMessageDialog(rootPane, "Item Insert Successfully");

                /* set empty when items is inserted successfuly*/
                item_id_jTextField.setText("");
                item_name_jTextField.setText("");
                item_unit_jComboBox.setSelectedIndex(0);
                item_buying_price_jTextField.setText("");
                item_selling_price_jTextField.setText("");
                item_quantity_jTextField.setText("");
                ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText("");
                item_description_jTextField.setText("");
                new ManageItems().setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Item not inserted due to some error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_add_btnActionPerformed

    // view table method
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {      
            ResultSet rs = DbOperation.showAllItems();
            if(rs!=null)
            {
                while(rs.next())
                {
                    String item_id1 = rs.getString("item_id");
                    String item_name1 = rs.getString("item_name");
                    String item_expiry_date1 = rs.getString("item_expiry_date");
                    String item_quantity1 = String.valueOf(rs.getInt("item_quantity"));
                    String item_price1 = String.valueOf(rs.getInt("item_buying_price"));
                    
                    row = new Object[]{item_id1,item_name1,item_expiry_date1,item_quantity1,item_price1};
                    dtm.addRow(row);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
    }//GEN-LAST:event_formWindowOpened

    private void item_search_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_search_jTextFieldKeyReleased
        String search_string1 = item_search_jTextField.getText();
        search(search_string1);
    }//GEN-LAST:event_item_search_jTextFieldKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            emptyItemDetails();            
            add_btn.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //update table
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        boolean iname_valid = item_name_jTextField.getText().matches("^[a-zA-Z0-9_\\s]{3,30}$");
        boolean bprice_valid = item_buying_price_jTextField.getText().matches("-?\\d+(\\.\\d+)?");
        boolean sprice_valid = item_selling_price_jTextField.getText().matches("-?\\d+(\\.\\d+)?");
        boolean qty_valid = item_quantity_jTextField.getText().matches("-?\\d+(\\.\\d+)?");

        if(item_id_jTextField.getText()==""||item_name_jTextField.getText()==""||item_buying_price_jTextField.getText()==""||item_selling_price_jTextField.getText()==""||item_quantity_jTextField.getText()=="")
        {
            JOptionPane.showMessageDialog(rootPane, "All Filed are Required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!iname_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item name", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!bprice_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item buying price", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!sprice_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item Selling price", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!qty_valid)
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Item Quantity!", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String item_id = item_id_jTextField.getText();
            String item_name = item_name_jTextField.getText();
            String item_unit = (String)item_unit_jComboBox.getSelectedItem();
            String item_buying_price = item_buying_price_jTextField.getText();
            String item_selling_price = item_selling_price_jTextField.getText();
            String item_quantity = item_quantity_jTextField.getText();
            String item_expiry_date = ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).getText();
            String item_description = item_description_jTextField.getText();

            boolean status = DbOperation.updateItems(item_id, item_name, item_unit, item_buying_price, item_selling_price, item_quantity, item_expiry_date, item_description);
            if(status)
            {
                JOptionPane.showMessageDialog(rootPane, "Value Update Successfully");

                emptyItemDetails();

                new ManageItems().setVisible(true);
                setVisible(false);            
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Value didn't updated due some error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void emptyItemDetails()
    {
        item_id_jTextField.setText("");
        item_name_jTextField.setText("");
        item_unit_jComboBox.setSelectedIndex(0);
        item_buying_price_jTextField.setText("");
        item_selling_price_jTextField.setText("");
        item_quantity_jTextField.setText("");
        ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText("");
        item_description_jTextField.setText("");
    }
    
    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        
        int row = rSTableMetro1.getSelectedRow();
        String selected_id = (String)rSTableMetro1.getValueAt(row, 0);
        try
        {
            ResultSet rs = DbOperation.getSelectedItems(selected_id);
            if(rs!=null)
            {
                if(rs.next())
                {
                    item_id_jTextField.setText(rs.getString("item_id"));
                    item_name_jTextField.setText(rs.getString("item_name"));
                    item_unit_jComboBox.setSelectedItem(rs.getString("item_unit"));
                    item_buying_price_jTextField.setText(rs.getString("item_buying_price"));
                    item_selling_price_jTextField.setText(rs.getString("item_selling_price"));
                    item_quantity_jTextField.setText(rs.getString("item_quantity"));
                    ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText(rs.getString("item_expiry_date"));
                    item_description_jTextField.setText(rs.getString("item_description"));
                    
                    add_btn.setEnabled(false);
                    item_id_jTextField.setEditable(false);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String item_id = item_id_jTextField.getText();
        boolean status = DbOperation.deleteItems(item_id);
        if(status)
        {
            JOptionPane.showMessageDialog(rootPane, "Delete Successfully!");
            new ManageItems().setVisible(true);
            setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "item didn't deleted due some error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void item_id_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_id_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_id_jTextFieldActionPerformed

    private void item_search_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_search_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_search_jTextFieldActionPerformed

    private void item_id_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_id_jTextFieldKeyReleased
        String i_id = item_id_jTextField.getText();        
        try
        {
            ResultSet rs = DbOperation.checkItemIdExists(i_id);
            if(rs.next())
            {
                item_name_jTextField.setText(rs.getString("item_name"));
                item_unit_jComboBox.setSelectedItem(rs.getString("item_unit"));
                item_buying_price_jTextField.setText(rs.getString("item_buying_price"));
                item_selling_price_jTextField.setText(rs.getString("item_selling_price"));
                item_quantity_jTextField.setText(rs.getString("item_quantity"));
                ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText(rs.getString("item_expiry_date"));
                item_description_jTextField.setText(rs.getString("item_description"));
                add_btn.setEnabled(false);
            }
            else
            {
                item_name_jTextField.setText("");
                item_unit_jComboBox.setSelectedIndex(0);
                item_buying_price_jTextField.setText("");
                item_selling_price_jTextField.setText("");
                item_quantity_jTextField.setText("");
                ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText("");
                item_description_jTextField.setText("");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_item_id_jTextFieldKeyReleased

    private void item_name_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_name_jTextFieldKeyReleased
        String i_name = item_name_jTextField.getText();        
        try
        {
            ResultSet rs = DbOperation.checkNameExists(i_name);
            if(rs.next())
            {
                item_id_jTextField.setText(rs.getString("item_id"));
                item_unit_jComboBox.setSelectedItem(rs.getString("item_unit"));
                item_buying_price_jTextField.setText(rs.getString("item_buying_price"));
                item_selling_price_jTextField.setText(rs.getString("item_selling_price"));
                item_quantity_jTextField.setText(rs.getString("item_quantity"));
                ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText(rs.getString("item_expiry_date"));
                item_description_jTextField.setText(rs.getString("item_description"));
                add_btn.setEnabled(false);
            }
            else
            {
                item_unit_jComboBox.setSelectedIndex(0);
                item_buying_price_jTextField.setText("");
                item_selling_price_jTextField.setText("");
                item_quantity_jTextField.setText("");
                ((JTextField)item_expiry_date_jDateChooser.getDateEditor().getUiComponent()).setText("");
                item_description_jTextField.setText("");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_item_name_jTextFieldKeyReleased
    
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
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField item_buying_price_jTextField;
    private javax.swing.JTextField item_description_jTextField;
    private com.toedter.calendar.JDateChooser item_expiry_date_jDateChooser;
    private javax.swing.JTextField item_id_jTextField;
    private javax.swing.JTextField item_name_jTextField;
    private javax.swing.JTextField item_quantity_jTextField;
    private javax.swing.JTextField item_search_jTextField;
    private javax.swing.JTextField item_selling_price_jTextField;
    private javax.swing.JComboBox item_unit_jComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
