package homework;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter year");
		Scanner sc=new Scanner(System.in);
		int year;
		year=sc.nextInt();
		if (year%4==0) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("non leap year");
		}

	}

}
