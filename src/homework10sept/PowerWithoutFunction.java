package homework10sept;

import java.util.Scanner;

public class PowerWithoutFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. WAP to calculate x y where x is base and y is index without using
		// readymade function.
		int x;
		int y;
		int ans = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		x = sc.nextInt();
		System.out.println("enter y");
		y = sc.nextInt();
		for (int p = y; p != 0; p--) {
			ans = ans * x;
		}
		System.out.println(ans);
	}

}
