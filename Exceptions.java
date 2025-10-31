package com.collection;
class Account{
int balance =5000;
public void checkbal()
{
	System.out.println("balance is"+balance);
}
public  int  depo(int amount)
{
	  balance+=amount;
	  
	  return balance;
}
public void withdraw(int amount) 
{
	if(balance>=amount)
	{
		balance-=amount;
		 System.out.println(amount + " withdrawn successfully!");
         System.out.println("Remaining balance: " + balance);
	}
	else
	{
		throw new ArithmeticException ("inseficuent balance"+balance);
	}
	
}
}
public class Exceptions {
	public static void main(String[]args)
	{
		Account a=new Account();
		a.checkbal();
		a.depo(500);
		try {
	a.withdraw(7000);
		}
		catch (ArithmeticException e) {
            System.out.println("⚠️ Exception caught: " + e.getMessage());}
	a.checkbal();
		
	}

}
