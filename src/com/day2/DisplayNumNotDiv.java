package com.day2;

public class DisplayNumNotDiv {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for (i=1;i<=30;i++) {
			if (i%2==0|i%3==0|i%9==0) {
				continue;
			}
			else
			{
				System.out.println(i);
			}
			
			
		}

	}

}
