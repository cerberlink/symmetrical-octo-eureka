/*
To determine if the users' balance is still remaining to him/her how much she/he has.
for example, he/she wants to withdraw or deposit his/her money in their balance.

*/
package project3;

public class AccountNode 
{
	AccountNode next;
	AccountNode prev;
	Account data;
	AccountNode(Account a)
	{
		this.data = a;
		this.next = null;
		this.prev = null;
	}
	
	AccountNode (Account a, AccountNode next, AccountNode prev)
	{
		this.data = a;
		this.next = next;
		this.prev = prev;
	}
	
	public AccountNode getNext()
	{
		return this.next;
	}
	
	public AccountNode getPrev()
	{
		return this.prev;
	}
	
	public Account getdata()
	{
		return this.data;
	}
	
	public void setNext(AccountNode a)
	{
		this.next = a;
	}
	
	public void setPrev(AccountNode a)
	{
		this.prev = a;
	}
}
