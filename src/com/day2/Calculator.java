package com.day2;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		char ch = 'j';
		
		System.out.print("enter a number");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		System.out.print("enter another number");
		
		b= sc.nextInt();
		
		
		System.out.print("enter the operation");
		
		ch= sc.next().charAt(0);
		
		switch (ch) {
		
		case'+' : System.out.print(a+b);
		break;
		case'-': System.out.print(a-b);
		break;
		case'*' : System.out.print(a*b);
		break;
		default : System.out.print("invalid input");
		
		
		}
		
		
		

	}

}
