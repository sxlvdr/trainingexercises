/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author a838595
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
 
    static Connection conn = null;
     
    private SingletonConnection(){     
    }
    
    public static Connection getDBConnection()
    {
        try{
            if (conn==null)
            {
                Class.forName("com.mysql.jdnc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/database", "root", "password");
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
