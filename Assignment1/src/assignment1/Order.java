/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Date;
import java.util.List;

/**
 *
 * @author c0641048
 */
public class Order {
    
    private int customerId;
    private String customerName;
    private Date timeReceived;
    private Date timeProcessed;
    private Date timeFulfilled;
    private List<Purchase> listOfPurchase;
    private String notes;

    public Order(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(Date timeReceived) {
        this.timeReceived = timeReceived;
    }

    public List<Purchase> getListOfPurchase() {
        return listOfPurchase;
    }

    public void setListOfPurchase(List<Purchase> listOfPurchase) {
        this.listOfPurchase = listOfPurchase;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(Date timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public Date getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(Date timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }
    
    
    public void addPurchase(Purchase p){
        listOfPurchase.add(p);
    }
}
