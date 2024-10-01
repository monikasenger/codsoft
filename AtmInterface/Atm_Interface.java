package AtmInterface;

import java.util.Scanner;

public class Atm_Interface {
	
	double amount;
	Scanner sc=new Scanner(System.in);
	 private double balance;

	    // Constructor to initialize balance
	    public Atm_Interface(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Method to get the current balance
	    public double Balance() {
	    	System.out.println("Current Balance: Rs." + balance+"\n");
			return balance;
	    }
	    
	//withdaw method
		public void Withdraw()
		{
			System.out.println("Enter the Amount to withdraw:- ");
			amount = sc.nextInt();
			if(amount > 0 && amount <= balance)
			{
				balance-=amount;
			System.out.println("'Rs."+amount+"' Amount is Withdraw");
			}
			else if (amount > balance) {
				System.out.println("SORRY !!!! Insufficient Balance in Account");
				}else {
		            System.out.println("Withdrawal amount must be positive.");
		        }
		}

		//deposit method
		public void Deposit()
		{
			System.out.println("Enter the Amount to deposit:- ");
			amount = sc.nextInt();
			if(amount>0) {
			balance+=amount;
			System.out.println("'Rs."+amount+"'Amount is Deposit");
			}else
			{
				System.out.println("Deposit amount must be positive.");
			}
		}

		//exit method
		public void Exit() {
			System.out.println("Thank you for using the ATM. Goodbye!");
		System.exit(0);
		}
}
