package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SecondUnitTestingProgram 
{
	@Test
	void print()
	{
		System.out.println("Hello Students!");
	}
	
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("@BeforeEach-executes once before all the test methods in this class");
	}
	
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@BeforeAll-executes once before all the test methods in this class\"");
	 
	}
	
	@Test
	void print1()
	{
		System.out.println("Hello Folks!");
	}

}
