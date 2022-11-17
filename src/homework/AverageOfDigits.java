package homework;
import java.util.*;
public class AverageOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int count=0;
int r;
int sum=0;
int average;
System.out.println("enter number");
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
//sum of digits
while(num>0) {
	r=num%10;
	sum=sum+r;
	num=num/10;
	count++;
}
System.out.println(sum/count);
	}

}
