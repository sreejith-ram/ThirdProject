package com.capgemini;

class parent
{
	int a,b,c;
	parent()
	{
		a=100;
		b=200;
		c=a+b;
	}
	void num()
	{
		System.out.println(c);
	}
	void display()
	{
		System.out.println("Parent class Out");
		num();
	}
}

class child extends parent
{
	int a,b,c;
	void show()
	{
		a=300;
		b=400;
		c=a+b;
		System.out.println(super.c);
		System.out.println(c);
	}
	public void display()
	{
		super.display();
		System.out.println("Child class Out");
	}
}
	

public class This_Super_Practice {

	public static void main(String[] args) {
		child c=new child();
		c.show();
		c.display();

	}

}
