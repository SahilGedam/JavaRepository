package oct12;
import java.util.*;
public class AvgOfDigits {
public static void avg(String s) {
	double sum=0;
	double count =0;
	char []ch = s.toCharArray();
	int []a= new int[ch.length];
	//System.out.println(Arrays.toString(ch));
	for (int i=0;i<ch.length;i++) {
		a[i]= Character.getNumericValue(ch[i]);
	}
	//System.out.println(Arrays.toString(a));
	for (int i=0; i<a.length;i++) {
		sum=sum+a[i];
		count++;
	}
	double avg = sum/count;
	System.out.println(avg);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("enter int string");
String s= sc.next();
avg(s);
	}

}
