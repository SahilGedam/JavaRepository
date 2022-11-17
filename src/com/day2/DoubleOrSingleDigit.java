package com.day2;
import java.util.*;
public class DoubleOrSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if((num<10 && num>0) ||(num>-9 && num<0)) {
			System.out.println("single digit");
		}
		else if ((num<100 && num>9) ||(num>-100 && num<-9)) {
			System.out.println("double digit");
		}
		else if ((num<1000 && num>99) ||(num>-1000 && num<99)) {
			System.out.println("triple digit");
		}

	}

}
