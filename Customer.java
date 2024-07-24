/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounttest1;

/**
 *
 * @author Lenovo
 */
public class Customer {
    int custId;
    String custAdres,custName;
    Customer(int id,String add,String name){
    custId=id;
    custAdres=add;
    custName=name;
    }
    public void display(){
     System.out.println("id: "+custId);
     System.out.println("address: "+custAdres);
     System.out.println("name: "+custName);
    }
    
}
