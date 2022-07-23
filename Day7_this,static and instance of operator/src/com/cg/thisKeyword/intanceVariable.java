package com.cg.thisKeyword;

class Fruit
{
	private String str;
	private String str1;
	void accept(String str,String str1)
	{
		this.str=str;
		this.str1=str1;
	}
	void display()
	{
		System.out.println("The first string is:"+str);
		System.out.println("The second string is:"+str1);
	}
}


public class intanceVariable {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.accept("Ashlesha","Ashvini");
		f.display();
		

	}

}
