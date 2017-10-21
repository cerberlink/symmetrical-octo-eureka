//Developer: 
//10-18-17
package project3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Driver2 
{	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{
			//TODO Auto-generated method stub
			OrderedVectorOfAccounts ov = new OrderedVectorOfAccounts();
			LinkedListOfAccounts ll = new LinkedListOfAccounts(null); 
			
			BufferedReader br = null;
			
			
			try //to keep avoiding the errors when it will not find the file. If its file exists, it will display the output.
			//this file can read the string and char if their account balance. Like what you withdraw/deposit money at the atm in the life.
			{
				br = new BufferedReader(new FileReader("/Volumes/KINGSTON/project3/src/project3/accounts.txt")); //accounts.txt
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    String first = null;
			    String last = null;
		    		int acctNum = 0;
		    		double balance = 0.00;
		    	
			    while (line != null) 
			    {
			    	System.out.println(line);
			    	if(first == null) 
			    	{
			    		first = line;
			    	}
			    	
			    	else if(last == null) 
			    	{
			    		last = line;
			    	}
			    	
			    	else if(acctNum == 0)
			    	{
			    		acctNum = Integer.parseInt(line);
			    	}
			    	
			    	else if(balance == 0.00)
			    	{
			    		balance = Double.parseDouble(line);
			    		Account acct = new Account(first, last, acctNum, balance);
			    		
			    		first = null;
				    	last = null;
				    	acctNum = 0;
				    	balance = 0.00;
				    	
			    	}
			    	
			    	line = br.readLine();
			    	
			    	
			    }
			    
			    br.close(); //appropriately closed the file before it will terminate the program.
			} 
			
			catch (IOException e)  //shows the error when it cannot find the file's path.
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Scanner scanner = new Scanner(System.in);
		String userOption = " ";
		int accountNumber = 0;
		double amount = 0;
		double balance = 0;
		String accountOwnerFirst = " ";
		String accountOwnerLast = " ";
		
		while (!userOption.equals("quit"))
		{
			System.out.println("\nWelcome to Project 3");
			System.out.println("Reading data from accounts.txt");
			System.out.println("Enter a command");
			userOption = scanner.next();
			
			switch (userOption)
			{
			case "account":
				System.out.println("What is the owner's first name?");
				accountOwnerFirst = scanner.next();
				System.out.println("What is the owner's last name?");
				accountOwnerLast = scanner.next();
				
				accountNumber = 1000 + (int)(Math.random() * 1000000);
				while(ll.findAccount(accountNumber) != null){
					accountNumber = 1000 + (int)(Math.random() * 1000000);
				}
				
				Account acct = new Account(accountOwnerFirst, accountOwnerLast, accountNumber, 0.00);
				
				ll.addAccount(acct);
				
				System.out.println("New Account Created: " + acct.toString());
				break;
			
			case "close": 
				System.out.println("What is the account number.");
				accountNumber = scanner.nextInt();
				ll.delAccount(accountNumber);
				break;
				
			case "find":
				System.out.println("What is the account number?");
				accountNumber = scanner.nextInt();
				Account account = ll.findAccount(accountNumber);
				System.out.println(account.toString());
				break;
				
			case "deposit":
				
				System.out.println("What is the account number?");
				accountNumber = scanner.nextInt();
				System.out.println("What is the amount?");
				
				balance = ll.modifyAccount(accountNumber, scanner.nextDouble());
				
				System.out.println("New Balance: " + balance);
				
				break;
				
			case "withdraw":
				System.out.println("What is the account number?");
				accountNumber = scanner.nextInt();
				System.out.println("What is the amount?");
				
				
				balance = ll.modifyAccount(accountNumber, -1*scanner.nextDouble());
				
				System.out.println("New Balance: " + balance);
				break;
				
			case "help":
				System.out.println("Commands are:");
				System.out.println("account - (add a new account)");
				System.out.println("close - (remove an account)");
				System.out.println("find - (display one account)");
				System.out.println("deposit (add money to account)");
				System.out.println("withdraw - (remove money from account)");
				System.out.println("help - (print this screen)");
				System.out.println("quit - (end the program)");
				break;
				
			case "quit":
				break;
			default:
				System.out.println("Not a valid command. Try 'help'.");
			}
		}
		}
		System.out.println("Goodbye.");
	}
}
