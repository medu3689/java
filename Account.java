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
public class Account {
    String acctype,Acccustomer;
    double accbalance;
    Account(double acbalance, String accttype,String Accustomer){
    accbalance=acbalance;
    acctype=accttype;
    Acccustomer=Accustomer;
}
public void display(){
System.out.println("account balance: "+accbalance);
System.out.println("account type"+acctype);
System.out.println("customer account:"+Acccustomer);
} }
