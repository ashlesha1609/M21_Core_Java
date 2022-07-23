package com.cg.thisKeyword;
//2.this keywprd can be passed as an argument in the constructor call
class A
{
	public int a;
	/*A()
	{
		
	}*/
	A(int a)
	{
		this.a=a;
	}
}
public class constructorArgument {

	public static void main(String[] args) {
		A obj=new A(5);
		System.out.println("The value of a is:"+obj.a);

	}

}
