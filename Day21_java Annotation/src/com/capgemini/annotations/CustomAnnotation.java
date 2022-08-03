package com.capgemini.annotations;
//custom annotation
@interface Custom
{
	//abstract method
	String print();
}
class B 
{
	@Custom (print="Hello students")
	public void display()
	{
		System.out.println("Hurrah! Its holiday");
	}
	
}
public class CustomAnnotation {

	public static void main(String[] args) {
		B n=new B();
		b.display();
		

	}

}
