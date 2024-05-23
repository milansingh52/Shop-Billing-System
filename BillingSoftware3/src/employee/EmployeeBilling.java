package employee;

// imported list
import Validation.RegValidation;
import billingsoftware.Login;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dbconn.DbConnection;
import dbconn.DbOperation;
import gettersetter.RegisterModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

// end emported list

public class EmployeeBilling extends javax.swing.JFrame {

    int total = 0;
    int profit_total = 0;
    int sn =0;
    int selected_total,selected_total2;
    String employee_name="";
    boolean b = false;
    
    DefaultTableModel dtm;
    
    public EmployeeBilling(String name) {
        initComponents();
        curDateTime();
        
        this.employee_name = name;
        dtm = (DefaultTableModel)rSTableMetro1.getModel();
        
        //new feature
        AutoCompleteDecorator.decorate(product_name_jComboBox2);
    }

    public void curDateTime()
    {
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
        String current_date = sdf1.format(d);
        date_JTextField.setText(current_date);
        
        
        Timer t;
        SimpleDateFormat st;
        t = new Timer(0,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
                String current_time = sdf2.format(d);
                time_JTextField.setText(current_time);
            }
        });
        t.start();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        welcome_emp_name_jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        bill_no_jTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        date_JTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        cust_name_jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cust_contact_jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cust_email_jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cust_address_jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        product_id_jTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        product_price_jTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        product_quantity_jTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        product_description_jTextField = new javax.swing.JTextField();
        add_to_cart_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel23 = new javax.swing.JLabel();
        sub_total_jTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        discount_jTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        taxable_amt_jTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        vat_jTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        total_jTextField = new javax.swing.JTextField();
        save_jButton2 = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        search_bill_jTextField17 = new javax.swing.JTextField();
        search_bill_jLabel31 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        time_JTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        return_amount_jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        product_name_jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        your_total_bill_jTextField = new javax.swing.JLabel();
        cash_provided_jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Profit_jTextField = new javax.swing.JTextField();
        buying_price_jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("l");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 40));

        welcome_emp_name_jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        welcome_emp_name_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        welcome_emp_name_jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male_user_50px.png"))); // NOI18N
        welcome_emp_name_jLabel3.setText("Welcome, Employee");
        jPanel1.add(welcome_emp_name_jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 260, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Billing");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort_window_24px.png"))); // NOI18N
        jLabel7.setText("Change Password");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 160, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setText("l");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 20, 20));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Exit_26px.png"))); // NOI18N
        jLabel29.setText("Logout");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 90, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setText("l");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 10, 20));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/google_forms_24px.png"))); // NOI18N
        jLabel32.setText("view add items");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 140, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("l");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 10, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 65));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1370, 10));

        bill_no_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(bill_no_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Time:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Date:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        date_JTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        date_JTextField.setText("0000/00/00");
        jPanel2.add(date_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 160, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1370, 10));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Bill No:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        cust_name_jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(cust_name_jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 210, 30));

        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        jLabel13.setText("Customer Details");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        cust_contact_jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cust_contact_jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cust_contact_jTextField4KeyReleased(evt);
            }
        });
        jPanel2.add(cust_contact_jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Contact No:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        cust_email_jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(cust_email_jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 250, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Email:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, 30));

        cust_address_jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(cust_address_jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 290, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Address:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 10));

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 20)); // NOI18N
        jLabel17.setText("Product Details");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Product ID:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        product_id_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        product_id_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_id_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(product_id_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 70, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Product Name:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("Price:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 30));

        product_price_jTextField.setEditable(false);
        product_price_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(product_price_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 130, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Quantity:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 90, 30));

        product_quantity_jTextField.setBackground(new java.awt.Color(204, 255, 204));
        product_quantity_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(product_quantity_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 100, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Description");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, 30));

        product_description_jTextField.setEditable(false);
        product_description_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(product_description_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 280, 30));

        add_to_cart_btn.setBackground(new java.awt.Color(255, 255, 51));
        add_to_cart_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping_cart_24px.png"))); // NOI18N
        add_to_cart_btn.setText("Add To Cart");
        add_to_cart_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_to_cart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cart_btnActionPerformed(evt);
            }
        });
        jPanel2.add(add_to_cart_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 270, 120, 40));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "Particular", "Qty", "Price", "Amount", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rSTableMetro1.setAlignmentX(0.3F);
        rSTableMetro1.setAlignmentY(0.3F);
        rSTableMetro1.setAltoHead(30);
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(204, 204, 204));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(229, 225, 225));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(204, 204, 204));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorForegroundHead(new java.awt.Color(0, 0, 0));
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 1580, 130));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("Subtotal:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, -1, 30));

        sub_total_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub_total_jTextField.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(sub_total_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 490, 190, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("Discount[%]:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 530, -1, 30));

        discount_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        discount_jTextField.setForeground(new java.awt.Color(255, 0, 0));
        discount_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_jTextFieldActionPerformed(evt);
            }
        });
        discount_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discount_jTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(discount_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 530, 190, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("Taxable Amount:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, -1, 30));

        taxable_amt_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxable_amt_jTextField.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(taxable_amt_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, 190, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Vat[%]:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, -1, 30));

        vat_jTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vat_jTextField.setForeground(new java.awt.Color(255, 0, 0));
        vat_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vat_jTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(vat_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 610, 190, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("Total:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, -1, 30));

        total_jTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        total_jTextField.setForeground(new java.awt.Color(255, 0, 0));
        total_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_jTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(total_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 190, 30));

        save_jButton2.setBackground(new java.awt.Color(0, 0, 255));
        save_jButton2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        save_jButton2.setForeground(new java.awt.Color(255, 255, 255));
        save_jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        save_jButton2.setText("Save & Print");
        save_jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(save_jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 230, 60));

        update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update details.png"))); // NOI18N
        update_btn.setText("Update");
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel2.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 100, 40));

        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel2.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, 90, 40));

        search_bill_jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(search_bill_jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 100, 60, 30));

        search_bill_jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search_bill_jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search1.png"))); // NOI18N
        search_bill_jLabel31.setText("Bill No");
        search_bill_jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_bill_jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_bill_jLabel31MouseClicked(evt);
            }
        });
        jPanel2.add(search_bill_jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 100, 80, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1370, 10));

        time_JTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        time_JTextField.setText("00:00:00 am");
        jPanel2.add(time_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 60, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Payment Options: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Rs.");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 30, -1));

        return_amount_jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        return_amount_jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(return_amount_jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 130, 20));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Cash Provided:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Return Amount:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Your Total Bill: ");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Rs.");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 30, -1));

        product_name_jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        product_name_jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Milan1", "Milan2", "Kripa2" }));
        product_name_jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                product_name_jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel2.add(product_name_jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 180, 30));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", ".....", "....." }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 160, 30));

        your_total_bill_jTextField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        your_total_bill_jTextField.setForeground(new java.awt.Color(102, 102, 102));
        your_total_bill_jTextField.setText("____________");
        jPanel2.add(your_total_bill_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 120, 20));

        cash_provided_jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cash_provided_jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        cash_provided_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_provided_jTextField1ActionPerformed(evt);
            }
        });
        cash_provided_jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cash_provided_jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(cash_provided_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 160, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg7.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        jLabel10.setText("Total Profit");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 480, 80, 50));
        jPanel2.add(Profit_jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 140, 50));
        jPanel2.add(buying_price_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /************************* close button *********/
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(rootPane, "Do you really want ot Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

       
    
    /***************************** Add to Cart BTN **********************/
    private void add_to_cart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cart_btnActionPerformed
        
        /* Get product data */
        String item_id = product_id_jTextField.getText();
        String item_name = String.valueOf(product_name_jComboBox2.getSelectedItem()); //new add feature
        String item_quantity = product_quantity_jTextField.getText();
        String item_price = product_price_jTextField.getText();
        String item_buying_price = buying_price_jTextField1.getText(); // buying_price text filed is hidden
        
        int price = Integer.parseInt(item_price);
        int buying_price = Integer.parseInt(item_buying_price);
        
        int qty   = Integer.parseInt(item_quantity);
        
        int amount = price*qty;
        int profit_amount = buying_price*qty;
        
        String item_amount = String.valueOf(amount);
        String item_profit_amount = String.valueOf(profit_amount);
        
        //new code of quantity decrease when bill is created 
        ResultSet rs = DbOperation.getSelectedItems(item_id);
        try{
               if(rs!=null){
                   if(rs.next())
                   {
                       int qty2 = Integer.parseInt(rs.getString("item_quantity"));
                       if(qty>qty2)
                       {
                           JOptionPane.showMessageDialog(rootPane, "Sorry ! Only "+qty2+" Item available in the stock", "error", JOptionPane.ERROR_MESSAGE);
                       }
                       else
                       {
                           /* Add item Message and set into table */        
                            JOptionPane.showMessageDialog(rootPane, "Item added successfully!");

                            DefaultTableModel dtm = (DefaultTableModel)rSTableMetro1.getModel();
                            dtm.addRow(new Object[]{item_id, item_name, item_quantity, item_price, item_amount,item_profit_amount});


                            /* Empty Field */
                            product_id_jTextField.setText("");
                            product_name_jComboBox2.setSelectedItem("select"); //new add feature
//                            product_name_jTextField.setText("");
                            product_price_jTextField.setText("");
                            product_quantity_jTextField.setText("");
                            product_description_jTextField.setText("");
                            buying_price_jTextField1.setText("");
                            add_to_cart_btn.setEnabled(false);
                            save_jButton2.setEnabled(true);

                            /* For Total Calculation */
                            total = total+amount;
                            profit_total = profit_total+profit_amount;   //new feature add

                            sub_total_jTextField.setText(String.valueOf(total));
                            taxable_amt_jTextField.setText(String.valueOf(total));
                            total_jTextField.setText(String.valueOf(total));
                            your_total_bill_jTextField.setText(String.valueOf(total));
                            Profit_jTextField.setText(String.valueOf(profit_total));
                       }
                   }
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_add_to_cart_btnActionPerformed
    
    
    /*********************** Discount Calculation ***********/
    private void discount_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_jTextFieldActionPerformed

        String discount = discount_jTextField.getText();
        if(discount!="" && discount!="0")
        {
            double discount_per = Double.parseDouble(discount);
            double taxable_amt = total-((total*discount_per)/100);
            
            taxable_amt_jTextField.setText(String.valueOf(taxable_amt));
            total_jTextField.setText(String.valueOf(taxable_amt));
            your_total_bill_jTextField.setText(String.valueOf(taxable_amt));
        }
    }//GEN-LAST:event_discount_jTextFieldActionPerformed

  
    
    /*********************** Vat Calculation  ***********/
    private void vat_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vat_jTextFieldActionPerformed
        
        String vat = vat_jTextField.getText();
        if(vat!="" && vat!="0")
        {
            double vat_per = Double.parseDouble(vat);
            double taxable_amt = Double.parseDouble(taxable_amt_jTextField.getText());
            double total_amt = taxable_amt+((taxable_amt*vat_per)/100);
            
            total_jTextField.setText(String.valueOf(total_amt));
            your_total_bill_jTextField.setText(String.valueOf(total_amt));
        }
    }//GEN-LAST:event_vat_jTextFieldActionPerformed

    
    
    /****************************Update Button**********************************/
    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        String item_id = product_id_jTextField.getText();
        DefaultTableModel dtm = (DefaultTableModel)rSTableMetro1.getModel();        
        String item_qty = product_quantity_jTextField.getText();
        
        //new Code
        ResultSet rs = DbOperation.getSelectedItems(item_id);
        try{
               if(rs!=null){
                   if(rs.next())
                   {
                       int qty2 = Integer.parseInt(rs.getString("item_quantity"));
                       if(Integer.parseInt(item_qty)>qty2)
                       {
                           JOptionPane.showMessageDialog(rootPane, "Sorry ! Only "+qty2+" Item available in the stock", "error", JOptionPane.ERROR_MESSAGE);
                       }
                       else
                       {
                           String item_price = product_price_jTextField.getText();
        
                            String item_buying_price = buying_price_jTextField1.getText(); //new feature

                            int total_qty2 = Integer.parseInt(item_qty);
                            int total_price2 = Integer.parseInt(item_price);

                            int buying_price = Integer.parseInt(item_buying_price); //nuw feature

                            int total_amt = total_qty2*total_price2;
                            int total_profit_amt = total_qty2*buying_price;  //new feature

                            //set updated value on table row
                            dtm.setValueAt(item_qty, rSTableMetro1.getSelectedRow(), 2);
                            dtm.setValueAt(String.valueOf(total_amt), rSTableMetro1.getSelectedRow(), 4);
                            dtm.setValueAt(String.valueOf(total_profit_amt), rSTableMetro1.getSelectedRow(), 5);

                            //update message display
                            JOptionPane.showMessageDialog(rootPane, "Update Successfully..!");

                            total = total_amt+(total-selected_total);
                            profit_total = total_profit_amt+(profit_total-selected_total2); //new feature

                            sub_total_jTextField.setText(String.valueOf(total));
                            taxable_amt_jTextField.setText(String.valueOf(total));
                            total_jTextField.setText(String.valueOf(total));
                            your_total_bill_jTextField.setText(String.valueOf(total));
                            Profit_jTextField.setText(String.valueOf(profit_total)); //new feature

                            update_btn.setEnabled(false);
                            delete_btn.setEnabled(false);
                       }
                   }
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
   
    }//GEN-LAST:event_update_btnActionPerformed

    /****************************logout Button**********************************/
    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel29MouseClicked

    /****************************change password Button**********************************/
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new EmployeeChangePassword().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    /****************************View Add Items*****************************/
    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        new AddViewItems().setVisible(true);
    }//GEN-LAST:event_jLabel32MouseClicked
    
    /*********************** Window Opened **********************************/
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        welcome_emp_name_jLabel3.setText("Welcome, "+employee_name);
        add_to_cart_btn.setEnabled(false);
        discount_jTextField.setText("0");
        vat_jTextField.setText("0");
        
        sub_total_jTextField.setEditable(false);
        total_jTextField.setEditable(false);
        taxable_amt_jTextField.setEditable(false);
        
        delete_btn.setEnabled(false);
        update_btn.setEnabled(false);
        save_jButton2.setEnabled(false);
        
        bill_no_jTextField.setEnabled(false);
        product_id_jTextField.setEnabled(false); // new add
        date_JTextField.setEditable(false);
        time_JTextField.setEditable(false);
        
        //bill no start from
        String bill_no = DbOperation.getBillNo();
        bill_no_jTextField.setText(bill_no);
        
        //new feature
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from items");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String item_name = rs.getString("item_name");
                product_name_jComboBox2.addItem(item_name);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened
 
    /*********************** Product show Product ID *************************/
    private void product_id_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_id_jTextFieldKeyReleased
        
//        String item_id = product_id_jTextField.getText();
//        ResultSet rs = DbOperation.getSelectedItems(item_id);
//        try
//        {
//            if(rs.next())
//            {
//                product_name_jTextField.setText(rs.getString("item_name"));
//                product_price_jTextField.setText(rs.getString("item_selling_price"));
//                product_quantity_jTextField.setText("1");
//                product_description_jTextField.setText(rs.getString("item_description"));
//                buying_price_jTextField1.setText(rs.getString("item_buying_price"));
//                add_to_cart_btn.setEnabled(true);
//                update_btn.setEnabled(false);
//                delete_btn.setEnabled(false);
//            }
//            else
//            {
//                product_name_jTextField.setText("");
//                product_price_jTextField.setText("");
//                product_quantity_jTextField.setText("");
//                product_description_jTextField.setText("");
//                buying_price_jTextField1.setText("");
//                add_to_cart_btn.setEnabled(false);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_product_id_jTextFieldKeyReleased
   
    /****************************view table data**********************************/   
    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        delete_btn.setEnabled(true);
        update_btn.setEnabled(true);
        
        DefaultTableModel dtm = (DefaultTableModel)rSTableMetro1.getModel();
        
        /* Set data to text field when raw is selected */
        String item_id = dtm.getValueAt(rSTableMetro1.getSelectedRow(), 0).toString();
        String item_qty = dtm.getValueAt(rSTableMetro1.getSelectedRow(), 2).toString();
        String item_price = dtm.getValueAt(rSTableMetro1.getSelectedRow(), 3).toString();
        String item_price2 = dtm.getValueAt(rSTableMetro1.getSelectedRow(), 5).toString(); //new feature
        selected_total = Integer.parseInt(dtm.getValueAt(rSTableMetro1.getSelectedRow(), 4).toString());
        selected_total2 = Integer.parseInt(dtm.getValueAt(rSTableMetro1.getSelectedRow(), 5).toString()); //new feature
        
        product_id_jTextField.setText(item_id);
        product_quantity_jTextField.setText(item_qty);
        product_price_jTextField.setText(item_price);
        buying_price_jTextField1.setText(item_price2);
        
        add_to_cart_btn.setEnabled(false);        
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void discount_jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discount_jTextFieldKeyReleased
      
    }//GEN-LAST:event_discount_jTextFieldKeyReleased

    /****************************** delete button **********************************/
    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        
        int row = rSTableMetro1.getSelectedRow();
        String amount = (String)rSTableMetro1.getValueAt(row, 4);
        String profit_amount = (String)rSTableMetro1.getValueAt(row, 5); //new feature2
        
        int amountt = Integer.parseInt(amount);
        int profit_amountt = Integer.parseInt(profit_amount); //new feature2
        
        
        DefaultTableModel dtm = (DefaultTableModel) rSTableMetro1.getModel();
        int SelectedRowIndex = rSTableMetro1.getSelectedRow();
        dtm.removeRow(SelectedRowIndex);
        
        total = total-amountt;
        profit_total = profit_total-profit_amountt;  //new feature2
        
        sub_total_jTextField.setText(String.valueOf(total));
        taxable_amt_jTextField.setText(String.valueOf(total));
        total_jTextField.setText(String.valueOf(total));
        your_total_bill_jTextField.setText(String.valueOf(total));
        Profit_jTextField.setText(String.valueOf(profit_total));
        
        delete_btn.setEnabled(false);
        update_btn.setEnabled(false);
    }//GEN-LAST:event_delete_btnActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        jLabel29.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        jLabel29.setForeground(Color.white);
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        jLabel32.setForeground(Color.yellow);
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        jLabel32.setForeground(Color.white);
    }//GEN-LAST:event_jLabel32MouseExited

    //********************Save and Print Button**************************
    private void save_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_jButton2ActionPerformed
      
       //******************Save Part ************************************
        boolean flag = false;
        String cust_name = cust_name_jTextField3.getText();
        String cust_phone = cust_contact_jTextField4.getText();
        String cust_email = cust_email_jTextField5.getText();
        String cust_address = cust_address_jTextField6.getText();
        
        RegValidation rv = new RegValidation();
        if(!rv.nameValidation(cust_name))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid name", "Name Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.phoneValidation(cust_phone))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid Phone", "Phone Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.emailValidation(cust_email))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid email", "Email Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.addressValidation(cust_address))
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid address", "Address Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int i = DbOperation.registerCustomer(cust_name, cust_phone, cust_email, cust_address);
            if(i>0)
            {
                //message
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Value didn't insert due some error");
            } 
            
          int bill_no = Integer.parseInt(bill_no_jTextField.getText());
          String date = date_JTextField.getText();
          String time = time_JTextField.getText();
          String total = total_jTextField.getText();
          String total_profit_amt = Profit_jTextField.getText();          
          
          String items = "";
          for(i = 0; i<rSTableMetro1.getRowCount(); i++)
          {
              String id = rSTableMetro1.getValueAt(i, 0).toString();
              
              int sales_count = DbOperation.getSalesCountNo(id);             
                            
              String name = rSTableMetro1.getValueAt(i, 1).toString();
              String qty = rSTableMetro1.getValueAt(i, 2).toString();
              
              int qty1 = Integer.parseInt(qty);
              int qty2 = 0;
              sales_count = sales_count+Integer.parseInt(qty);   //new update
              DbOperation.updateSalesCount(id, sales_count);
              
              try
              {
                  ResultSet rs = DbOperation.getSelectedItems(id);
                  if(rs!=null){
                      if(rs.next()){
                          qty2 = Integer.parseInt(rs.getString("item_quantity"));
                      }
                  }
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }              
              int new_qty = qty2 - qty1;
              DbOperation.UpdateItemQuantity(id, String.valueOf(new_qty));              
              
              String price = rSTableMetro1.getValueAt(i, 3).toString();
              String amount = rSTableMetro1.getValueAt(i, 4).toString();
   
              items = items+id+","+name+","+qty+","+price+","+amount+",";
          }       
          String []bill_details = {cust_name,cust_phone,employee_name,date,time,items,total,total_profit_amt};  //new feature2 add total_profit_amt
          i = DbOperation.custmer_shop_details(bill_no, bill_details);
          
          if(i>0)
          {
                JOptionPane.showMessageDialog(rootPane, "Data Save Successfully!");
                flag = true;
          }
          else
                JOptionPane.showMessageDialog(rootPane, "Value didn't insert due some error");          
     }
        
