package com.cg.testing;

import static org.junit.Assert.assert






public class FifthUnitTestingProgram 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		//
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	@Test
	void falseAssumption()
	{
		String str="Ashlesha";
		assumingThat(str.equals("Ashu"));
		
	}
	
	

}
