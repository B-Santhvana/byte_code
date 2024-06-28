/*
Create a simple banking system program in Java. The program should perform the 
following operations:
1. Display account information.
2. Deposit money.
3. Withdraw money. 
 */
package banking_system;
import java.util.Scanner;

public class BankAccount {
	Scanner sc= new Scanner(System.in);
	String accountNumber;
	String accountHolderName;
	double balance;
	
	public void Display() {
		
		//System.out.println("Hello account user ");
		System.out.println("welcome to the bank! "+accountHolderName);
		
		System.out.println("the available operations: ");
		System.out.println("press '1' for to display account details");
		System.out.println("press '2' for deposit amount.");
		System.out.println("press '3' for withdrawl.");
		System.out.println("press '4' to exit.");
		System.out.println("******************************");
		
	}
	public void displayAccountInfo() {
		System.out.println("here are your account details");
		System.out.println("------------------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Available Balance: $" + balance);
		System.out.println("******************************");
		System.out.println();
	}
	public void deposit() {
		System.out.println("you selected deposit option.");
		System.out.println("------------------------------");
		System.out.println("enter amount to deposit:");
		int amount=sc.nextInt();
		 balance += amount;
		 System.out.println("amount Deposited: $" + amount);
		 System.out.println("******************************");
	}
	public void Withdraw(){
		System.out.println("you selected withdraw option.");
		System.out.println("------------------------------");
		System.out.println("enter amount to withdraw:");
		int amount= sc.nextInt();
		 if (amount <= balance) {
			 balance -= amount;
			 System.out.println("amount Withdrawn: $" + amount);
		 } 
		 else {
			 System.out.println("Insufficient funds");
		 }
		 System.out.println("******************************");
	}	
	public static void main(String[] args) {
		BankAccount bank= new BankAccount();
		bank.accountNumber = "19112003";
		bank.accountHolderName = "Jessy";
		bank.balance = 6000.00;
			
		while(true) {
			bank.Display();
			
			Scanner sc= new Scanner(System.in);
			int option= sc.nextInt();
			if(option==1) {
				bank.displayAccountInfo();
			}
			else if(option==2) {
				bank.deposit();
			}
			else if (option==3) {
				bank.Withdraw();
			}
			else if(option==4) {
				System.out.println("bye!");
				break;	
			}
		}
	}
}