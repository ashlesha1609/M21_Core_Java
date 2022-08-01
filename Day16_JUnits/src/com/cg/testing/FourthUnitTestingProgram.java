package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram 
{
	@Test
	void display()
	{
		int arr[]= {1,2,3,4,5};
		//assertEquals method will check whether the two parameter value are same or not
		//if it is same then you will not get any failures otherwise you will get failures 
		assertAll("arr",()->assertEquals(arr[2],1),
				());
	}

}
