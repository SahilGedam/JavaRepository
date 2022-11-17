package newprojects;

import java.util.Scanner;

public class PrimeNumContinues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
			char ch;
		
		do
		{
		System.out.println("enter number");
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
		System.out.println("Tou want to continue");

		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
	}

}
