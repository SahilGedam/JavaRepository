package raykor;

import java.util.*;

public class Demo3 {
	public static void countScore(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int score = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 || a[i] == 0) {
				score = score + 1;
			} else if (a[i] % 2 != 0 && a[i] != 5) {

				score = score + 3;
			} else if (a[i] == 5) {
				score = score + 5;
			}
		}
		System.out.println(score);
		System.out.println("do you want to continue");

		String ch = sc.next();
		if (ch.equals("yes")) {
			Demo3.countScore(a);
		} else {
			System.out.println("thank you");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array elements");

		int[] a = new int[5];

		Demo3.countScore(a);

	}

}
