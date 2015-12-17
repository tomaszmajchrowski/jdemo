package de.majchrowski.jdemo;

public class Calc {
	
	public int creSum(String inputStr) throws CalcException {
		
		String[] aList= inputStr.split(",");
		
		int sum=0;
		for(String subStr : aList) {

			try {
				sum=sum+Integer.parseInt(subStr);
			}
			catch (NumberFormatException e ) {
				CalcException parseIssue= new CalcException("Unexpected token");
				throw parseIssue;
			}
	    }
		return sum;
	}

}
