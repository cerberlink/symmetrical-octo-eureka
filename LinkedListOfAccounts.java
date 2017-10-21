/*
the same thing is from AccountNode method. However,
its specifically gives to the users the number if they dont have one.
If they actually lose their number or somebody stole their number, so make new number for the user to check 
their balance. they check their balance which is remaining how much they have .
*/
package project3;

import java.util.LinkedList;

public class LinkedListOfAccounts 
{
	AccountNode head;
	LinkedList<AccountNode> ll = new LinkedList();
	
	LinkedListOfAccounts (Account a)
	{
		head = new AccountNode(a);
	}
	
	public void addAccount(Account acc)
	{
		AccountNode newnode = new AccountNode(acc);
		//AccountNode a = head;
		
		ll.add(newnode);
		//while(a.next != null) 
		//{
		//	a = a.next;
		//}
		//a.setNext(newnode);
		//newnode.setPrev(a);
		//return;
	}

	public void delAccount (int accountid)
	{
		for (int i = 0; i < ll.size(); i++)
		{
			if (ll.get(i).data.getaccountid() == accountid) 
			{
				ll.remove(i);
			}
		}
		//AccountNode a = head;
		//if (head.data.getaccountid() == accountid)
		//{
		//	a = a.next;
		//	if(a == null)
		//	{
		//		return;
		//	}
		//	a.prev = null;
		//	head = a;
		//	return;
		//}
		
		//while (a != null) 
		//{
		//	if (a.data.getaccountid() == accountid)
		//	{
		//		a.prev.next = a.next;
		//		a.next.prev = a.prev;
		//		return;
		//	}
		//	a = a.next;
		//}
		//return;
	}
	
	
	public Account findAccount(int accountid)//	public boolean findAccount(int accountid)
	{
		for(int i = 0; i < ll.size(); i++)	//	{
		{
			if(ll.get(i).data.getaccountid() == accountid)
			{
				return ll.get(i).data;
			}
		}
		//		AccountNode a = head;
		//		
		//		while ( a != null)
		//		{
		//			if (a.data.getaccountid() == accountid)
		//			{
		//				return true;
		//			}
		//			a = a.next;
		//		}
		//		return false;
		//	}
		return null;
	}
	
	public double modifyAccount(int accountid,double adj)
	{
		for (int i = 0; i < ll.size(); i++)
		{
			if (ll.get(i).data.getaccountid() == accountid)
			{
				ll.get(i).data.setbalance(ll.get(i).data.getbalance() + adj);
				return ll.get(i).data.getbalance();
			}
		}
		/*AccountNode a = head;
		
		while(a != null)
		{
			if(a.data.getaccountid() == accountid)
			{
				a.data.setbalance(a.data.getbalance()+adj);
				return ;
			}
			a = a.next;
		}
		return ;*/
		return 0;
	}
	
	public String toString()
	{
		String s =" ";
		AccountNode a = head;
		while(a != null)
		{
			s = s + a.toString();
			char c = '\n';
			s = s+ c;
			a = a.next;
		}
		return s;
	}
}
