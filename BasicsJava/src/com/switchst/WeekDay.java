package com.switchst;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the weekday number(1-7):");
		
		int weekNo= sc.nextInt();
		
		switch(weekNo)
		{
		case 1: System.out.println("Monday");
		        break;
		case 2:System.out.println("Tuesday");
		       break; 
		case 3: System.out.println("Wednesday");
		        break;
		case 4: System.out.println("Thursday");
		        break;
		case 5: System.out.println("Friday");
		        break; 
		/*default: System.out.println("error in input");  
		         break;*/ // not recommended
		case 6: System.out.println("Saturday");
		        break;
		case 7: System.out.println("Sunday");
		        break;
		default: System.out.println("error in input"); 
			
		}
		
		System.out.println("Welcome to this beautiful day");
		
		sc.close();
		
	}
}