package com.conditional;

public class NestedIfDemo2 {
	
	public static void main(String[] args) {
		
		// percentage >=65 : college admsn
		//   >=80 : science and comm stream
		//   <80: comm stream
		
		float per=57f;
		
		if(per>=65)
		{
			System.out.println("Eligible for college....");
			if(per>=80)
			{
				System.out.println("Can opt science and commerce stream");
			}
			
			else
			{
				System.out.println("Can opt commerce stream");
			}
		}
		
		else
		{
			System.out.println("Not Eligible for college....");
		}
		
	}

}
