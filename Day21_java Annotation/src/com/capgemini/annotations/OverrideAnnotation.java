package com.capgemini.annotations;

class Car
{
	public void speed(int s)
	{
		System.out.println("Spedd is :"+5+"km/hr");
	}
}

class BMW extends Car
{
	public void speed(int str)
	{
		System.out.println("Speed is :"+str+"km/hr");
	}
}

public class OverrideAnnotation
{
	public static void main(String[] args) 
	{
		new b=new BMW();
		b.speed(60);

	}

}
