package day3;
import java.util.*;
public class SumOfEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter charachter");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int r=num%10;
		//	if(r%2!=0) {
		//		continue;
		//	}
			if(r%2==0) {
				sum=sum+r;
				
			}
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
