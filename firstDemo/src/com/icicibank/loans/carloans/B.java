package com.icicibank.loans.carloans;

public class B extends A
{
	public void m2()
	{
		System.out.println("Hi I am in method in CLass-B");
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.m2();
		b.m1();

	}

}
