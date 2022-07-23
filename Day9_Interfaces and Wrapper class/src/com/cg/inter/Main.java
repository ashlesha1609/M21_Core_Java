package com.cg.inter;

public interface Main
{
	void display();
}

class Demo implements inf
{
	@Override
	public void display()
	{
		System.out.println("Interface");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		{
			Demo d=new Demo();
			d.display();
			
		}

	}

}
