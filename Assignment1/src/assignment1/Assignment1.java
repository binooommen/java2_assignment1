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
        // TODO code application logic here
    }
    
    public void newOrderArrives(Order order) throws Exception{
        if(order.getCustomerId() > 0 && order.getCustomerName() != null ){
            if(!order.getListOfPurchase().isEmpty()){
                order.setTimeReceived(new Date());
            }else{
                throw new Exception("List of purchase is empty."); 
            }
        }else{
            throw new Exception("Customer id and customer name does not exsist."); 
        }
    }
}
