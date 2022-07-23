package com.cg.polymorphism;
//program on constructor overloading
class Tribet
{
	int speed;
	String engine;
	Tribet()
	{
		System.out.println("Renault kiger");
	}
	Tribet(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is:|speed| and the engine is on"+engine);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Tribet t=new Tribet();
		Tribet t1=new Tribet("45,Disel");
		
	}

}
