package com.day2;
import java.util.*;

public class DaySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daynumber;
		System.out.print("enter day number");
		
		Scanner sc = new Scanner(System.in);
		daynumber = sc.nextInt() ;
	
		
		switch(daynumber)
		{
		case 1 : System.out.print("monday");
		break;
		case 2 : System.out.print("tuesday");
		break;
		case 3 : System.out.print("wednesday");
		break;
		case 4 : System.out.print("thrusday");
		break;
		case 5 : System.out.print("friday");
		break;
		case 6 : System.out.print("satday");
		break;
		case 7 : System.out.print("sunday");
		break;
		
		}
		
				
		
		
		
		
		

	}

}
