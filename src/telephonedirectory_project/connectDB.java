/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonedirectory_project;

/**
 *
 * @author dam nosrep
 */
import java.sql.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class connectDB {
    Connection conn=null;
    GregorianCalendar c = new GregorianCalendar();
    public static Connection ConnectrDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/telephonedirectorydb","root","");
          
           return conn;

    }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;

        }
    }
}
