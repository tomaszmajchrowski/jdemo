package de.majchrowski.jdemo;

import junit.framework.TestCase;

public class MathTest extends TestCase {

	public MathTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testIsEven() {
		int sampleB=4;
		Math calc=new Math();
		boolean resB=calc.isEven(sampleB);
		assertTrue("4 is not even", resB);
	}
	public void testIsNotEven() {
		int sampleA=5;
		Math calc=new Math();
		boolean resA=calc.isEven(sampleA);
		assertFalse("5 is not even", resA);
	}


}
