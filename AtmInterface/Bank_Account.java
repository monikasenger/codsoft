package AtmInterface;

import java.util.Scanner;

public class Bank_Account {
	private Atm_Interface ai;
	char ans;
	Scanner sc=new Scanner(System.in);

	public Bank_Account(Atm_Interface ai) {
	this.ai=ai;
	}

	//to display the all the amount in bank
	public void display()
	{
			System.out.println("\t***************WELCOME TRANSACTION IN ATM*************** ");
			
		do {
			int type=0;
		//start the atm processs
			System.out.println("\nWhich type of Transaction do you want:- \n 1:Withdrow \n 2:Deposit \n 3:Check Balance\n 4:exit ");
			System.out.println("Enter your transaction type:");
			type= sc.nextInt();

			//process to implement method
		switch(type) {
		case 1:ai.Withdraw();//withdrow method
		break;
		case 2:  ai.Deposit();// desposit method
		break;
		case 3: ai.Balance();// balance method
		break;
		case 4: ai.Exit();//exit
			break;
		default: System.out.println("invalid Transaction option. Please Try Again!!!");
		}
		
		System.out.println("Do you want to do more Transaction:  Y/N"); //if we use  want the atm process according to the use need
		 ans = sc.next().charAt(0); 
		}while(ans == 'y'|| ans =='Y');
		
		System.out.println("Thank You For Coming :) ");

	}
	
}
	

