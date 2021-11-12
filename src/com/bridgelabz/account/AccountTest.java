package com.bridgelabz.account;
import java.util.*;

public class AccountTest {

	public static void main(String[] args) 
	{
		Account account1 = new Account("SINKY", 50.00);
		Account account2 = new Account("SANDEEP", 37.00);
		
		System.out.printf("%s (Account 1) balance: $%.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("%s (Account 2) balance: $%.2f%n%n", 
				account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		char choice = 'B';
		do
		{
			System.out.println("Would you like to: \n\tDeposit Money (D).\n\tWithdraw Money (W).\n\tDisplay Balance (B).\n\tExit (E).");
			System.out.print("Choice: ");
			choice = input.next(".").charAt(0);
			switch (choice)
			{
			case 'D':
			case 'd':
				int accountNumber;
				System.out.print("Which account would you like to deposit Money (1 or 2): ");
				accountNumber = input.nextInt();
				if (accountNumber == 1)
				{
					System.out.print("Enter deposit amount for account1: ");
					double depositAmount = input.nextDouble();
					System.out.printf("adding %.2f to account1 balance%n", depositAmount);
					account1.deposit(depositAmount);
					System.out.printf("%s balance: $%.2f%n", 
							account1.getName(), account1.getBalance());
				}
				else if (accountNumber == 2)
				{
					System.out.print("Enter deposit amount for account2: ");
					double depositAmount = input.nextDouble();
					System.out.printf("adding %.2f to account2 balance%n", depositAmount);
					account2.deposit(depositAmount);
					System.out.printf("%s balance: $%.2f%n%n", 
							account2.getName(), account2.getBalance());
				}
				else
				{
					System.out.println("Please proceed to the previous menu.");
				}
				break;
			case 'W':
			case 'w':
				int accountNumber1;
				System.out.print("Which account would you like to withdraw money (1 or 2): ");
				accountNumber1 = input.nextInt();
				if (accountNumber1 == 1)
				{
					System.out.print("Enter withdraw amount for account1: ");
					double withdrawAmount = input.nextDouble();
					System.out.printf("removing %.2f to account1 balance%n", withdrawAmount);
					account1.withdraw(withdrawAmount);
					System.out.printf("%s balance: $%.2f%n", 
							account1.getName(), account1.getBalance());
				}
				else if (accountNumber1 == 2)
				{
					System.out.print("Enter withdraw amount for account2: ");
					double withdrawAmount = input.nextDouble();
					System.out.printf("removing %.2f to account2 balance%n", withdrawAmount);
					account2.withdraw(withdrawAmount);
					System.out.printf("%s balance: $%.2f%n%n", 
							account2.getName(), account2.getBalance());
				}
				else
				{
					System.out.println("Please proceed to the previous menu.");
				}
				break;
			case 'B':
			case 'b':
				System.out.printf("%s balance: $%.2f%n", 
						account1.getName(), account1.getBalance());
				System.out.printf("%s balance: $%.2f%n%n", 
						account2.getName(), account2.getBalance());
				break;
			case 'E':
			case 'e':
				System.out.println("Thank you for using UnitedAirlinesBank.");
				break;
			default:
				break;
			}
		} while (!(choice == 'E' || choice == 'e'));
		
		System.out.println("Run End...");
	}
	
	

}