//********************* Print Part ****************************************************
        int bill_no = Integer.parseInt(bill_no_jTextField.getText());        
        String date = date_JTextField.getText();
        String time = time_JTextField.getText();
        
        cust_name = cust_name_jTextField3.getText();
        cust_phone = cust_contact_jTextField4.getText();
        
        String title_shop_name = "";
        String title_shop_address = "";
        String title_pan_no = "";
        
        String path = "D:\\files\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        
        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+bill_no+"_"+cust_name.replaceAll("\\s", "")+".pdf"));
            doc.open(); 
            
            ResultSet rs = DbOperation.getShopDetails();
            if(rs!=null)
            {
                if(rs.next())
                {
                    title_shop_name = rs.getString("name");
                    title_shop_address = rs.getString("address");
                    title_pan_no = rs.getString("vat_pan_no");
                }
            }
            
            // Heading 
            Paragraph invoice = new Paragraph("INVOICE\n",FontFactory.getFont(FontFactory.COURIER_BOLD,16));
            invoice.setAlignment(Element.ALIGN_CENTER);
            doc.add(invoice);
            
            Paragraph shop_name = new Paragraph(title_shop_name+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,25,Font.BOLD));
            shop_name.setAlignment(Element.ALIGN_CENTER);
            doc.add(shop_name);
            
            Paragraph shop_address = new Paragraph(title_shop_address+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,16));
            shop_address.setAlignment(Element.ALIGN_CENTER);
            doc.add(shop_address);
            
            Paragraph pan_no = new Paragraph("PAN NO: "+title_pan_no+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,16));
            pan_no.setAlignment(Element.ALIGN_CENTER);
            doc.add(pan_no);
            
            // Bill Details 
            Paragraph paragraph5 = new Paragraph("\n\nDate: "+date+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            paragraph5.setAlignment(Element.ALIGN_RIGHT);
            doc.add(paragraph5);
            
            Paragraph paragraph6 = new Paragraph("Time: "+time+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            paragraph6.setAlignment(Element.ALIGN_RIGHT);
            doc.add(paragraph6);              
               
            
            Paragraph paragraph7 = new Paragraph("      Bill No: "+bill_no+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            doc.add(paragraph7);
            
            Paragraph paragraph8 = new Paragraph("      C_Name: "+cust_name+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            doc.add(paragraph8);
            
            Paragraph paragraph9 = new Paragraph("      Phone: "+cust_phone+"\n\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            doc.add(paragraph9);
              
            //Table
            
            //Create Table object, Here 4 specify the no. of columns
            PdfPTable pdfPTable = new PdfPTable(5);
            
            // Defiles the relative width of the columns
            float[] columnWidths = new float[]{8f, 40f, 10f, 15f, 17f};
            pdfPTable.setWidths(columnWidths);

            //Table Heading 
            //Create cells
            PdfPCell sn = new PdfPCell(new Paragraph("SN"));
            sn.setFixedHeight(20f);            
            sn.setBackgroundColor(BaseColor.LIGHT_GRAY);
            sn.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell particular = new PdfPCell(new Paragraph("Particular"));
            particular.setBackgroundColor(BaseColor.LIGHT_GRAY);
            particular.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell qty = new PdfPCell(new Paragraph("Qty"));
            qty.setBackgroundColor(BaseColor.LIGHT_GRAY);
            qty.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell price = new PdfPCell(new Paragraph("Price"));
            price.setBackgroundColor(BaseColor.LIGHT_GRAY);
            price.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell amount = new PdfPCell(new Paragraph("Amount"));
            amount.setBackgroundColor(BaseColor.LIGHT_GRAY);
            amount.setHorizontalAlignment(Element.ALIGN_CENTER);
 
            //Add cells to table
            pdfPTable.addCell(sn);
            pdfPTable.addCell(particular);
            pdfPTable.addCell(qty);
            pdfPTable.addCell(price);
            pdfPTable.addCell(amount);
            
            //Next Row 
            for(int i=0; i<rSTableMetro1.getRowCount(); i++)
            {
                
                PdfPCell SN = new PdfPCell(new Paragraph(rSTableMetro1.getValueAt(i, 0).toString()));
                SN.setFixedHeight(20f);
                PdfPCell p_name = new PdfPCell(new Paragraph(rSTableMetro1.getValueAt(i, 1).toString()));
                PdfPCell p_qty = new PdfPCell(new Paragraph(rSTableMetro1.getValueAt(i, 2).toString()));
                PdfPCell p_price = new PdfPCell(new Paragraph(rSTableMetro1.getValueAt(i, 3).toString()));
                PdfPCell p_amount = new PdfPCell(new Paragraph(rSTableMetro1.getValueAt(i, 4).toString()));
                
                pdfPTable.addCell(SN);
                pdfPTable.addCell(p_name);
                pdfPTable.addCell(p_qty);
                pdfPTable.addCell(p_price);
                pdfPTable.addCell(p_amount);
            }
            
//            PdfPCell newtotal = new PdfPCell(new Paragraph("Sub Total"));
//            newtotal.setFixedHeight(20f);    //for height
//            newtotal.setColspan(4);          //for colspan
//            newtotal.setHorizontalAlignment(Element.ALIGN_RIGHT); //for right align
//            pdfPTable.addCell(newtotal);
//            -----> We make number to word 
            
            PdfPCell sub_total = new PdfPCell(new Paragraph("Sub Total"));
            sub_total.setFixedHeight(20f);    //for height
            sub_total.setColspan(4);          //for colspan
            sub_total.setHorizontalAlignment(Element.ALIGN_RIGHT); //for right align
            pdfPTable.addCell(sub_total);
            
            PdfPCell sub_total_amt = new PdfPCell(new Paragraph(sub_total_jTextField.getText()));
            pdfPTable.addCell(sub_total_amt);
 
            PdfPCell discount = new PdfPCell(new Paragraph("Discount"));
            discount.setFixedHeight(20f);    //for height
            discount.setColspan(4);
            discount.setHorizontalAlignment(Element.ALIGN_RIGHT);
            pdfPTable.addCell(discount);
            
            PdfPCell discount_rate = new PdfPCell(new Paragraph(discount_jTextField.getText()));
            pdfPTable.addCell(discount_rate);
 
            PdfPCell taxable = new PdfPCell(new Paragraph("Taxable Amount"));
            taxable.setFixedHeight(20f);    //for height
            taxable.setColspan(4);
            taxable.setHorizontalAlignment(Element.ALIGN_RIGHT);
            pdfPTable.addCell(taxable);
            
            PdfPCell taxable_amt = new PdfPCell(new Paragraph(taxable_amt_jTextField.getText()));
            pdfPTable.addCell(taxable_amt);

            PdfPCell vat = new PdfPCell(new Paragraph("VAT %"));
            vat.setFixedHeight(20f);    //for height
            vat.setColspan(4);
            vat.setHorizontalAlignment(Element.ALIGN_RIGHT);
            pdfPTable.addCell(vat);
            
            PdfPCell vat_rate = new PdfPCell(new Paragraph(vat_jTextField.getText()));
            pdfPTable.addCell(vat_rate);
 
            PdfPCell grand_total = new PdfPCell(new Paragraph("Grand Total"));
            grand_total.setFixedHeight(20f);    //for height
            grand_total.setColspan(4);
            grand_total.setHorizontalAlignment(Element.ALIGN_RIGHT);
            pdfPTable.addCell(grand_total);
            
            PdfPCell grand_total_amtt = new PdfPCell(new Paragraph(total_jTextField.getText()));
            pdfPTable.addCell(grand_total_amtt);
 
            //Add content to the document using Table objects.
            doc.add(pdfPTable);
            
            
            Paragraph paragraph0 = new Paragraph("\nBill by: "+employee_name+"\n",FontFactory.getFont(FontFactory.COURIER_BOLD,14));
            paragraph0.setAlignment(Element.ALIGN_RIGHT);
            
            doc.add(paragraph0);
                        
//            JOptionPane.showMessageDialog(rootPane, "Bill Generated");          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        doc.close();   
        int a = JOptionPane.showConfirmDialog(rootPane, "Do you want to Print Bill","Select", JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0)
        {
            try
            {
                if((new File(path+""+bill_no+"_"+cust_name.replaceAll("\\s", "")+".pdf")).exists())
                {
                    Process p = Runtime
                            .getRuntime()
//                            .exec("rundll32 url.dll, FileProtocolHandler D:\\filesMIlan2021-1-1.pdf");
//                            PdfWriter.getInstance(doc, new FileOutputStream(path+""+new_bill_no+"_"+cust_name.replaceAll("\\s", "")+".pdf"));
                            .exec("rundll32 url.dll, FileProtocolHandler "+path+""+bill_no+"_"+cust_name.replaceAll("\\s", "")+".pdf");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "File is not Exists");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        
//*******************************referesh Part************************************
        if(flag==true)
        {
            new EmployeeBilling(employee_name).setVisible(true);
            this.dispose();

            int bill_no1 = Integer.parseInt(bill_no_jTextField.getText());
            int x = DbOperation.updateBillNumber(bill_no1);
            if(x>0){
                String bill_no2 = DbOperation.getBillNo();
                bill_no_jTextField.setText(bill_no2);
            }
        }
    }//GEN-LAST:event_save_jButton2ActionPerformed

    //********************bill search button**************************
    private void search_bill_jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bill_jLabel31MouseClicked
        // bill search part
        int bill_noo = Integer.parseInt(search_bill_jTextField17.getText());
        try
        {
            ResultSet rs = DbOperation.showCustomer_shop_search_details(bill_noo);
            if(rs!=null)
            {
                if(rs.next())  
                    new SearchDetails(rs).setVisible(true);
                else
                    JOptionPane.showMessageDialog(rootPane, "Bill Not Found!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_search_bill_jLabel31MouseClicked

    private void cust_contact_jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cust_contact_jTextField4KeyReleased
        
        String phone = cust_contact_jTextField4.getText();
        
        ResultSet rs = DbOperation.checkCustomerExists(phone);
        
        try
        {
            if(rs.next())
            {
                cust_name_jTextField3.setText(rs.getString("name"));
                cust_email_jTextField5.setText(rs.getString("email"));
                cust_address_jTextField6.setText(rs.getString("address"));
            }
            else{
                cust_name_jTextField3.setText("");
                cust_email_jTextField5.setText("");
                cust_address_jTextField6.setText("");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cust_contact_jTextField4KeyReleased

    private void cash_provided_jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_provided_jTextField1KeyReleased

        if(!your_total_bill_jTextField.getText().equals(""))
        {
            if(!cash_provided_jTextField1.getText().equals(""))
            {
                double total_amt = Double.parseDouble(your_total_bill_jTextField.getText());
                double provided_amt = Double.parseDouble(cash_provided_jTextField1.getText());
                double return_amt = provided_amt-total_amt;
                return_amt = Math.round(return_amt*100)/100.0;
                return_amount_jLabel37.setText(String.valueOf(return_amt));
            }
            else{
                return_amount_jLabel37.setText("");
            }
        }
    }//GEN-LAST:event_cash_provided_jTextField1KeyReleased

    private void total_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_jTextFieldActionPerformed

    private void cash_provided_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_provided_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cash_provided_jTextField1ActionPerformed

    private void product_name_jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_product_name_jComboBox2ItemStateChanged
        if(b)
        {
            if(product_name_jComboBox2.getSelectedItem()=="select")
            {
                product_id_jTextField.setText("");
                product_price_jTextField.setText("");
                product_quantity_jTextField.setText("");
                product_description_jTextField.setText("");
                buying_price_jTextField1.setText("");
                add_to_cart_btn.setEnabled(false);
            }
            else{
                try
                {
                    String item_name = String.valueOf(product_name_jComboBox2.getSelectedItem());
                    Connection con = DbConnection.getConnection();
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM items where item_name = ?");
                    ps.setString(1, item_name);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next())
                    {
//                        jTextField1.setText(rs.getString("item_price"));
//                        jTextField2.setText(rs.getString("item_id"));
                        
                        product_id_jTextField.setText(rs.getString("item_id"));
                        product_price_jTextField.setText(rs.getString("item_selling_price"));
                        product_quantity_jTextField.setText("1");
                        product_description_jTextField.setText(rs.getString("item_description"));
                        buying_price_jTextField1.setText(rs.getString("item_buying_price"));
                        add_to_cart_btn.setEnabled(true);
                        update_btn.setEnabled(false);
                        delete_btn.setEnabled(false);
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            b = false;
        }
        else
        {
            b = true;
        }
    }//GEN-LAST:event_product_name_jComboBox2ItemStateChanged
            /*Wastage Code*/
    
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
            java.util.logging.Logger.getLogger(EmployeeBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeBilling(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Profit_jTextField;
    private javax.swing.JButton add_to_cart_btn;
    private javax.swing.JTextField bill_no_jTextField;
    private javax.swing.JTextField buying_price_jTextField1;
    private javax.swing.JTextField cash_provided_jTextField1;
    private javax.swing.JTextField cust_address_jTextField6;
    private javax.swing.JTextField cust_contact_jTextField4;
    private javax.swing.JTextField cust_email_jTextField5;
    private javax.swing.JTextField cust_name_jTextField3;
    private javax.swing.JTextField date_JTextField;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField discount_jTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField product_description_jTextField;
    private javax.swing.JTextField product_id_jTextField;
    private javax.swing.JComboBox product_name_jComboBox2;
    private javax.swing.JTextField product_price_jTextField;
    private javax.swing.JTextField product_quantity_jTextField;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JLabel return_amount_jLabel37;
    private javax.swing.JButton save_jButton2;
    private javax.swing.JLabel search_bill_jLabel31;
    private javax.swing.JTextField search_bill_jTextField17;
    private javax.swing.JTextField sub_total_jTextField;
    private javax.swing.JTextField taxable_amt_jTextField;
    private javax.swing.JTextField time_JTextField;
    private javax.swing.JTextField total_jTextField;
    private javax.swing.JButton update_btn;
    private javax.swing.JTextField vat_jTextField;
    private javax.swing.JLabel welcome_emp_name_jLabel3;
    private javax.swing.JLabel your_total_bill_jTextField;
    // End of variables declaration//GEN-END:variables
}
