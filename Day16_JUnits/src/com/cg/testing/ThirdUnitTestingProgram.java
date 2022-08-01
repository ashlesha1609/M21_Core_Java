package com.cg.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;

public class ThirdUnitTestingProgram {
	
	@Test
	@DisplayName("Test is successfully implemented")
	void function()
	{
		//logger.info("hi");
		System.out.println("Want to Display a Name");
	}
	
	@Test
	@Disabled("Not implemented")
	void function1()
	{
		System.out.println("Fails");
	}

}
