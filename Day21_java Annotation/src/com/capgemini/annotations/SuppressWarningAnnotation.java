package com.capgemini.annotations;
class Animal
{
	Animal()
	{
		System.out.println("Roars");
	}
	/*public void sound()
	{
		System.out.println("Lion");
	}*/
	
}

public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//
		Animal a=new Animal();

	}

}
