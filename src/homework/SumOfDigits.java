package homework;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter number");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
while(num>0) {
	int r =num%10;
	sum=sum+r;
	num=num/10;
}
System.out.println(sum);
	}

}
