package com.day2;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		
		System.out.print("enter your age");
		Scanner sc1 = new Scanner(System.in);
		a = sc1.nextInt();
		System.out.print("enter your friends age");
		Scanner sc2 = new Scanner(System.in);
		b = sc2.nextInt();
		
		if (a<b) {
			System.out.print("hii");
		}
		else if (b<a) {
			System.out.print("hello");
		}
		else if (a==b) {
			System.out.print("hiiHello");
					
		}

	}

}
