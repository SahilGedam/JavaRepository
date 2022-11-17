package sept26;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
public static int [] sortArray(int a[]) {
	for (int i=0;i<a.length;i++) {
		for(int j = i+1; j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int elements");
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(sortArray(a)));
	}

}
