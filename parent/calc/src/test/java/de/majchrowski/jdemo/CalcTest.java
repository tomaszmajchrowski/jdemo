package de.majchrowski.jdemo;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	public CalcTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCreSum() throws CalcException {

		Calc tCalc=new Calc();
		
		String testString="2,2";
		int retRes=tCalc.creSum(testString);
		int expectedRes=4;
		
		
		
		assertEquals(expectedRes, retRes);
	}
	
	public void testSyntaxCheckCreSum() throws CalcException {

		/*Calc tCalc=new Calc();
		
		String testString="2;2";
		int retRes=tCalc.creSum(testString);
		int expectedRes=4;
		
		assertEquals(expectedRes, retRes);*/
		
		Calc tCalc=new Calc();
		String testString="2;2";
		
		try {
			int retRes=tCalc.creSum(testString);
			fail( "Missing exception" );
		} catch( CalcException e ) {
		     assertEquals( "Unexpected token", e.getMessage() ); // Optionally make sure you get the correct message, too
		}
	}

}
