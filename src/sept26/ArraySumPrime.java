package sept26;

import java.util.Scanner;

public class ArraySumPrime {
	public static int primeSum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			boolean isPrime = true;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime == true) {
				sum = sum + a[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int elements");
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(ArraySumPrime.primeSum(a));
	}

}
