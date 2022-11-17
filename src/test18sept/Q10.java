package test18sept;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter sex");
		char sex=sc.next().charAt(0);
		System.out.println("enter marritial status");
		char mar=sc.next().charAt(0);
		if(sex=='f' ) {
			System.out.println("she will work only in urban areas");
		}
		else if(sex=='m' && age>20 && age<40) {
			System.out.println(" he may work in anywhere");
		}
		else if(sex=='m' && age<60 && age>20) {
			System.out.println("he will work in urban areas only.");
		}
		else {
			System.out.println("error");
		}
		
	}

}
//10.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//
//And any other input of age should print "ERROR".
