package com.cg.finalKeyword;

class C
{
	//we can not override any final method
	//final void accept()
	void accept()
	{
		System.out.println("Hay there, i want provide restriction");
	}
}
class D extends C
{
	void accept()
	{
		System.out.println("Restriction Provided");
	}
}

public class FinalMethod {

	public static void main(String[] args)
	{
		D d=new D();
		d.accept();
	}

}
