/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.codejava.sql.DataUtil;
import project.model.Customer;
import project.model.Orders;
import project.model.OrdersProduct;

/**
 *
 * @author User
 */
public class Product_orders implements Bakery_management_system<Product_orders> {
    
     
     private Customer customer;
    private Orders orders;
    private ArrayList<OrdersProduct> pp;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public ArrayList<OrdersProduct> getPp() {
        return pp;
    }

    public void setPp(ArrayList<OrdersProduct> pp) {
        this.pp = pp;
    }

    @Override
    public ArrayList<Product_orders> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Product_orders value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Product_orders value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Product_orders value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void findPP(int id){
        DataUtil util = new DataUtil();
        String sql ="SELECT * FROM CUSTOMER  as c,ORDERS as o,Product_order as pp WHERE c.id=o.id AND o.ORDER_id =pp.ORDER_id  AND pp.ORDER_id ="+id;
        try {
            
            ResultSet rs = util.select(sql);
            
            Customer cus = new Customer();
            Orders ord = new Orders();
            ArrayList<OrdersProduct> ppp = new ArrayList<OrdersProduct>();
            
           while(rs.next()){
               
               OrdersProduct p = new OrdersProduct();
               
                // for customer
                cus.setCustomer_id(rs.getInt("id"));
                cus.setName(rs.getString("name"));
                cus.setDue_balance(rs.getFloat("due_balance"));
                
                // for order
                ord.setOrder_id(rs.getInt("ORDER_id "));
                ord.setDate(rs.getDate("ORDER_DT"));
                ord.setTotal_price(rs.getFloat("total_balance"));
                ord.setSubmite_amount(rs.getFloat("submit_balance"));
                ord.setToday_due(rs.getFloat("due_balance"));
                
                // for order product
                p.setProduct_name(rs.getString("PRODUCT_NAME"));
                p.setQuantity(rs.getInt("quantity"));
                p.setProduct_price(rs.getFloat("total_price"));
                p.setUnite_price(rs.getFloat("SALE_PRICE"));
                
                
                ppp.add(p);
               
           }
           this.setCustomer(cus);
           this.setOrders(ord);
           this.setPp(ppp);
       } catch (SQLException ex) {
           Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public Product_orders find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
