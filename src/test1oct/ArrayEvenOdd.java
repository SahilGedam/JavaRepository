package test1oct;

import java.util.*;

//  create a Array of integer and count the number of even  and odd elements from array.
//complete
public class ArrayEvenOdd {
	static void evenNum(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				count++;

				System.out.print(a[i] + " ");

			}

		}
		System.out.println();
		System.out.println("count of even is " + count);

	}

	static void oddNum(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				count++;

				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.println("count of odd is " + count);
	}

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 6, 7, 8, 1, 20, };
		System.out.print("even nums are ");
		ArrayEvenOdd.evenNum(a);
		System.out.println();
		System.out.print("odd nums are ");
		ArrayEvenOdd.oddNum(a);
	}

}
