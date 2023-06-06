/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import net.codejava.sql.DataUtil;
import project.model.Customer;



/**
 *
 * @author User
 */
public class Customer_class implements Bakery_management_system<Customer> {
    
     DataUtil dataUtil = new DataUtil();
    
    @Override
    public ArrayList<Customer> getAll() throws SQLException {
        String sql = "SELECT * FROM CUSTOMER";
       ArrayList<Customer> customer = new ArrayList<Customer>();
        ResultSet rs = dataUtil.select(sql);
            while(rs.next()){
                Customer c = new Customer();
                c.setCustomer_id(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPhone_no(rs.getString(3));
                c.setAddress(rs.getString(4));
                c.setDue_balance(rs.getFloat(5));
                
                customer.add(c);
            }
        return customer;
    }

    @Override
    public boolean save(Customer value) throws SQLException {
        String sql="INSERT INTO CUSTOMER VALUES ("+value.getCustomer_id()+",'"+value.getName()+"','"
                +value.getPhone_no()+"','"+value.getAddress()+"',"+value.getDue_balance()+")";
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean update(Customer value) throws SQLException {
        String sql ="UPDATE CUSTOMER SET name='"+value.getName()+"',phone_no='"+value.getPhone_no()+"',address='"
                +value.getAddress()+"',due_balance="+value.getDue_balance()+" WHERE id="+value.getCustomer_id();
        dataUtil.DML(sql);
        return true;
    }
        
    @Override
    public boolean delete(Customer value) throws SQLException {
        String sql="DELETE FROM CUSTOMER  WHERE id="+value.getCustomer_id();
        dataUtil.DML(sql);
       return true;
    }

    @Override
    public Customer find(int id) throws SQLException {
        String sql = "SELECT * FROM CUSTOMER  WHERE id="+id;
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ResultSet rs = dataUtil.select(sql);
        while(rs.next()){
            Customer c = new Customer();
            c.setCustomer_id(rs.getInt(1));
            c.setName(rs.getString(2));
            c.setPhone_no(rs.getString(3));
            c.setAddress(rs.getString(4));
            c.setDue_balance(rs.getFloat(5));
            
            return c;
        }
        return null;
    }
    
    
    
    
}
