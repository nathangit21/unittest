package casetools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplyClassTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testmultiply()
	{
		multiplyClass objadd= new multiplyClass();
		int expected =8;
		int actual=objadd.multiplyTwoNum(2, 2, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testmultiply1()
	{
		multiplyClass objadd= new multiplyClass();
		int expected =2;
		int actual=objadd.divideTwoNum(4, 2);
		
		assertEquals(expected, actual);
	}

}
