package com.cg.inter;
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Daughter implements Mother,Father
{
	@Override
	public void display()
	{
		System.out.println("My Mother name is Jyoti");
	}
	
	@Override
	public void display()
	{
		System.out.println("My Father name is Lalasaheb");
	}
	
}


public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.display();
		d.print();

	}

}
