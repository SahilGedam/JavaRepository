package sept26;

import java.util.Scanner;

//completed
public class AvgNonPrime {
	public static int avgNPrime(int a[]) {
		int sum = 0;

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			boolean isPrime = true;

			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isPrime = false;
					count++;
					break;

				}
			}
			if (isPrime == false) {
				sum = (sum + a[i]);
			}

		}
		int avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int elements");
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(AvgNonPrime.avgNPrime(a));

	}

}
