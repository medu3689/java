/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounttest1;
 import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class AccountTest1 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int custId;
    String custAdres;
   String custName;
  String accttype;
        String  customer;
    double accbalence;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the customer id: ");
    custId=s.nextInt();
    System.out.println("enter the customer address: ");
    custAdres=s.next();
    System.out.println("enter the customer name: ");
    custName=s.next();
    System.out.println("enter the customer account balance: ");
   accbalence =s.nextDouble();
    System.out.println("enter the customer account type:");
    accttype=s.next();
    System.out.println("enter the account customer: ");
    customer=s.next();
    System.out.println("\n Customer Info");
    Customer c=new Customer(custId,custAdres,custName);
    c.display();
    System.out.println("\nAccount Info: \n");
    Account a=new Account(accbalence,accttype,customer);
    a.display();
    
}

    }
    

