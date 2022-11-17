package homework;
import java.util.*;
public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a 3 digit number only");
Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		int copy=num;
		int a;
		int b;
		int c;
		 a= num/100;
		 b= (num%100)/10;
		 c= num%10;
		
		int Amstrong= ((a*a*a)+(b*b*b)+(c*c*c));
		if(copy==Amstrong) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("non amstrong number");
		}
		}
	
	}


