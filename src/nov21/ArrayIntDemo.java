package nov21;

import java.util.*;

public class ArrayIntDemo {

	public static void main(String[] args) {

		int pos = 0;
		int neg = 0;
		int a[] = { 2, 3, 8, 65, 4, 5, 85, 32, 45, 63, };
		Arrays.sort(a);
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (input == a[i]) {
				pos = a[i + 1];
				neg = a[i - 1];
				// System.out.println(pos);
				// System.out.println(neg);
				int diff1 = a[i] - a[i + 1];
				int diff2 = a[i] + a[i - 1];
				if (diff1 > diff2) {
					System.out.println(pos);
				} else if (diff2 > diff1) {
					System.out.println(neg);
				} else {
					System.out.println(pos + " " + neg);
				}

			}
		}
		sc.close();

	}

}
