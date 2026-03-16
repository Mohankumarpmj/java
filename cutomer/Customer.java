package Customer;
import bank.*;
public class Customer{
    private String customerName;
    private int customerAccount;
    private BankAccount account;
Customer(String customerName,int customerAccount){
    
    this.customerName=customerName;
    this.custmerAccount=custmerAccount;
}

public void Transactions(){
    deposit();
    withdraw();
}
}