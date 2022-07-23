package com.cg.abs;
//we can't make any Abstract class as final in java 
//final abstract class car
abstract class car
{
	abstract void display();
}
class Audi extends car
{
	void display()
	{
		System.out.println("Audi");
	}
}

public class FinalAbstractClass {

	public static void main(String[] args) {
		

	}

}
