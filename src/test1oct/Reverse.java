package test1oct;

import java.util.Arrays;

public class Reverse {
	public static void reverseArray(int a[]) {
		int j = a.length - 1;
		for (int i = 0; i < a.length / 2; i++) {
			int tem = a[i];
			a[i] = a[j];
			a[j] = tem;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 654, 94, 65, 45, 9852 };
		System.out.println(Arrays.toString(a));
		System.out.println();
		Reverse.reverseArray(a);
	}
}
