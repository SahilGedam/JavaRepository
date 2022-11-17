package test18sept;

import java.util.Scanner;

public class Q2Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<=400;i++) {
			int a=i;
			boolean ans=true;
			while(a>0) {
				int r= a%10;
				if(a%2!=0) {
					ans=false;
					break;
				}
				a=a/10;
				
			}
			if(ans==true) {
				System.out.println(i);
			}
		}
	}

}
