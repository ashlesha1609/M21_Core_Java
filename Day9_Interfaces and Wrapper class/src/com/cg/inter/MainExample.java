package com.cg.inter;
interface Vehicle
{
	void speed();
	
}
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}
	
	@Override 
	public void engine()
	{
		System.out.println("Speed is 40km/hr");
		
	}
}

public class MainExample {

	public static void main(String[] args) {
		Bus engine = new Bus();
		engine

	}

}
