/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Date;

/**
 *
 * @author c0572709
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
    }
    public Date nextRequestedOrder(Order orders){
        if(orders.getTimeReceived()!=null){
            return null;
        }
        return orders.getTimeReceived();
    }
    
    public void processOrder(Order o)
    {
        if(o.getTimeReceived() != null)
        {
            o.setTimeReceived(new Date());
        }
        else
        {
            throw new IllegalStateException("ERROR: Time Recieved cannot be null when processing!");
        }
    }
}
