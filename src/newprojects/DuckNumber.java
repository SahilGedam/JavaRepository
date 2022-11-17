package newprojects;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;

		int r;
		int count = 0;
		while (num > 0 || num < 0) {
			r = num % 10;
			if (r == 0)
				count++;
			num = num / 10;

		}

		if (count > 0) {
			System.out.println("duck");
		} else {
			System.out.println("non duck");
		}

	}

}
