package com.conditional;

public class LeapYear {

	public static void main(String[] args) {
		
		// divisible 4 and not divisible by 100
		// divisible by 400
		
	    int year=2024;
	    
	    if(((year%4==0)&&(year%100!=0))||(year%400==0))
	    {
	    	System.out.println("Leap year");
	    }
	    else
	    {
	    	System.out.println("Not a leap year");
	    }
	}
}

