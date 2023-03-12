package TestCases;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import Jprince.Calculator;

public class CalculatorTest {
	public static Calculator objscientificCalculator;
	@Before
	public void setUp() throws Exception {
		objscientificCalculator=new Calculator();
		
		System.out.println("createing obj for Class under test");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("closing the Test execjtion");
	}

	@Test
	public void testGetwishes() {
		
		String result=objscientificCalculator.getwishes();
		assertEquals("TC_GetWishes ","Hello world",result);
		
	}

	@Test
	public void testAddition() {
		int varResult_addition=objscientificCalculator.addition(15, 15);
		assertEquals("TC_Addition", 30,varResult_addition);
	}

	

}
