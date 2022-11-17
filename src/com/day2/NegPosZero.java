package com.day2;
import java.util.*;

public class NegPosZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.print("enter number");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a==0)
		{
			System.out.print("number is zero");
			
		}
		else if (a<0)
		{
			System.out.print("number is negative");
			
		}
		else 
		{
			System.out.print("number is positive");
		}
				

	}

}
