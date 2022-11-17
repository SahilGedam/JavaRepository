package mock;

import java.util.Scanner;

public class Bouncy1 {
void checkNumber(long number) {
	int countI=0,countDigit=0,countD=0;
	while(number>0) {
		int lastDigit=(int)number%10;
		if(number%10<lastDigit) {
			countI++;
			countDigit++;
			continue;
		}
		else if(number%10>lastDigit) {
			countD++;
			countDigit++;
			continue;
		}
		number=number/10;
	}
	if(countI==countDigit) {
		System.out.println("increasing number");
	}
	else if(countD==countDigit) {
		System.out.println("decreasing number");
	}
	else {
		System.out.println("bouncy number");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long number= sc.nextLong();
		Bouncy1 num = new Bouncy1();
		num.checkNumber(number);

	}

}
