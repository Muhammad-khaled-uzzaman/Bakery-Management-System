/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Javatosql {
    
      /*
    public static void main(String[] args) throws SQLException {
        String url="jdbc:sqlserver://LAPTOP-E2AH4KDK\\SQLEXPRESS:0;databaseName=Bakery_management_system";
        String user="MK";
        String password="1234567891234567";
        
        
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            
            
            
            
            
            String sql = "INSERT INTO CUSTOMER (NAME, REGION_ID , INACTIVE_DT,INACTIVE_IND,TOT_ORDERS,LAST_ORDER_DT)" +"VALUES ('TAZWAR', 2, '17-DEC-80','M',3,'20-FEB-81')";
            
            
            
            Statement statement = connection.createStatement();
 
            int rows =statement.executeUpdate(sql);
            
            if (rows>0) { System.out.println("Row has been inserted"); 
            }
            
    
        }catch(SQLException e){
            System.out.println("oops you are having a bad day");
            e.printStackTrace();
        }
        
    }
*/
    public static Connection getConnection(){
        Connection connection = null;
        String url="jdbc:sqlserver://LAPTOP-E2AH4KDK\\SQLEXPRESS:3227;databaseName=Bakery_management_db";
        String user="MK";
        String password="1234567891234567";
        
        try{
            connection = DriverManager.getConnection(url, user, password);
            
            }catch(SQLException e){
                
                e.printStackTrace();
        }
        return connection;
    }
    
    
}
