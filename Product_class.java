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
import project.model.Product;

/**
 *
 * @author User
 */
public class Product_class implements Bakery_management_system<Product> {
    
     DataUtil dataUtil = new DataUtil();
    
    
    @Override
    public ArrayList<Product> getAll() throws SQLException {
        String sql="SELECT * FROM PRODUCT";
        ArrayList<Product> products = new ArrayList<Product>();
        ResultSet rs = dataUtil.select(sql);
            while(rs.next()){
                Product p = new Product();
                p.setProduct_id(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setUnite_price(rs.getFloat(3));
                
                products.add(p);
            }
        return products;
    }

    @Override
    public boolean save(Product value) throws SQLException {
        String sql="INSERT INTO PRODUCT VALUES("+value.getProduct_id()+",'"+value.getName()+"',"+value.getUnite_price()+")";
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean update(Product value) throws SQLException {
        String sql="UPDATE PRODUCT SET PRODUCT_NAME ='"+value.getName()+"', SALE_PRICE="+value.getUnite_price()+" WHERE product_id="+value.getProduct_id();
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean delete(Product value) throws SQLException {
        String sql="DELETE FROM PRODUCT  WHERE product_id="+value.getProduct_id();
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public Product find(int id) throws SQLException {
        String sql="SELECT * FROM PRODUCT WHERE product_id="+id;
        ArrayList<Product> products= new ArrayList<Product>();
        ResultSet rs = dataUtil.select(sql);
                while(rs.next()){
                    Product p = new Product();
                    p.setProduct_id(rs.getInt(1));
                    p.setName(rs.getString(2));
                    p.setUnite_price(rs.getFloat(3));
                    return p;
                }
                return null;
    }
      
    
}
