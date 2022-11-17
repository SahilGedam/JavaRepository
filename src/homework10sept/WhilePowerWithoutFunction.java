package homework10sept;

import java.util.Scanner;

public class WhilePowerWithoutFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int ans = 1;
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		x = sc.nextInt();
		System.out.println("enter y");
		y = sc.nextInt();
		p = y;
		while (p != 0) {
			ans = ans * x;
			p--;
		}
		System.out.println(ans);
	}

}
