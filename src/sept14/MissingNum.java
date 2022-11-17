package sept14;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 6 num in order of 1 to 7");
		Scanner sc= new Scanner(System.in);
		int num=0;
		int sum=0;
		int totalsum=0;
		//for user input number
		for (int i=1;i<=6;i++) {
			 num= sc.nextInt();
			  
				sum=sum+num;
		}
		
		System.out.println(sum);
		for (int i=1;i<=7;i++) {
			totalsum=totalsum+i;
		}
		System.out.println("totalsum "+totalsum);
		System.out.println("missing number is "+(totalsum-sum));
		
	}

}
