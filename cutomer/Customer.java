package Customer;
import bank.BankAccount;
public class Customer{
    private String customerName;
    private BankAccount customerAccount;
Customer(String customerName,BankAccount customerAccount){
    
    this.customerName=customerName;
    this.customerAccount=custmerAccount;
}

public void performTransactions(double depositAmount, double withdrawAmount) {

        System.out.println("\nCustomer : " + customerName);

        customerAccount.deposit(depositAmount);
        customerAccount.withdraw(withdrawAmount);
    }

    public void displayDetails() {
        System.out.println("\nCustomer Name : " + customerName);
        customerAccount.showAccountInfo();
    }
}