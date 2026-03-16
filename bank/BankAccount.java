package BankAccount;
import cutomer.*;
public class BankAccount{
    private String accountHolder;
    private double balance;

   BankAccount( String accountHolder,double balance){
    this.accountHolder=accountHolder;
    this.balance=balance;
    
   }
   void showAccountInfo(){
    System.out.println("The Account Detaile' ");
    System.out.println("---------------------");
    System.out.println("The Name of accountHolder:" + accountHolder);
    System.out.println("The balance : "+ balance);
   }
   public void deposit(double amount){
   balance=balance+amount;
   }
   public void withdraw(double amount){
    if(balance>=amount){
        balance=balance-amount;
    } 
    else{
        System.out.println("Insufficiant balance");
    }
   }
}
