package com.icicibank.loans.carloans;

public class ChildClass implements FirstInterface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildClass child = new ChildClass();
		child.method1();

	}

	@Override
	public void method1() 
	{
		// TODO Auto-generated method stub
		System.out.println("Override the method1 in child class");
		
	}

}
