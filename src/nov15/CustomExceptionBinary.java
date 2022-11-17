package nov15;

import java.util.*;

//import java.awt.*;
class InvalidBinaryException extends Throwable {
	InvalidBinaryException(String s) {
		super(s);
	}
}

public class CustomExceptionBinary {

	public static void checkBinary(int a) {

		int num = a;
		boolean isBinary = true;
		int copy = num;
		int r;
		while (num != 0) {
			r = num % 10;
			if (r > 1 || r < 0) {
				isBinary = false;
				break;
			}
			num = num / 10;
		}
//	if (isBinary==true) {
//		System.out.println("binary");
//	}
//	else if (isBinary==false) {
//		System.out.println("non binary");
//	}
		try {
			if (isBinary == true) {
				System.out.println("binary");

			} else if (isBinary == false) {
				System.out.println("non binary");
				throw new InvalidBinaryException("invalid binary exeption");
			}
		} catch (InvalidBinaryException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		CustomExceptionBinary.checkBinary(a);
	}

}
