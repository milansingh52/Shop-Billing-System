
package dbconn;

import gettersetter.RegisterModel;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DbOperation 
{
    public static ResultSet login(String email1, String password1)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from register where email = ? and password = ?");
            
            ps.setString(1, email1);
            ps.setString(2, password1);
            rs = ps.executeQuery();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    public static boolean insertItem(String item_id, String item_name, String item_unit, int item_buying_price, int item_selling_price,int item_quentity, String item_expiry_date, String item_description) 
    {
        boolean status=false;
        try 
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, item_id);
            ps.setString(2, item_name);
            ps.setString(3, item_unit);
            ps.setInt(4, item_buying_price);
            ps.setInt(5, item_selling_price); 
            ps.setInt(6, item_quentity);
            ps.setString(7, item_expiry_date);
            ps.setString(8, item_description);
            ps.setInt(9, 0);
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    public static ResultSet showAllItems()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from items");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getSelectedItems(String selected_id)
    {
        ResultSet rs = null; 
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from items where item_id = ?"); 
            ps.setString(1, selected_id);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static boolean updateItems(String...str)
    {
        boolean status = false;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update items SET item_name = ?, item_unit = ?,item_buying_price = ?, item_selling_price = ?, item_quantity = ?, item_expiry_date = ?, item_description = ? where item_id = ?");
            ps.setString(1, str[1]);
            ps.setString(2, str[2]);
            ps.setString(3, str[3]);
            ps.setString(4, str[4]);
            ps.setString(5, str[5]);
            ps.setString(6, str[6]);
            ps.setString(7, str[7]);
            ps.setString(8, str[0]);
            
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
        return status;
    }
    public static boolean deleteItems(String item_id)
    {
        boolean status = false;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from items where item_id = ?");
            ps.setString(1, item_id);
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    public static boolean updateShopDetails(FileInputStream fis, String... str)
    {
        boolean status = false;
        try
        {
            Connection con = DbConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement("insert into shop_tbl values(?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps = con.prepareStatement("update shop_tbl set name = ?, establish_date = ?, vat_pan_no = ?, reg_no = ?, vat = ?, address = ?, contact_no = ?, email  = ?, bill_start_no = ?, logo = ?");
            ps.setString(1, str[0]);
            ps.setString(2, str[1]);
            ps.setString(3, str[2]);
            ps.setString(4, str[3]);
            ps.setString(5, str[4]);
            ps.setString(6, str[5]);
            ps.setString(7, str[6]);
            ps.setString(8, str[7]);
            ps.setString(9, str[8]);
            ps.setBinaryStream(10, fis);
            
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }     
    
    
    public static boolean registerEmployee(RegisterModel rs)
    {
        boolean status = false;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into employee_tbl values(?,?,?,?,?,?)");
            ps.setString(1, rs.getEmp_id());
            ps.setString(2, rs.getEmp_name());
            ps.setString(3, rs.getEmp_email());
            ps.setString(4, rs.getEmp_pass());
            ps.setString(5, rs.getEmp_phone());
            ps.setString(6, rs.getEmp_gender());
            
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static ResultSet showAllEmployee()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from employee_tbl");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getSelectedEmployee(String selected_emp_id)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from employee_tbl where emp_id = ?");
            ps.setString(1, selected_emp_id);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static int updateEmpDetails(RegisterModel rs)
    {
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update employee_tbl set name = ?, email = ?, password = ?, phone = ?, gender = ? where emp_id = ?");
            ps.setString(1, rs.getEmp_name());
            ps.setString(2, rs.getEmp_email());
            ps.setString(3, rs.getEmp_pass());
            ps.setString(4, rs.getEmp_phone());
            ps.setString(5, rs.getEmp_gender());
            ps.setString(6, rs.getEmp_id());
            
            i = ps.executeUpdate();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    public static int registerCustomer(String name1, String phone1, String email1, String address1)
    {
        int i=0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into customer_tbl(name,phone,email,address) values(?,?,?,?)");
            ps.setString(1, name1);
            ps.setString(2, phone1);
            ps.setString(3, email1);
            ps.setString(4, address1);
            
            i = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    
    public static int deleteEmpDetails(String emp_id)
    {
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from employee_tbl where emp_id = ?");
            ps.setString(1, emp_id);
            i = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    
    public static String getBillNo()
    {
        String bill_no = "";
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select bill_start_no from shop_tbl");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                bill_no = rs.getString("bill_start_no");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return bill_no;
    }
    
    public static int custmer_shop_details(int bill_no, String[]arr)
    {
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into bill_info_tbl values(?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, bill_no);
            ps.setString(2, arr[0]);
            ps.setString(3, arr[1]);
            ps.setString(4, arr[2]);
            ps.setString(5, arr[3]);
            ps.setString(6, arr[4]);
            ps.setString(7, arr[5]);
            ps.setString(8, arr[6]);
            ps.setString(9, arr[7]);
            
            i = ps.executeUpdate();
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    
    public static ResultSet showCustomer_shop_details()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from bill_info_tbl");
            rs = ps.executeQuery();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet showCustomer_shop_search_details(int bill_no)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from bill_info_tbl where bill_no = ?");
            ps.setInt(1, bill_no);
            rs = ps.executeQuery();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public static int updateBillNumber(int bill_no)
    {
        int new_bill_no = bill_no+1;
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            
            PreparedStatement ps = con.prepareStatement("update shop_tbl set bill_start_no = ? where bill_start_no = ?");
            ps.setString(1, String.valueOf(new_bill_no));
            ps.setString(2, String.valueOf(bill_no));
            
            i = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    
    
    public static ResultSet checkCustomerExists(String phone_no)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from customer_tbl where phone=?");
            ps.setString(1, phone_no);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getBillDataUsingDate(String date1, String date2)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from bill_info_tbl where date between ? and ?;");
            ps.setString(1, date1);
            ps.setString(2, date2);
            
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet changePassword(String old_pass)
    {
        ResultSet rs=null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from employee_tbl where password = ?");
            ps.setString(1, old_pass);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    public static int employeeUpdatePassword(String new_pass, String old_pass)
    {
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update employee_tbl set password=? where password = ?");
            ps.setString(1, new_pass);
            ps.setString(2, old_pass);
            i = ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;
    }
    
    public static int adminUpdatePassword(String new_pass, String old_pass)
    {
        int i = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update admin_tbl set password=? where password = ?");
            ps.setString(1, new_pass);
            ps.setString(2, old_pass);
            i = ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return i;
    }
    
    public static int getSalesCountNo(String id)
    {
        int sales_count_no = 0;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select sales_count from items where item_id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                sales_count_no = rs.getInt("sales_count");            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return sales_count_no;
    }
    public static void updateSalesCount(String id, int sales_count)
    {
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update items set sales_count = ? where item_id = ?");
            ps.setInt(1, sales_count);
            ps.setString(2, id);
            
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static ResultSet showTopSellingItems()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select item_name, item_selling_price,sales_count from items ORDER BY sales_count DESC");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getShopDetails()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from shop_tbl");
            
            rs = ps.executeQuery();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static void UpdateItemQuantity(String item_id, String item_qty)
    {
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update items set item_quantity = ? where item_id = ?");
            ps.setString(1, item_qty);
            ps.setString(2, item_id);
            int i = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static ResultSet checkItemIdExists(String i_id)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from items where item_id=?");
            ps.setString(1, i_id);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet checkNameExists(String i_name)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from items where item_name=?");
            ps.setString(1, i_name);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    
    
    
    
    
    
    
    
    
    public static boolean insertDemo(int id, ArrayList name)
    {
        boolean status = false;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into demo values(?,?)");
            ps.setInt(1, id);
            ps.setObject(2, name);
            int i = ps.executeUpdate();
            if(i>0)
                status = true;
            else
                status = false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    public static ResultSet showDemo()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from demo");
            rs  = ps.executeQuery();            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
}
