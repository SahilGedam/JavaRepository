package test16oct;

import java.util.Scanner;

public class CheckReverseSum {
	public static boolean sumFandL(String s) {
		 boolean isValid = true;
		int sum =0;
		int sum2 = 0;
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z'))
			{
				isValid=false;
				break;
			}
		}
		
		
		if(isValid==true)
		{
			//System.out.println("numeric");
			int[] a = new int[ch.length];
			for (int i = 0; i < ch.length; i++) {
				a[i] = Character.getNumericValue(ch[i]);

			}
			for (int i = 0; i < 3; i++) {
				sum = sum + a[i];
			}
			for (int i = a.length - 1; i > a.length - 4; i--) {
				sum2 = sum2 + a[i];
			}
			System.out.println("sum of first 3 digits "+sum);
			System.out.println("sum of last 3 digits "+sum2);
			if (sum == sum2) {
				//System.out.println("valid string");
				 isValid= true;
			} else {
				
				//System.out.println("invalid string");
				 isValid =false;
			}

		}
		return isValid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  string");
		String s = sc.next();
		boolean ischeck=sumFandL(s);
		if(ischeck)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		//System.out.println(isValid);
	}

}
