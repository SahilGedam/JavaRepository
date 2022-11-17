package test9oct;
import java.util.*;
//2.	WAP to create a array of 10 elements and swap first two elements with last two elements.
public class Q2Swap {
public static void swap(int[]a) {
	int temp1=0;
	temp1=a[0];
	a[0]=a[9];
	a[9]=temp1;
	int temp2=a[1];
	a[1]=a[8];
	a[8]=temp2;
	System.out.println(Arrays.toString(a));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Q2Swap.swap(a);
	}

}
