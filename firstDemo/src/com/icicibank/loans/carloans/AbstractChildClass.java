package com.icicibank.loans.carloans;

public class AbstractChildClass extends FirstAbstract {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractChildClass obj = new AbstractChildClass();
		obj.m1();
		obj.m2();
		
	}

	@Override
	public void m2() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("m2 overriding method of abstract");
		
	}

}
