package homework;
import java.util.*;
public class MarksAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double d;
		double e;
		System.out.println("enter marks of 5 subjects");
		Scanner sc= new Scanner(System.in);
	
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();
		d= sc.nextDouble();
		e= sc.nextDouble();
				double total;
				double average;
				double percentage;
				
				total=a+b+c+d+e;
				average=total/5;
				percentage=(total/500)*100;
				
				System.out.println(total);
				System.out.println(average);
				System.out.println(percentage);
				

	}

}
