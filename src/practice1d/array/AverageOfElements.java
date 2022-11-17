package practice1d.array;
import java.util.*;
public class AverageOfElements {
public static void average(int a[]) {
	int sum=0;
	int totalElements=a.length;
	for (int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	int avg=sum/totalElements;
	//System.out.println(totalElements);
	System.out.println(avg);
}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("enter int elements");
int a[]= new int[6];
for (int i=0;i<a.length;i++) {
	a[i]= sc.nextInt();
}
AverageOfElements.average(a);
	}

}
