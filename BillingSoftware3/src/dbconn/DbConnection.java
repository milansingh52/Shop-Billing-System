/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mstha
 */
public class DbConnection 
{
    static Connection con;
    static public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software_db", "root", "root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }    
}
