/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Orders {
    private int order_id;
    private int Customer_id;
    private Date date;
    private float total_price;
    private float submite_amount;
    private float today_due;

    public float getToday_due() {
        return today_due;
    }

    public void setToday_due(float today_due) {
        this.today_due = today_due;
    }
    
    

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int Customer_id) {
        this.Customer_id = Customer_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public float getSubmite_amount() {
        return submite_amount;
    }

    public void setSubmite_amount(float submite_amount) {
        this.submite_amount = submite_amount;
    }
    
    
}
