package day3;
import java.util.*;
public class BinaryToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
	
		int p=0;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int power=(int)(Math.pow(2, p));
			int multi= power*digit;
			sum=sum+multi;
			p++;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
