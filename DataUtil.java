/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DataUtil {
    
    
     public PreparedStatement ps;
    
    public ResultSet select(String sql)throws SQLException{
        return Javatosql.getConnection().createStatement().executeQuery(sql);
    }
    public boolean DML(String sql)throws SQLException{
        Statement stm = Javatosql.getConnection().createStatement();
        stm.executeUpdate(sql);
        stm.close();
        return true;
    }
    public boolean preaperStatement(String sql)throws SQLException{
        ps=Javatosql.getConnection().prepareStatement(sql);
        
        return true;
    }
    
    
}
