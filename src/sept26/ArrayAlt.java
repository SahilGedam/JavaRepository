package sept26;

import java.util.Scanner;

public class ArrayAlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		System.out.println("enter elements in int value");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i += 2) {

			System.out.println(a[i]);

		}
	}

}
