package newprojects;
import java.util.*;
public class SumOfFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		

int sum=0;
int num1=num%10;
while(num>=10) {
	num=num/10;
}
int num2= num;
sum= num1+num2;
System.out.println(sum);

	}

}
