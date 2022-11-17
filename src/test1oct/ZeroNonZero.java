package test1oct;

import java.util.Arrays;

//6) Write a  program to separate zeros from non-zeros in an integer array?
public class ZeroNonZero {
//complete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int a[] = { 12, 0, 7, 0, 8, 0, 3 };
//		int p = a.length;
//System.out.println(p);
//		int j[] = new int[p];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;

			}

		}
		while (count < a.length) {
			a[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(a));

	}

}
