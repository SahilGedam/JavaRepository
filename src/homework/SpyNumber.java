package homework;
import java.util.*;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter number");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
int product=1;
int r=0;
int count=0;
while(num>0) {
	r=num%10;
	sum=sum+r;
	product=product*r;
	num=num/10;
	
	
}
if(product==sum) {
	System.out.println("spy");
}
else {
	System.out.println("not spy");
	
}

	}

}
