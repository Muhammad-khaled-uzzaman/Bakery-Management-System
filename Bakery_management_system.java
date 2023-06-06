/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery_management_system;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface Bakery_management_system <T> {
    
    public ArrayList<T> getAll() throws SQLException;
    public boolean save(T value) throws SQLException;
    public boolean update(T value) throws SQLException;
    public boolean delete(T value) throws SQLException;
    public T find(int id) throws SQLException;
    
}
