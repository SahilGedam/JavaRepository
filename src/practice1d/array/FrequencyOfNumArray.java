package practice1d.array;
import java.util.*;
public class FrequencyOfNumArray {
public static void main (String []args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter num");
	int num = sc.nextInt();
	int [] digitArray=new int [10];
	int r=0;
	while(num>0) {
		r=num%10;
		digitArray[r]++;
		num=num/10;
		
	}
	System.out.println("num freq");
	for(int count=0;count<digitArray.length;count++) {
		int digitCount = digitArray[count];
		if(digitCount!=0) {
			System.out.println(count + " "+ digitCount);
		}
	}
}
}
