package homework;
import java.util.*;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int num =sc.nextInt();
int count=0;
while(num>0) {
	num=num/10;
	++count;
	
}
System.out.println(count);

	}

}
