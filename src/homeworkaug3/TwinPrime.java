package homeworkaug3;

import java.util.*;

public class TwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter number2");
		int num2 = sc.nextInt();
		int i = 2;
		int count = 0;
		int j = 2;
		int counter = 0;
		boolean diffrence2 = true;
		boolean isPrime = true;
		boolean isPrime2 = true;

		// diffrence of two
		if (num1 - num2 == 2 || num2 - num1 == 2) {
			diffrence2 = true;
		} else {
			diffrence2 = false;
		}

		// num 1 is prime
		while (i < num1) {
			if (num1 % i == 0) {

				count++;
				break;
			}
			i++;
		}
		if (count == 0) {
			isPrime = true;
		} else {
			isPrime = false;
		}

		// num 2 is prime
		while (j < num2) {
			if (num2 % j == 0) {

				count++;
				break;
			}
			j++;
		}
		if (count == 0) {
			isPrime2 = true;
		} else {
			isPrime2 = false;
		}

		// if all conditions are true
		if (isPrime == true && isPrime2 == true && diffrence2 == true) {
			System.out.println("twin prime");
		} else {
			System.out.println("non twin prime");
		}
	}
}
