package com.day2;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		int count=0;
		
		while(i<num) {
			if (num%i==0) {
				
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}

}
