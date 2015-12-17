package de.majchrowski.jdemo;

import java.util.ArrayList;

public class Calc {
	
	public Calc() {
		   
		}
	
	public int creSum(String inputStr) {
		
		///ArrayList<int> outList = new parseInput<int>();
		String[] aList= inputStr.split(",");
		
		/*outList=inpurStr.split(',');
		
		for ()
		def sum=0;
		list.forEach(sum+it );
		*/
		int sum=0;
		for(String subStr : aList) {
	        sum=sum+Integer.parseInt(subStr);
	    }
		return sum;
	}

}
