package project3;

import java.util.ArrayList;
//import java.util.*;
//import javax.swing.*;
//import java.io.*;

public class OrderedVectorOfAccounts
{
	private int capacity;
	private int size;
	private ArrayList<Account> Ar;
	private static final int consta = 10;
	
	OrderedVectorOfAccounts()
	{
		this.size = 20;
		this.capacity = size + consta;
		Ar = new ArrayList<Account>();
	}
	
	public void store(int index, Account value)
	{
		try
		{
			Ar.set(index, value);
		}
		
		catch (IndexOutOfBoundsException indexOutBounds) 
		{
			if (index >= 0 && (index < size))
			{
				Ar.add(index, value);
			}
			
			if(index >= 0 && (index >= size && index < capacity))
			{
				Ar.add(index, value);
				size = index + 1;
				if (size == capacity)
				{
					capacity += consta;
				}
				
				if (index >= capacity)
				{
					throw new IndexOutOfBoundsException();
				}
			}
		}
	}
	
	public Account get(int index)
	{
		try
		{
			return Ar.get(index);
		}
		
		catch (IndexOutOfBoundsException indexOutBounds)
		{
			
		}
		return null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void addAccount(Account a)
	{
		int l = a.getaccountid();
		int i = findIndex(l);
		this.store(i, a);
		return;
	}
	
	private int findIndex(int l) 
	{
		// TODO Auto-generated method stub
		int i = 0;
		int j = Ar.size()-1;
		
		while(i <= j)
		{
			int m = (i+j)/2;
			if(Ar.get(m).getaccountid() == l)
			{
				return m;
			}
			
			if(Ar.get(m).getaccountid() > l)
			{
				j = m-1;
			}
			else
			{
				i = m+1;
			}
		}
		return -1;
	}
	
	public void delAccount(int accountid)
	{
		int i = findIndex(accountid);
		Ar.remove(i);
		return;
	}
	
	public boolean findAccount(int accountid)
	{
		int i = findIndex(accountid);
		if(i == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void modifyBalance(int accountid,int adj)
	{
		int i = findIndex(accountid);
		if(i != -1)
		{
			Account t = Ar.get(i);
			t.setbalance(t.getbalance()+adj);
			Ar.set(i, t);
		}
	}
	
	public String toString()
	{
		String s = " ";
		for (int i = 0; i < Ar.size(); i++) 
		{
			Account a = Ar.get(i);
			s = s + a.toString();
			char c = '\n';
			s = s + c;
		}
		return s;
	}
}
