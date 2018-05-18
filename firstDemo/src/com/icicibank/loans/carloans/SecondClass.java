package com.icicibank.loans.carloans;

public class SecondClass 
{
	
	//int a = 5;
	//int b = 10;
	//int result = 0;
	
	int a, b, result = 0;
	
	
	//public void addition()
	public int addition(int a, int b)
	{
		result = a+b;
		System.out.println("Local Addition Result:" +result);
		return result;
	}
	
	//public void substraction()
	public int substraction(int a, int b)
	{
		result = a-b;
		System.out.println("Local Addition Result:" +result);
		return result;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//result = a+b;
		SecondClass obj3 = new SecondClass();
		//obj3.addition ();
		int x = obj3.addition(15,25);
		System.out.println(x);
		
		
		//obj3.substraction ();
		int y = obj3.substraction(8, 3);
		System.out.println(y);

	}

}




