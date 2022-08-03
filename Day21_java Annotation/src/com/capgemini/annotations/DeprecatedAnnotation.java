package com.capgemini.annotations;
class A
{
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to the C@TC Program");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();
		

	}

}
