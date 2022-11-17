package com.day2;

public class EvenNumsNotDiv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<21;i++) {
			if (i%2==0) {
				if(i%3==0) {
					break;
				}
				System.out.println(i);
			}
			
			
		}

	}

}
