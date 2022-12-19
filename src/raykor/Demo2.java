package raykor;

import java.util.*;

public class Demo2 {
	public static void buzzFizz(int n) {
		int num = n;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("BuzzFizz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Demo2.buzzFizz(n);
	}

}
