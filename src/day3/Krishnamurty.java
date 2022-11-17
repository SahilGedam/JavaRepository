package day3;
import java.util.*;
public class Krishnamurty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num>0) {
		int r=num%10;
		int fact=1;
		for(int i=1;i<=r;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	System.out.println(sum);
	num=temp;
	if(num==sum) {
		System.out.println("krishnamurti");
	}
	else {
		System.out.println("non krishnamurtji");
	}
	}

}
