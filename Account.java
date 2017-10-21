/*
I created this method for the user's first name and last name
also created the new ID or account which is providing the number for the users
who can keep her/his number to check their balance. 
*/
package project3;

public class Account 
{
	private String firstName; //first name requests 
	private String lastName; //last name requests
	private int accountid;	// account ID
	private double balance; //the account's balance
	
	Account(String firstName, String lastName, int accountid, double balance)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountid = accountid;
		this.balance = balance;
	}
	
	public String getfirstName() 
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getaccountid()
	{
		return this.accountid;
	}
	
	public double getbalance()
	{
		return this.balance;
	}
	
	public void setfirstName(String firstname)
	{
		this.firstName = firstname;
	}
	
	public void setlastName(String lastname)
	{
		this.lastName = lastname;
	}
	
	public void setaccountid(int accountid)
	{
		this.accountid = accountid;
	}
	
	public void setbalance(double balance)
	{
		this.balance = balance;
	}
	
	public String toString()
	{
		String s = " "+ this.accountid+ ",	"+this.lastName+ ", "+ this.firstName+ ", " +this.balance; //Somebody put his/her first/last 
		//name, account, ID.
		return s;
	}
}
