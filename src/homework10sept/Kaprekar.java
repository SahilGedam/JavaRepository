package homework10sept;

import java.util.Scanner;

public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int dig=0;
		int sqr=num*num;
		int p=sqr;
		int sum=0;
		while(sqr>0) {
			count++;
			sqr=sqr/10;
		}
		int k =(int)Math.pow(10,count/2);
		while(p>0) {
			sum=sum+p%k;
			p=p/k;
		}
		if(num==sum) {
			System.out.println("kaprekar");
		}
		else {
			System.out.println("no kaprekar");
		}
	}

}
