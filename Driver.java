import bank.BankAccount;
import cutomer.Customer;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Customer " + (i + 1));

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount acc = new BankAccount(name, balance);

            customers[i] = new Customer(name, acc);

            System.out.print("Deposit amount: ");
            double dep = sc.nextDouble();

            System.out.print("Withdraw amount: ");
            double wit = sc.nextDouble();
            sc.nextLine();

            customers[i].performTransactions(dep, wit);
        }

        System.out.println("\n------ Customer Details ------");

        for (int i = 0; i < n; i++) {
            customers[i].displayDetails();
        }

        sc.close();
    }
}