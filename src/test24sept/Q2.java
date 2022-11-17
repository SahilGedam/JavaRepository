package test24sept;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=1;
System.out.println("enter number");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
for(int i =0;i<=num;i++) {
	sum=sum+i;
}
System.out.println(sum);
	}

}
