/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import net.codejava.sql.DataUtil;
import net.codejava.sql.Javatosql;

/**
 *
 * @author User
 */
public class Orders_class {
    
    Javatosql dataUtil = new Javatosql();
    DataUtil datUtil = new DataUtil();
    
    public int maxId() throws SQLException {
        String sql="SELECT MAX(ORDER_id )+1 FROM ORDERS";
        ResultSet rs = datUtil.select(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 1000;
       
    }
    
}
