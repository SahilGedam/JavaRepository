package sept26;

import java.util.*;

public class ArrayMinInt {
public static int MinInt(int a[]) {
	
	int min = Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
		
	}
	return min;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int elements");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(ArrayMinInt.MinInt(a));

	}

}
