package project_1;
//TASK 3
//1.Create a class to represent the ATM machine.
//2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
//checking the balance.
//3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
//checkBalance().
//4. Create a class to represent the user's bank account, which stores the account balance.
//5. Connect the ATM class with the user's bank account class to access and modify the account
//balance.
//6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
//7. Display appropriate messages to the user based on their chosen options and the success or failure
//of their transactions.
import java.util.Scanner;

 class BankAccount {
    private double balance;

    public BankAccount(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true; 
        }
        return false; 
    }
}
 

 class ATM_Machine {
     private BankAccount userAccount;
     Scanner sc=new Scanner(System.in);
     
     public ATM_Machine(BankAccount account) {
         this.userAccount = account;
     }

     public void user_interface() {
         System.out.println("!...Welcome to the ATM...!");
         System.out.println("1. Withdraw");
         System.out.println("2. Deposit");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
     }

     public void run() {
         int choice = 0;

         do {
        	 user_interface();
             System.out.print("Enter your choice(1-4): ");
             choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.print("Enter the amount to withdraw: ");
                     double withdrawAmount = sc.nextDouble();
                     boolean withdrawn = userAccount.withdraw(withdrawAmount);
                     if (withdrawn) {
                         System.out.println("Amount withdrawn successfully...!");
                     } else {
                         System.out.println("Insufficient balance for withdrawal...!");
                     }
                     break;
                 case 2:
                     System.out.print("Enter the amount to deposit: ");
                     double depositAmount = sc.nextDouble();
                     userAccount.deposit(depositAmount);
                     System.out.println("Amount deposited successfully...!");
                     break;
                 case 3:
                     System.out.println("Your account's current balance is: " + userAccount.getBalance());
                     break;
                 case 4:
                     System.out.println("Program Ended...!");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
                     break;
             }
         } while (choice != 4);
     }
 }



public class ATM_Interface {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0); // Set Initial balance
        ATM_Machine atm = new ATM_Machine(account);
        atm.run();

	}

}
